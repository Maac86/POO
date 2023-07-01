
/**
 * Write a description of class Chaquetas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chaquetas {
    private final String referencia;
    private String nombre;
    private String categoria;
    
    double PromedioVentas(){
        return 0;
    }
    
    public String getReferencia(){
        return referencia;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(nombre != null) this.nombre = nombre;
        else this.nombre = "";
    }
    
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String categoria){
        if(categoria != null) this.categoria = categoria;
        else this.categoria = "";
    }
    
    public Chaquetas(String referencia,String nombre,String categoria){
        if (referencia != null)this.referencia = referencia;
        else this.referencia = "";
        this.nombre = nombre;
        this.categoria = categoria;
    }
}