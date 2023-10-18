
package ejercicioservicios;

import java.time.LocalDate;

public class RevisionAlarma extends Servicio{
    private int numAlarmaRevisada;

    public RevisionAlarma(LocalDate fechaInicio, int numAlarmaRevisada, String trabajador, String cliente) {
        super(trabajador,fechaInicio, cliente);
        this.numAlarmaRevisada = numAlarmaRevisada;
    }

    public int getNumAlarmaRevisada() {
        return numAlarmaRevisada;
    }
    public void setNumAlarmaRevisada(int numAlarmaRevisada) {
        this.numAlarmaRevisada = numAlarmaRevisada;
    }
    
    @Override
    public double costoMaterial(){
        return 0;
    }
    @Override
    public double costoManoObra(){
        return (numAlarmaRevisada/3)*40;
    }
    @Override
    public double costoTotal(){
        return (numAlarmaRevisada/3)*40;
    }
    @Override
    public String detalleServicio(){
        return "REVISION PERIODICA ALARMAS CONTRAINCENDIOS\n Cliente: "+getCliente()+
                "Fecha revision: "+getFechaInicio()+"\n Fecha revision: "+getFechaInicio()+
                "\n TOTAL: "+costoTotal();
    }
}
