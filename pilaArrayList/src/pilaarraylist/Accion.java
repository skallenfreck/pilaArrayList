
package pilaarraylist;


public class Accion {
    private String tipo;
    private String descripcion;

    public Accion() {
    }

    public Accion(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Accion{" + "tipo=" + tipo + ", descripcion=" + descripcion + '}';
    }   
    
}
