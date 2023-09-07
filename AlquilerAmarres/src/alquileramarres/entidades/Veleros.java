
package alquileramarres.entidades;


public class Veleros extends Barco{
    
    //atributos
    
    private int numDeMastiles;
    
    //constructores

    public Veleros() {
    }
    //constructor con herencia mas atributo especifico del hijo
    public Veleros(int numDeMastiles, String matricula, int eslora, int anio) {
        super(matricula, eslora, anio);
        this.numDeMastiles = numDeMastiles;
    }

    public int getNumDeMastiles() {
        return numDeMastiles;
    }

    public void setNumDeMastiles(int numDeMastiles) {
        this.numDeMastiles = numDeMastiles;
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
        return super.toString() + "Veleros{" + "numDeMastiles=" + numDeMastiles + '}';
    }
    
    
    @Override
    public int calcularModulo(){
        int moduloBase = super.calcularModulo();        
        return moduloBase + numDeMastiles;
    }
    

}
