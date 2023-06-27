
/**
 * Write a description of class Chaqueta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chaquetas
{
    String referencia;
    String nombre;
    String categoria;
    double mes1;
    double mes2;
    double mes3;
    

    Chaquetas(String referencia, String nombre, String categoria, double mes1, double mes2, double mes3){
        this.referencia = referencia;
        this.nombre = nombre;
        this.categoria = categoria;
        this.mes1 = mes1;
        this.mes2 = mes2;
        this.mes3 = mes3;

    }
    
    double PromedioVentas(){
        return (mes1 + mes2 + mes3) / 3;
    }
}
