
package electrodomesticos.servicios;

import electrodomesticos.entidades.Electrodomestico;
import electrodomesticos.entidades.Televisor;
import java.util.Scanner;


public class TelevisorServicio extends Electrodomestico{
    
    Televisor t1;
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    /*
    Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
    padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    los atributos del televisor.
    */
    
    public Televisor crearTelevisor(){
        super.crearElectrodomestico();
        
        System.out.println("Ingresa la resolucion en pulgadas");
        int resolucion = leer.nextInt();
        
        System.out.println("Indica si el modelo cuenta con Sintetizador TDT (s/n)");
        String sintetizador = leer.next();
        boolean sintonizadorTDT=false;
        if(sintetizador.equalsIgnoreCase("s")){
            sintonizadorTDT = true;
        }        
        t1 = new Televisor(resolucion, sintonizadorTDT, precio, color, letra, peso);
        return t1;
               
    }
    
    //mostrar televisor
    
    public void mostrarTelevisor(){
        System.out.println(t1);
    }
    
    /*
    Método precioFinal(): este método será heredado y se le sumará la siguiente
    funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
    incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
    $500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
    también deben afectar al precio.
    */
    @Override
    public int precioFinal(char letra, int peso){
        int precioOriginal = super.precioFinal(letra, peso);
        
        int resolucion = t1.getResolucion();
        boolean sintetizador = t1.isSintonizadorTDT();
        int precio = t1.getPrecio();
        
        int precioAdicional=0;
        
        if(resolucion>40){
            precioAdicional = (int) Math.floor(precio*0.3);
             System.out.println("precio adicional mas el 30% " + precioAdicional);
        }
        
        if(sintetizador){
            precioAdicional += 500;
        }
        
        int precioFinal = t1.getPrecio() + precioOriginal + precioAdicional;
        
        System.out.println("El precio final del producto es: " +precioFinal);
        return precioFinal;
    }
    

}
