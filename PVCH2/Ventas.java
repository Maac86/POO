
/**
 * Write a description of class Ventas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Ventas
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numeroChaquetas = 0, opcionMenu = 0;
        Chaquetas[] lasChaquetas = new Chaquetas[50];
        String referencia, nombre, categoria;
        double mes1, mes2, mes3;
        double promedio = 0;
        while(opcionMenu != 3){
            System.out.println("\nMenu de Opciones: ");
            System.out.println("1. Registrar una venta: ");
            System.out.println("2. Calcular promedio de ventas por modelo: ");
            System.out.println("3. Salir ");
            System.out.println("Escoja una opcion.... ");
            opcionMenu = sc.nextInt();
            if(opcionMenu== 1){
                System.out.println("Ingrese la referencia de la chaqueta: ");
                referencia = sc.next();
                System.out.println("Ingrese el nombre de la chaqueta:  ");
                nombre = sc.next();
                System.out.println("Ingrese la categoría de la chaqueta: ");
                categoria = sc.next();
                System.out.println("Ingrese el valor correspondiente al mes1: ");
                mes1 = sc.nextDouble();
                System.out.println("Ingrese el valor correspondiente al mes2: ");
                mes2 = sc.nextDouble();
                System.out.println("Ingrese el valor correspondiente al mes3: ");
                mes3 = sc.nextDouble();
                Chaquetas unaChaquetas = new Chaquetas(referencia, nombre, categoria,mes1,mes2,mes3);
                lasChaquetas[numeroChaquetas] = unaChaquetas;
                numeroChaquetas++;
            }
            else if(opcionMenu==2){
                for(int i = 0; i < numeroChaquetas; i++){
                    promedio = promedio + lasChaquetas[i].PromedioVentas() / numeroChaquetas;       
                }
                System.out.println("\n El Promedio de ventas de las chaquetas en el mes es: "+ promedio);
            }
        }
    
    }

}