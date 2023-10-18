
package ejercicio2;

import java.util.Scanner;

public class Principal {
    
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //prueba clase Superheroe
        Superheroe super1 = new Superheroe("Spiderman");
        Superheroe super2 = new Superheroe("Batman");
        Superheroe super3 = new Superheroe("Superman");
        
        super1.setDescripcion("El hombre araña");
        super2.setDescripcion("El hombre murcielago");
        super3.setDescripcion("El hombre de acero");
        
        super2.setCapa(true);
        super3.setCapa(true);
        
        System.out.println(super1);
        System.out.println(super2);
        System.out.println(super3);
        
        //prueba clase Dimension
        Dimension dimPequeña = new Dimension();
        Dimension dimGrande = new Dimension(2.5, 2.8, 0.6);
        
        System.out.println(dimPequeña);
        System.out.println(dimGrande);
        
        System.out.println("El volumen total es de -> "+dimGrande.getVolumen()+" cm3");
        System.out.println("\n");
        
        //prueba clase Figura
        Figura fig1 = new Figura("10AB", 40000, super2, dimGrande);
        Figura fig2 = new Figura("20AB", 89600, super1, dimGrande);
        
        System.out.println(fig1);
        System.out.println("\n");
        System.out.println(fig2);
        System.out.println("\n");
        
        fig1.subirPrecio(20000);
        fig2.subirPrecio(15000);
        
        System.out.println(fig1);
        System.out.println("\n");
        System.out.println(fig2);
        System.out.println("\n");
        
        //instanciar objetos de tipo coleccion
        Coleccion col1 = new Coleccion ("Marvel");
        System.out.println(col1);
        System.out.println("La cantidad de elementos en el array es: "+col1.getListaFiguras().size());
        
        col1.getListaFiguras().add(fig1);
        col1.getListaFiguras().add(fig2);
        System.out.println("La cantidad de elementos en el array es: "+col1.getListaFiguras().size());
        
        //recorrer el arrayList
        System.out.println("\n");
        col1.subirPrecio(0, "1");
    }
}
