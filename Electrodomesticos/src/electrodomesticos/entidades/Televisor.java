
package electrodomesticos.entidades;


/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
*/

public class Televisor extends Electrodomestico{
    //atributos
    private int resolucion;
    private boolean sintonizadorTDT;
    //constructor vacio
    public Televisor() {
    }
    //constructor con atributos propios y heredados
    public Televisor(int resolucion, boolean sintonizadorTDT, int precio, String color, char letra, int peso) {
        super(precio, color, letra, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public String toString() {
        return super.toString() + "resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + '}';
    }
    
    
    

}
