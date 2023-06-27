
/**
 * Write a description of class Ventas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Ventas{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int numChaquetas;
        Chaquetas[] lasChaquetas = new Chaquetas[50];
        String referencia, nombre, categoria;
        double mes1, mes2, mes3;
        double promedio = 0;
        
        System.out.println("Digite el numero de Chaquetas: ");
        numChaquetas = sc.nextInt();
        
        for(int i = 0; i < numChaquetas; i++){
            System.out.println("Digite la referencia de la Chaqueta: ");
            referencia = sc.next();
            System.out.println("Digite el nombre de la Chaqueta: ");
            nombre = sc.next();
            System.out.println("Digite la categoria de la Chaqueta: ");
            categoria = sc.next();
            System.out.println("Digite el valor del mes1: ");
            mes1 = sc.nextDouble();
            System.out.println("Digite el valor del mes2: ");
            mes2 = sc.nextDouble();            
            System.out.println("Digite el valor del mes3 ");
            mes3 = sc.nextDouble();
            Chaquetas unaChaquetas = new Chaquetas(referencia, nombre, categoria, mes1, mes2, mes3);
            lasChaquetas[i] = unaChaquetas;
        }
        for(int i = 0; i < numChaquetas; i++)
            promedio = promedio + lasChaquetas[i].PromedioVentas() / numChaquetas;
        
        System.out.println("\n El promedio de ventas de las chaquetas: " + promedio); 
    }
}