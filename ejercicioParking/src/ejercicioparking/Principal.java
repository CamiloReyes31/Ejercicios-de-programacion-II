
package ejercicioparking;

import java.util.Scanner;

public class Principal {
    
    static Parking parking = new Parking(" Centro",10);
    static int opcion;
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            menu();
        } while (opcion!=4);
        
    }
    
    public static void entradaCoche(){
        boolean correcto=false;
        try {
            System.out.println("Introduzca matricula");
            String mat = teclado.nextLine();
            System.out.println("Introduzca la plaza");
            int pl = Integer.parseInt(teclado.nextLine());
              
            parking.entrada(mat, pl);
            correcto=true;
        } catch (ParkingException ex) {
            System.out.println("Error: "+ex.getMensaje());
            System.out.println("No se realizo la entrada del coche con matriculla "
                    +ex.getMatricula()+" en el parking");
        } catch(NumberFormatException ex){
            System.out.println("Formato de numero incorrecto");
        }catch (Exception ex){
            System.out.println("ERROR DESCONOCIDO. ");
        }finally{
            if(!correcto)
                System.out.println("Se produjo un error. ");
        }
    }
    public static void salidaCoche(){
        boolean correcto = false;
        try {
            System.out.println("Introduzca la matricula: ");
            String mat=teclado.nextLine();
            int pl = parking.salida(mat);
            System.out.println("El coche "+mat+" salio de la plaza "+pl+"\n\n");
            System.out.println("Plazas totales "+parking.getPlazasTotales()+"\n");
            System.out.println("PlaZas ocupadas "+parking.getPlazasOcupadas()+"\n");
            System.out.println("Plazas libres "+parking.getPlazasLibres()+"\n\n");
            correcto=true;
        } catch (ParkingException ex) {
            System.out.println("Error: "+ex.getMensaje());
            System.out.println("No se realizo la salida del coche con matricula"+
                    ex.getMatricula()+" en el parking");
        }catch(Exception ex){
            System.out.println("ERROR DESCONOCIDO. ");
        }finally{
            if(!correcto)
                System.out.println("Se produjo un error. ");
        }
    }
    
    public static void menu(){
        System.out.println("""
                           1. Entrada de coche
                           2. Salida de coche
                           3. Mostrar parking
                           4. Salir
                           ->
                           """);
        try{
        opcion = Integer.parseInt(teclado.nextLine());
        } catch(Exception ex){
            opcion=0;
        }
        switch (opcion) {
            case 1:
                entradaCoche();
                break;
            case 2:
                salidaCoche();
                break;
            case 3:
                System.out.println(parking+"\n\n");
                break;
            case 4:
                System.out.println("Fin del programa\n\n");
                break;
            default:
                System.out.println("Error en la opcion\n\n");
        }
    }
    
}
