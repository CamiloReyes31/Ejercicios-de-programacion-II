
package ejercicioservicios;

import java.time.LocalDate;

public class TrabajoPintura extends Servicio {
    private double superficie;
    private double precioPintura;

    public TrabajoPintura(double superficie, double precioPintura, String trabajador,LocalDate fechaInicio, String cliente) {
        super(trabajador, fechaInicio, cliente);
        this.superficie = superficie;
        this.precioPintura = precioPintura;
    }

    public double getSuperficie() {
        return superficie;
    }
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecioPintura() {
        return precioPintura;
    }
    public void setPrecioPintura(double precioPintura) {
        this.precioPintura = precioPintura;
    }
    
    @Override
    public double costoMaterial(){
        return (superficie/7.8)*precioPintura;
    }
    @Override
    public double costoManoObra(){
        return (superficie/10)*9.5;
    }
    @Override
    public double costoTotal(){
        double totalp = costoMaterial()+costoManoObra();
        if (superficie<50){
            double total = (totalp*1.15);
            return total;
        }
        return totalp;
    }
    @Override
    public String detalleServicio(){
        return "TRABAJO DE PINTURA\n Cliente: "+getCliente()+"\n Fecha de inicio: "+getFechaInicio()
                +"\n Pintor: "+getTrabajador()+"\n Coste material: "+costoMaterial()+
                "\n Costo mano de obra: "+costoManoObra()+"\n total: "+costoTotal();
    }


}
