
/**
 * Write a description of class Chaquetas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Ventas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroChaquetas;
        Chaqueta[] chaquetas = new Chaqueta[50];
        String referencia, nombre, categoria;
        int ventas;
        int totalVentas = 0;

        System.out.println("Digite la cantidad de chaquetas: ");
        numeroChaquetas = sc.nextInt();

        for (int i = 0; i < numeroChaquetas; i++) {
            System.out.println("Digite la referencia del modelo de chaqueta: ");
            referencia = sc.next();
            System.out.println("Digite el nombre del modelo de chaqueta: ");
            nombre = sc.next();
            System.out.println("Digite la categoría de la chaqueta: ");
            categoria = sc.next();
            System.out.println("Digite el número de ventas para este modelo de chaqueta: ");
            ventas = sc.nextInt();
            Chaqueta chaqueta = new Chaqueta(referencia, nombre, categoria, ventas);
            chaquetas[i] = chaqueta;
            totalVentas += ventas;
        }

        double promedioVentas = (double) totalVentas / numeroChaquetas;
        System.out.println("El promedio de ventas de chaquetas es: " + promedioVentas);
    }
}

class Chaqueta {
    String referencia;
    String nombre;
    String categoria;
    int ventas;

    public Chaqueta(String referencia, String nombre, String categoria, int ventas) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.categoria = categoria;
        this.ventas = ventas;
    }
}

