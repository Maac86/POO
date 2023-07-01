
/**
 * Write a description of class Chaquetas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Chaquetas{
        protected final String referencia;
        private String nombre;
        private String categoria;
        
        public Chaquetas(String referencia, String nombre, String categoria)throws Exception{
            if(referencia.trim().equals(""))
                throw new Exception("valor invalido en la referencia");
            
            if(referencia.matches(".*[a-zA-Z].*"))
                throw new Exception("La referencia no puede tener caracteres");
            
            this.referencia = referencia;
            setNombre(nombre);
            setCategoria(categoria);
            
        }
        
        public abstract double calcularPromedio();
        
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
        
    }
    