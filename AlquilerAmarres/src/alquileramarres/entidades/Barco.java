package alquileramarres.entidades;

/*
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.

módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
 */

import java.util.Scanner;

public class Barco {

    //atributos 
    protected String matricula;
    protected int eslora;
    protected int anio;

    public Barco() {
    }

    public Barco(String matricula, int eslora, int anio) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio = anio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anio=" + anio + '}';
    }
    
    //metodos para herencia

    public Barco crearBarco() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingresa la matricula del Barco");
        String matricula = leer.next();
        System.out.println("Ingresa la eslora en metros");
        int eslora = leer.nextInt();
        System.out.println("Ingresa el anio");
        int anio = leer.nextInt();

        return new Barco(matricula, eslora, anio);
    }
    
    public int calcularModulo(){
        return eslora*10;
    }
    
    
}
