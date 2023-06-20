
/**
 * Write a description of class Venta_Chaquetas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class CalcularPromedioVentas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el modelo de chaqueta:");
        String modeloChaqueta = sc.nextLine();
        
        System.out.println("Ingrese el periodo de tiempo:");
        String periodoTiempo = sc.nextLine();
        
        System.out.println("Ingrese la cantidad de ventas:");
        int cantidadVentas = sc.nextInt();
        
        int sumaVentas = 0;
        for (int i = 1; i <= cantidadVentas; i++) {
            System.out.print("Ingrese la venta número " + i + ": ");
            int venta = sc.nextInt();
            sumaVentas += venta;
        }
        
        double promedioVentas = sumaVentas / (double) cantidadVentas;
        
        System.out.println("El promedio de ventas para el modelo de chaqueta " + modeloChaqueta + 
                           " en el periodo de tiempo " + periodoTiempo + " es: " + promedioVentas);
        
        sc.close();
    }
}

