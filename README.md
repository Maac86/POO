## Ejercicio Base
En su labor como programador de software, has sido elegido para crear una aplicación dirigida a un vendedor de chaquetas, que necesita calcular el promedio de ventas de un determinado modelo de chaqueta en un periodo de tiempo específico. Esta tienda realiza ventas de manera continua y desea clacular el promedio general de ventas para cada modelo de chaqueta., se debe registar la referencia del modelo, su nombre y la categoria a la que pertence. 


### Instrucciones de Uso
* Ejecute la aplicación Java.
* Ingrese el modelo de chaqueta.
* Ingrese el periodo de tiempo.
* Ingrese la cantidad de ventas realizadas durante ese periodo.
* Ingrese el valor de cada venta.
* La aplicación calculará el promedio de ventas y lo mostrará en pantalla.


### Historia de usuario

<img width="737" alt="Historia de usuario" src="https://github.com/Maac86/POO/assets/137130030/f2752dc0-ef40-412b-b445-8ad2e81ea419">


### Caso de uso

![Caso de uso](https://github.com/Maac86/POO/assets/137130030/2c202a28-541b-495c-b43f-5342bc8c554f)


### Diagrama de flujo

![_Diagrama de flujo](https://github.com/Maac86/POO/assets/137130030/6fea85ac-bba4-4f6e-b28c-d416db739fd9)



### Pseudocódigo
~~~
Algoritmo CalcularPromedioVentas
	Definir cantidadVentas, modeloChaqueta, periodoTiempo, sumaVentas, promedioVentas Como Real;
	Definir contadorVentas Como Entero;
	
	Escribir "Ingrese el modelo de chaqueta:";
	Leer modeloChaqueta;
	
	Escribir "Ingrese el periodo de tiempo:";
	Leer periodoTiempo;
	
	sumaVentas <- 0;
	contadorVentas <- 0;
	
	Mientras contadorVentas < cantidadVentas
		Escribir "Ingrese la venta número ", contadorVentas + 1;
		Leer cantidadVentas;
		
		sumaVentas <- sumaVentas + cantidadVentas;
		contadorVentas <- contadorVentas + 1;
	Fin Mientras
	
	promedioVentas <- sumaVentas / contadorVentas;
	
	Escribir "El promedio de ventas para el modelo de chaqueta ", modeloChaqueta, " en el periodo de tiempo ", periodoTiempo, " es: ", promedioVentas;
	
FinAlgoritmo
~~~

### Requisitos del Sistema
* Java Development Kit (JDK) instalado en el equipo.

#### Contribuciones
Las contribuciones a este proyecto son bienvenidas. Si encuentra algún problema o desea agregar nuevas funcionalidades, puede crear un pull request o reportar un problema en el repositorio del proyecto.
