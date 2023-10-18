
package ejercicioparking;

import java.util.ArrayList;

public class Parking {
    private final ArrayList<String> matriculas;
    private final String nombre;
    
    public Parking(String nombre, int plazas){
        this.nombre=nombre;
        
        matriculas = new ArrayList<>();
        for (int i = 0; i < plazas; i++) {
            matriculas.add(null);
        }
    }

    public String getNombre() {
        return nombre;
    }
    
    public void entrada(String matricula, int plaza) throws ParkingException{
        if(plaza>=matriculas.size()|| plaza<0){
            throw new ParkingException("Plaza inexistente ", matricula);
        }
        if(matricula==null || matricula.length()<4){
            throw new ParkingException("matricula incorrecta", matricula);
        }
        if(matriculas.get(plaza)!=null){
            throw new ParkingException("plaza ocupada", matricula);
        }
        if(matriculas.contains(matricula)){
            throw new ParkingException("matricula repetida", matricula);
        }
        
        matriculas.set(plaza, matricula);
    }
    
    public int salida(String matricula) throws ParkingException{
        if(!matriculas.contains(matricula))
            throw new ParkingException("matricula no exite", matricula);
        
        int plaza = matriculas.indexOf(matricula);
        matriculas.set(plaza, null);
        return plaza;
    }
    
    public int getPlazasTotales(){
        return matriculas.size();
    }
    
    public int getPlazasOcupadas(){
        return getPlazasTotales()-getPlazasLibres();
    }
    
    public int getPlazasLibres(){
        int pl=0;
        for (int i = 0; i < matriculas.size(); i++) {
            if(matriculas.get(i)==null)
                pl++;
        }
        return pl;
    }

    @Override
    public String toString() {
        String cadena="Parking"+nombre+"\n";
        cadena += "--------------------\n";
        for (int i = 0; i < matriculas.size(); i++) {
            cadena +=  "Plaza "+i+": ";
            cadena += (matriculas.get(i)==null)?"(vacia)":matriculas.get(i);
            cadena+="\n";
        }
        cadena += "--------------------\n";
        return cadena;
    }
    
    
    
}
