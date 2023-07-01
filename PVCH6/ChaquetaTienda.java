
/**
 * Write a description of class ChaquetaInternet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChaquetaTienda extends Chaquetas{//extends vinculas la sub clase con la clase madre
    private double mes1;
    private double mes2;
    public double getMes1(){
        return mes1;
    }
    public void setMes1(double mes1){
        if(mes1 >= 0) this.mes1 = mes1;
        else this.mes1 = 0;
    }
    
    public double getMes2(){
        return mes2;
    }
    public void setMes2(double mes2){
        if(mes2 >= 0) this.mes2 = mes2;
        else this.mes2 = 0;
    }
    
    ChaquetaTienda(String referencia, String nombre, String categoria, double mes1, double mes2){
        super(referencia,nombre,categoria);//metodo traer loas atributos al constructor 
        setMes1(mes1);
        setMes2(mes2);
    }
    
    double calcularPromedio(){
        return (mes1 + mes2) / 2;
    }
}