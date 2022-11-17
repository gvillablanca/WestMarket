package classMarket;

public class Producto {
    String codigo;
    String descripcion;
    int precio;
    int stock;
    Categoria categoria;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public String toString() {
        return "Producto{" +
                "CODIGO='" + codigo + '\'' +
                ", DESCRIPCION='" + descripcion + '\'' +
                ", PRECIO='" + precio + '\'' +
                ", STOCK='" + stock + '\'' +
                ", CATEGORIA='" + categoria.descripcion + '\'' +
                '}';
    }   
}
