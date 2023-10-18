
package ejercicio2;

public class Figura {
    private String codigo;
    private double precio;
    private Superheroe superheroe;
    private Dimension dimension;

    public Figura(String codigo, double precio, Superheroe superheroe, Dimension dimension) {
        this.codigo = codigo;
        this.precio = precio;
        this.superheroe = superheroe;
        this.dimension = dimension;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Superheroe getSuperheroe() {
        return superheroe;
    }
    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }

    public Dimension getDimension() {
        return dimension;
    }
    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "Datos de la figura\n Codigo = "+codigo+", precio = "
                +precio+"\n Datos del supereroe = "+superheroe.getNombre()+", descripcion = "
                +superheroe.getDescripcion()+", capa = "+ superheroe.isCapa()+"\n Dimension de la figura - "
                +" altura = "+dimension.getAlto()+", ancho = "+dimension.getAncho()+", profundidad = "
                + dimension.getProfundidad();
    }
    
    public void subirPrecio(double altaPrecio){
        this.precio+=altaPrecio;
    }
}
