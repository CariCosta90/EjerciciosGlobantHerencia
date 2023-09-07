
package alquileramarres.servicios;

import alquileramarres.entidades.Alquiler;
import alquileramarres.entidades.Barco;
import alquileramarres.entidades.BarcoAMotor;
import alquileramarres.entidades.Veleros;
import alquileramarres.entidades.Yate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import jdk.nashorn.internal.ir.ContinueNode;


public class AlquilerServicio extends Barco{
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Alquiler a1;
    Barco b1;
    Veleros v1;
    Yate y1;
    BarcoAMotor bm1;
    
//    public Alquiler crearAlquiler(){
//        System.out.println("Ingresa el nombre del cliente");
//        String nombre = leer.next();
//        System.out.println("Ingresa el documento");
//        int documentoCli = leer.nextInt();
//        System.out.println("Ingresa la fecha del alquiler en formato YYYY-MM-DD");
//        String fechaDeAlquiler = leer.next();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDate fechaAlquiler = LocalDate.parse(fechaDeAlquiler, formatter);
//        System.out.println("Ingresa le fecha de devolucion en formato YYYY-MM-DD");
//        String fechaDeDevolucion = leer.next();
//        LocalDate fechaDevolucion = LocalDate.parse(fechaDeDevolucion, formatter);
//        System.out.println("Ingresa la posicion del amarre");
//        int amarre = leer.nextInt();
//        System.out.println("Ingresa el tipo de Barco");
//              
//        
//    }
    
    public int calcularDias(Alquiler a1){
        return (int) ChronoUnit.DAYS.between(a1.getFechaDeAlquiler(), a1.getFechaDeDevolucion());
    }
    
    public int calcularAlquiler(Barco barco, Alquiler a1){
        
        int dias = calcularDias(a1);
        System.out.println("dias en alquiler servicio " + dias);
        int modulo = barco.calcularModulo();
    
        System.out.println("Modulo " + modulo);
        
        return dias*modulo;
        
    }

}
