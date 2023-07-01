
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
        Empaque miEmpaque = new Empaque("","","");
        String referencia, nombre, categoria;
        double mes1, mes2, mes3;
        double promedio = 0;
        int opcionMenu = 0;
        
        do{
            System.out.println("\nMenu de Opciones");
            System.out.println("[1]- Adicionar Chaqueta Tienda: ");
            System.out.println("[2]- Adicionar Chaqueta Internet: ");
            System.out.println("[3]- Calcular Promedio Ventas ");
            System.out.println("[4]- Salir \n");
            System.out.println("Escoja una Opcion: ");
            opcionMenu = sc.nextInt();
            switch(opcionMenu){
                case 1:
                        sc.nextLine();
                        System.out.println("Digite la Referencia de la Chaqueta: ");
                        referencia = sc.next();
                        System.out.println("Digite el nombre de la Chaqueta: ");
                        nombre = sc.next();
                        System.out.println("Digite la Categoria de la Chaqueta: ");
                        categoria = sc.next();
                        System.out.println("Digite las ventas del mes1: ");
                        mes1 = sc.nextDouble();
                        System.out.println("Digite las ventas del mes2: ");
                        mes2 = sc.nextDouble();
                        try{
                            miEmpaque.adicionarChaquetas(referencia, nombre, categoria, mes1, mes2);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 2:
                        sc.nextLine();
                        System.out.println("Digite la Referencia de la chaqueta: ");
                        referencia = sc.next();
                        System.out.println("Digite el Nombre de la Chaqueta: ");
                        nombre = sc.next();
                        System.out.println("Digite la Categoria de la Chaqueta: ");
                        categoria = sc.next();
                        System.out.println("Digite las ventas del mes1: ");
                        mes1 = sc.nextDouble();
                        System.out.println("Digite las ventas del mes2: ");
                        mes2 = sc.nextDouble();            
                        System.out.println("Digite las ventas del mes3: ");
                        mes3 = sc.nextDouble();
                        try{                        
                        miEmpaque.adicionarChaquetas(referencia, nombre, categoria, mes1, mes2, mes3);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                        
                case 3:
                        sc.nextLine();
                        promedio = miEmpaque.PromedioVentas();
                        System.out.println("\n El promedio general de ventas es: " + promedio); 
                        break;
                default:
                        System.out.println("Ha Seleccionado Salir");
                        
            }
        }while(opcionMenu != 5);
    }
}