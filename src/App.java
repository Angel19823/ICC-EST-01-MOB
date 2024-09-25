public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        MetodoBurbuja metodosOrdenamiento = new MetodoBurbuja();

        int[] arreglo = {5, 7, 30, 12, 9};
        int[] arregloOrdenado = metodosOrdenamiento.sortByBubble(arreglo);
        metodosOrdenamiento.printArreglo(arregloOrdenado);
        System.out.print("\n -- -- -- \n");
        int[] arregloOrdenadoDesendente = metodosOrdenamiento.sortByBubbleDesendente(arreglo);
        metodosOrdenamiento.printArreglo(arregloOrdenadoDesendente);

        //Ordenar las palabras alfabeticamente de la cadena de texto:
        String cadena= "este es un ejemplo de texto para Ordenar";
        String [] palabras= cadena.split(" ");
        String [] palabrasOrdenadas= metodosOrdenamiento.sortByBubble(palabras);

        metodosOrdenamiento.printArreglo(palabrasOrdenadas);
    }
}