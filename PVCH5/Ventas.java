
/**
 * Write a description of class Ventas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Ventas{
    public static void main(String Args[]) throws Exception{
        Scanner sc = new Scanner(System.in);        
        Empaque miempaque = new Empaque(""," ","");
        String referencia, nombre, categoria;
        
        double promedio = 0;
        
        System.out.println("Digite el numero de Chaquetas de tienda: ");
        int numChaquetas1 = sc.nextInt();
        for(int i = 0; i < numChaquetas1; i++){
            double mes1, mes2;
            System.out.println("Digite la referencia de la Chaqueta: ");
            referencia = sc.next();
            System.out.println("Digite el nombre de las Chaquetass: ");
            nombre = sc.next();
            System.out.println("Digite la categoria de la Chaquetas: ");
            categoria = sc.next();
            System.out.println("Digite las ventas del mes1: ");
            mes1 = sc.nextDouble();
            System.out.println("Digite las ventas del mes2: ");
            mes2 = sc.nextDouble();            
            miempaque.adicionarChaquetaTienda(referencia, nombre, categoria, mes1, mes2);
        }
                
        System.out.println("Digite el numero de Chaquetas internet: ");
        int numChaquetas2 = sc.nextInt();
        for(int i = 0; i < numChaquetas2; i++){
            double mes1, mes2, mes3;
            System.out.println("Digite la Referencia de la Chaqueta: ");
            referencia = sc.next();
            System.out.println("Digite el nombre de la Chaquetas: ");
            nombre = sc.next();
            System.out.println("Digite la categoria de la Chaquetas: ");
            categoria = sc.next();
            System.out.println("Digite las ventas del mes1: ");
            mes1 = sc.nextDouble();
            System.out.println("Digite las ventas del mes2: ");
            mes2 = sc.nextDouble();            
            System.out.println("Digite las ventas del mes3: ");
            mes3 = sc.nextDouble();
            miempaque.adicionarChaquetaInternet(referencia, nombre, categoria, mes1, mes2, mes3);
        }
        
        promedio = miempaque.calcularPromedioGeneral();
        System.out.println("\n El promedio de ventas es: " + promedio); 
    }
}

