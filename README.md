## Promedio de Ventas de chaquetas
Este proyecto consiste en una aplicación Java que permite calcular el promedio de ventas de un determinado modelo de chaqueta en un periodo de tiempo específico.

### Instrucciones de Uso
* Ejecute la aplicación Java.
* Ingrese el modelo de chaqueta.
* Ingrese el periodo de tiempo.
* Ingrese la cantidad de ventas realizadas durante ese periodo.
* Ingrese el valor de cada venta.
* La aplicación calculará el promedio de ventas y lo mostrará en pantalla.

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
