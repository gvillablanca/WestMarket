package classMarket;

public class Categoria {
    int codigo;
    String descripcion;

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
    
    @Override
    public String toString() {
        return "Categoria{" +
                "CODIGO='" + codigo + '\'' +
                ", DESCRIPCION='" + descripcion + '\'' +
                '}';
    } 
}
