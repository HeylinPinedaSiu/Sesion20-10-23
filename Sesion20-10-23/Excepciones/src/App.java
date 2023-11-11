import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) 
    
        try {
            int resultado = dividir();
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
            System.out.println("No se logra completar la divison.");
        }
    }

    public static int dividir(){
        try {
            int x = pedirEntero();
            int y = pedirEntero();
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            return x/y;
            
        } catch (ArithmeticException e) {
            throw new ArithmeticException("La division entre cero no esta definida");
            
        } catch (NoSuchElementException e){
            throw new NoSuchElementException("Entrada incorrecta");
        }
    }
    
    public static int pedirEntero(){
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese un valor entero: ");
        while (true) {
            
            try {
                return lector.nextInt();
            } catch (InputMismatchException e) {
                lector.nextLine(); //insertara un salto de linea
                System.out.println("Ingrese un valor entero (0 - 9)");
            }
        }
    }
}
