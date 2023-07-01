
/**
 * Write a description of class Empaque here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Empaque
{
    private final String tamaño;
    private String material;
    private String codigo;
    private ChaquetaTienda[] chaqueta1;
    private ChaquetaInternet[] chaqueta2;    
    private int numChaquetas1;
    private int numChaquetas2;   
    
    public Empaque(String tamaño,String material,String codigo){
        if(tamaño != null) this.tamaño = tamaño;
        else this.tamaño = ""; 
        setMaterial(material);
        setCodigo(codigo);        
        chaqueta1 = new ChaquetaTienda[50];
        chaqueta2 = new ChaquetaInternet[50];       
        numChaquetas1 = 0;
        numChaquetas2 = 0;        
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
    
    public int getNumChaquetas1(){
        return numChaquetas1;
    }
    
    public int getNumChaquetas2(){
        return numChaquetas2;
    }
        
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < numChaquetas1; i++){
            promedio = promedio + chaqueta1[i].calcularPromedio() / numChaquetas1;
        }
        for(int i = 0; i < numChaquetas2; i++){
            promedio = promedio + chaqueta2[i].calcularPromedio() / numChaquetas2;
        }
        return promedio / 2;
    }
    public void adicionarChaquetaTienda(String referencia, String nombre, String categoria, double mes1, double mes2){
        chaqueta1[numChaquetas1] = new ChaquetaTienda(referencia, nombre, categoria, mes1, mes2);
        numChaquetas1++;
    }
    
    public void adicionarChaquetaInternet(String referencia, String nombre, String categoria, double mes1, double mes2, double mes3){
        chaqueta2[numChaquetas2] = new ChaquetaInternet(referencia, nombre, categoria, mes1, mes2, mes3);
        numChaquetas2++;
    }
} 