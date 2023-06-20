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
