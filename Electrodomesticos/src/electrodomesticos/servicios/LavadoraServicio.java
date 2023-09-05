
package electrodomesticos.servicios;

import electrodomesticos.entidades.Electrodomestico;
import electrodomesticos.entidades.Lavadora;
import java.util.Scanner;

/*
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
*/


public class LavadoraServicio extends Electrodomestico{
    
    /*
    Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
    padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    el atributo propio de la lavadora.
    */
    
    Lavadora l1;
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Lavadora crearLavadora(){
        super.crearElectrodomestico();
        
        System.out.println("Ingresa la carga de la lavadora");
        int carga = leer.nextInt();
        
        String colorVerificado = super.comprobarColor(color);
        
        char letraVerificada = super.comprobarConsumoEnergetico(letra);
        
        l1 = new Lavadora(carga, precio, colorVerificado, letraVerificada, peso);
        
        return l1;
    }
    
    //creo un metodo para mostrar la Lavadora y correr pruebas BORRAR
    public void mostrarLavadora(){
        System.out.println("Lavadora creada");
        
        System.out.println(l1.toString());
        
    }
    
    
    /*
    • Método precioFinal(): este método será heredado y se le sumará la siguiente
    funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
    carga es menor o igual, no se incrementará el precio. Este método debe llamar al
    método padre y añadir el código necesario. Recuerda que las condiciones que hemos
    visto en la clase Electrodoméstico también deben afectar al precio.
    */
    @Override
    public int precioFinal(char letra, int peso){
        //heredado
        int precioOriginal = super.precioFinal(letra, peso);
        
        //sumado
        int precioAdicional = 0;
        
        if(l1.getCarga()>30){
            precioAdicional = 500;
            System.out.println("Como la carga de la lavadora es mayor a 30 se suman $500 al monto");
        }else{
            System.out.println("Como la carga es <=30 no se suma monto adicional");
        }
        
        //sumamos el precio del electrodomestico mas los extras por Peso, consumo y carga
        int precioFinal = l1.getPrecio()+precioOriginal + precioAdicional;
               
        
        System.out.println("El precio final de la lavadora sera: $" + precioFinal);
        return precioFinal;
        
    }
    

}
