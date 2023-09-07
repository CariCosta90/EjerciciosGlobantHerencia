
package alquileramarres.entidades;

/*
1. En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.

Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).

*/
import java.time.LocalDate;


public class Alquiler {
    
    //atributos
    private String nombre;
    private int documentoCli;
    private LocalDate fechaDeAlquiler;
    private LocalDate fechaDeDevolucion;
    private int posicionAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, int documentoCli, LocalDate fechaDeAlquiler, LocalDate fechaDeDevolucion, int posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.documentoCli = documentoCli;
        this.fechaDeAlquiler = fechaDeAlquiler;
        this.fechaDeDevolucion = fechaDeDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumentoCli() {
        return documentoCli;
    }

    public void setDocumentoCli(int documentoCli) {
        this.documentoCli = documentoCli;
    }

    public LocalDate getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }

    public void setFechaDeAlquiler(LocalDate fechaDeAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
    }

    public LocalDate getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public void setFechaDeDevolucion(LocalDate fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", documentoCli=" + documentoCli + ", fechaDeAlquiler=" + fechaDeAlquiler + ", fechaDeDevolucion=" + fechaDeDevolucion + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco + '}';
    }
    
    
    
    
   
    

}
