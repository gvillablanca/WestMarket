package classMarket;

public class Categoria {
    int codigo;
    String descripcion;
    String descripcionCompleta;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcionCompleta() {
        return descripcionCompleta;
    }

    public void setDescripcionCompleta(String descripcionCompleta) {
        this.descripcionCompleta = descripcionCompleta;
    }
    
    
    
    @Override
    public String toString() {
        return "Categoria{" +
                "CODIGO='" + codigo + '\'' +
                ", DESCRIPCION='" + descripcion + '\'' +
                ", DESCRIPCION-COMPLETA='" + descripcion + " (cod: "+codigo +")" +'\'' +
                '}';
    } 
}
