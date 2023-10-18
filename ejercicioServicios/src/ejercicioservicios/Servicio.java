
package ejercicioservicios;

import java.time.LocalDate;

public abstract class Servicio {
    private String trabajador;
    private LocalDate fechaInicio;
    private String cliente;

    public Servicio(String trabajador,LocalDate fechaInicio, String cliente) {
        this.trabajador = trabajador;
        
        this.cliente = cliente;
    }

    public String getTrabajador() {
        return trabajador;
    }
    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    //metodos abstractos...
    public abstract double costoMaterial();
    public abstract double costoManoObra();
    public abstract double costoTotal();
    public abstract String detalleServicio();
}
