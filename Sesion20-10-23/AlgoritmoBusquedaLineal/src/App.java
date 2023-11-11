public class App {
    public static void main(String[] args) throws Exception {
        
        int Arreglo[] = {84,21,47,96,15};
        int buscado = 100;        
        int hallado = busquedaLineal(Arreglo, Arreglo.length, buscado);
        
        if (hallado != -1) {
            System.out.println("El valor " + buscado + " fue encontrado en la posicion " + hallado);
        } else {
            System.out.println("El valor " + buscado + " no fue encontrado.");
        }
    }
    
    public static int busquedaLineal(int A[], int n, int buscado){
        int indice = 0;
        while (indice < n) {
            if (A[indice] == buscado) {
                return indice;
            }
            indice++; //indice = indice + 1;
        }
        return -1;
    }
}
