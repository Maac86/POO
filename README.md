## Promedio de Ventas de chaquetas
Este proyecto consiste en una aplicación Java que permite calcular el promedio de ventas de un determinado modelo de chaqueta en un periodo de tiempo específico.

### Instrucciones de Uso
* Ejecute la aplicación Java.
* Ingrese el modelo de chaqueta.
* Ingrese el periodo de tiempo.
* Ingrese la cantidad de ventas realizadas durante ese periodo.
* Ingrese el valor de cada venta.
* La aplicación calculará el promedio de ventas y lo mostrará en pantalla.

### Código Fuente
~~~
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
~~~

### Requisitos del Sistema
* Java Development Kit (JDK) instalado en el equipo.

#### Contribuciones
Las contribuciones a este proyecto son bienvenidas. Si encuentra algún problema o desea agregar nuevas funcionalidades, puede crear un pull request o reportar un problema en el repositorio del proyecto.
