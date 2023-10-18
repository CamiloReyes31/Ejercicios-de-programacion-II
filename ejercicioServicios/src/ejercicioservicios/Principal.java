
package ejercicioservicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    
    public static ArrayList<Servicio> servicios=new ArrayList<>();
    public static Scanner teclado = new Scanner (System.in);

    public static void main(String[] args) {
        
        menu();
        
    }
    
    public static void registroPintura(){
        System.out.println("Ingrese el trabajador");
        String trabajador = teclado.next();
        System.out.println("Ingrese el cliente");
        String cliente = teclado.next();
        System.out.println("Ingrese la superficie");
        double superficie = teclado.nextDouble();
        System.out.println("Ingrese el precio de la pintura");
        double precioPintura=teclado.nextDouble();
        
        TrabajoPintura tp = new TrabajoPintura(superficie, precioPintura, trabajador,LocalDate.of(2023,10,17), cliente);
        servicios.add(tp);
    }
    public static void registroRevision(){
        System.out.println("Ingrese el trabajador");
        String trabajador = teclado.next();
        System.out.println("Ingrese el cliente");
        String cliente = teclado.next();
        System.out.println("digite la cantidad de alarmas revisadas");
        int numAlarmaRevisada=teclado.nextInt();
        
        RevisionAlarma rv = new RevisionAlarma(LocalDate.of(2023,10,17), numAlarmaRevisada, trabajador, cliente);
        servicios.add(rv);
    }
    public static void mostrar(){
        for(Servicio servicio: servicios){
            System.out.println(servicio.detalleServicio());
        }
    }
    
    public static String menu(){
        do {
            System.out.println("*****MENU DE SERVICIOS*****");
            System.out.println("1. Guardar trabajo pintura");
            System.out.println("2. Guardar revision de alarma");
            System.out.println("3. Mostrar todos los trabajos realizados");
            System.out.println("4. Salir");
            System.out.println("\n");
            System.out.println("Ingrese el numero de la opcion");
            int opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    registroPintura();
                    
                    break;
                case 2:
                    registroRevision();
                    
                    break;
                case 3:
                    mostrar();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    return "esta opcion es valida";
            }  
        } while (true);     
    }
    
}

