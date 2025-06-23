// ABB en formato recursivo. 
package contenedores;

//Todavia no lo tengo conectado a los otros tipos de clases que pide 
public class ArbolBinarioRecursivo {

    // Clase interna Nodo
    static class Nodo {
        int dato;
        Nodo izquierda, derecha;

        public Nodo(int dato) {
            this.dato = dato;
            izquierda = null;
            derecha = null;
        }
    }

    // Clase interna Arbol
    static class Arbol {
        Nodo raiz;

        public Arbol() {
            raiz = null;
        }

        // -----------------------------
        // Métodos para insertar
        public void insertar(int dato) {
            raiz = insertarDesde(raiz, dato);
        }

        private Nodo insertarDesde(Nodo actual, int dato) {
            if (actual == null) return new Nodo(dato);

            if (dato < actual.dato)
                actual.izquierda = insertarDesde(actual.izquierda, dato);
            else if (dato > actual.dato)
                actual.derecha = insertarDesde(actual.derecha, dato);

            return actual;
        }

        // -----------------------------
        // Métodos para buscar
        public boolean buscar(int dato) {
            return buscarDesde(raiz, dato);
        }

        private boolean buscarDesde(Nodo actual, int dato) {
            if (actual == null) return false;
            if (dato == actual.dato) return true;

            if (dato < actual.dato)
                return buscarDesde(actual.izquierda, dato);
            else
                return buscarDesde(actual.derecha, dato);
        }

        // -----------------------------
        // Recorridos
        public void mostrarInorden() {
            System.out.print("Inorden: ");
            recorrerInorden(raiz);
            System.out.println();
        }

        private void recorrerInorden(Nodo actual) {
            if (actual != null) {
                recorrerInorden(actual.izquierda);
                System.out.print(actual.dato + " ");
                recorrerInorden(actual.derecha);
            }
        }

        public void mostrarPreorden() {
            System.out.print("Preorden: ");
            recorrerPreorden(raiz);
            System.out.println();
        }

        private void recorrerPreorden(Nodo actual) {
            if (actual != null) {
                System.out.print(actual.dato + " ");
                recorrerPreorden(actual.izquierda);
                recorrerPreorden(actual.derecha);
            }
        }

        public void mostrarPostorden() {
            System.out.print("Postorden: ");
            recorrerPostorden(raiz);
            System.out.println();
        }

        private void recorrerPostorden(Nodo actual) {
            if (actual != null) {
                recorrerPostorden(actual.izquierda);
                recorrerPostorden(actual.derecha);
                System.out.print(actual.dato + " ");
            }
        }

        // -----------------------------
        // Eliminar
        public void eliminar(int dato) {
            raiz = eliminarDesde(raiz, dato);
        }

        private Nodo eliminarDesde(Nodo actual, int dato) {
            if (actual == null) return null;

            if (dato < actual.dato) {
                actual.izquierda = eliminarDesde(actual.izquierda, dato);
            } else if (dato > actual.dato) {
                actual.derecha = eliminarDesde(actual.derecha, dato);
            } else {
                // Caso 1: sin hijos
                if (actual.izquierda == null && actual.derecha == null)
                    return null;

                // Caso 2: un solo hijo
                if (actual.izquierda == null)
                    return actual.derecha;
                else if (actual.derecha == null)
                    return actual.izquierda;

                // Caso 3: dos hijos
                int sucesor = encontrarMinimo(actual.derecha);
                actual.dato = sucesor;
                actual.derecha = eliminarDesde(actual.derecha, sucesor);
            }

            return actual;
        }

        private int encontrarMinimo(Nodo actual) {
            while (actual.izquierda != null) {
                actual = actual.izquierda;
            }
            return actual.dato;
        }
    }

    // -----------------------------
    // Método main para prueba
    public static void main(String[] args) {
        Arbol arbol = new Arbol();

        int[] datos = {25, 36, 37, 48, 49, 50, 65, 67, 87, 90};
        for (int dato : datos) {
            arbol.insertar(dato);
        }

        // Mostrar recorridos antes de eliminar
        System.out.println("Recorridos antes de eliminar:");
        arbol.mostrarInorden();
        arbol.mostrarPreorden();
        arbol.mostrarPostorden();

        // Eliminar valores
        arbol.eliminar(49);
        arbol.eliminar(50);

        // Mostrar recorridos después de eliminar
        System.out.println("\nRecorridos después de eliminar 49 y 50:");
        arbol.mostrarInorden();
        arbol.mostrarPreorden();
        arbol.mostrarPostorden();
    }
}
