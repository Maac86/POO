
/**
 * Write a description of class ChaquetaInternet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChaquetaInternet extends Chaquetas{
    private double mes1;
    private double mes2;
    private double mes3;
    
    ChaquetaInternet(String referencia, String nombre, String categoria, double mes1, double mes2, double mes3)throws Exception{
        super(referencia, nombre, categoria);
        setMes1(mes1);
        setMes2(mes2);
        setMes3(mes3);
    }
    
    public double calcularPromedio(){
        return (mes1 + mes2 + mes3) / 3;
    }
    
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
    
    public double getMes3(){
        return mes3;
    }
    public void setMes3(double mes3){
        if(mes3 >= 0) this.mes3 = mes3;
        else this.mes3 = 0;
    }
    
}