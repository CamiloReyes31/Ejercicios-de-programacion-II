
package ejercicio2;

import java.util.ArrayList;

public class Coleccion {
    private String nombreColeccion;
    private ArrayList<Figura> listaFiguras;
    
    public Coleccion(String nombreColeccion){
        listaFiguras = new ArrayList<>();
        this.nombreColeccion=nombreColeccion;
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }
    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public ArrayList<Figura> getListaFiguras() {
        return listaFiguras;
    }
    public void setListaFiguras(ArrayList<Figura> listaFiguras) {
        this.listaFiguras = listaFiguras;
    }

    @Override
    public String toString() {
        return "Coleccion{" + "nombreColeccion=" + nombreColeccion + ", listaFiguras=" + listaFiguras + '}';
    }
    
    public void addFigura(Figura fig){
        listaFiguras.add(fig);
    }
    public void subirPrecio(double precio, String id){
        for(Figura fig: listaFiguras){
            System.out.println("\n"+fig.getCodigo());
            if (fig.getCodigo().equals(id)){
                double preciofig=0;
                preciofig=fig.getPrecio()+precio;
                fig.setPrecio(preciofig);
            }
        }
    }
}
