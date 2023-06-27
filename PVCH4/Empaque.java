
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
    private Chaquetas[] chaquetas;
    private int numChaquetas;
    
    public Empaque(String tamaño,String material,String codigo){
        if(tamaño != null) this.tamaño = tamaño;
        else this.tamaño = ""; 
        setMaterial(material);
        setCodigo(codigo);        
        chaquetas = new Chaquetas[50];
        numChaquetas = 0;
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
    
    public int getNumChaquetas(){
        return numChaquetas;
    }
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < numChaquetas; i++){
            promedio = promedio + chaquetas[i].PromedioVentas() / numChaquetas;
        }
        return promedio;
    }
    
    public void adicionarChaquetas(String referencia, String nombre, String categoria, double mes1, double mes2, double mes3){
        Chaquetas e = new Chaquetas(referencia, nombre, categoria, mes1, mes2, mes3);
        chaquetas[numChaquetas] = e;
        numChaquetas++;
    }
}