
package electrodomesticos.entidades;
import java.util.Scanner;

/*
A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.

*/


public final class Lavadora extends Electrodomestico {
    
    //agregamos el atributo adicional 
    private int carga;
    //constructor vacio
    public Lavadora() {
    }
    //cosntructor con herencia mas atributo especifico del hijo
    public Lavadora(int carga, int precio, String color, char letra, int peso) {
        super(precio, color, letra, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString() + "carga=" + carga + '}';
    }
    
    
    

}
