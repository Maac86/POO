
/**
 * Write a description of class Empaque here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Empaque
{
    private final String tamaño;
    private String material;
    private String codigo;
    private ArrayList chaquetas;
    
    public Empaque(String tamaño,String material,String codigo){
        if(tamaño != null) this.tamaño = tamaño;
        else this.tamaño = ""; 
        setMaterial(material);
        setCodigo(codigo);        
        chaquetas = chaquetas = new ArrayList();
    }
    
    public String getTamaño(){
        return tamaño;
    }
    
    public String getMaterial(){
        return material;
    }
    public void setMaterial(String material){
        if(material != null){
            this.material = material;
        }else{
            this.material = "";
        }        
    }
    
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        if(codigo != null){
            this.codigo = codigo;
        }else{
            this.codigo = "";
        }        
    }
        
    public double PromedioVentas(){
        double promedio = 0;
        for(int i = 0; i < chaquetas.size(); i++){
            promedio += ((Chaquetas)chaquetas.get(i)).calcularPromedio();
        }

        return promedio / 2;
    }
    
    public void adicionarChaquetas(String referencia, String nombre, String categoria, double mes1, double mes2)throws Exception{
        chaquetas.add(new ChaquetaTienda(referencia, nombre, categoria, mes1, mes2));
    }
    
    public void adicionarChaquetas(String referencia, String nombre, String categoria, double mes1, double mes2, double mes3)throws Exception{
        chaquetas.add(new ChaquetaInternet(referencia, nombre, categoria, mes1, mes2, mes3));
    }
    
}