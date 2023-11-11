import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
      
        Scanner lector = new Scanner(System.in);
        System.out.print("Cuantos elementos enteros va a ingresar?");
      
        int cantidadElementos = lector.nextInt();
        //int Arreglo[] = {84,21,47,96,15};
        int Arreglo[] = new int[cantidadElementos];
        System.out.println("Ingrese los " + cantidadElementos + " elementos:");
      
        for (int i = 0; i < Arreglo.length; i++) {
            Arreglo[i] = lector.nextInt();
        }
      
        System.out.println("Ingreso de datos finalizado.");
        System.out.print("Que elemento desea buscar? ");
        int buscado = lector.nextInt();
        int hallado = busquedaLineal(Arreglo, Arreglo.length, buscado);
      
        if (hallado != -1) {
            System.out.println("El valor " + buscado + " fue encontrado en la posicion " + hallado);
        } else {
            System.out.println("El valor " + buscado + " no fue encontrado.");
        }
        lector.close();
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
