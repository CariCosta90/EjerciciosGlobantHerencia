
package formasgeometricas.entidades;


public class Circulo {
    
    //atributos
    public double radio;
    public double diametro;
    
    //constructores

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
        this.diametro = calcularDiametro();
    }
    
    //metodo para calcular el diametro
    private double calcularDiametro(){
        return radio*2;
    }
    
    //getter y setter

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
        //seteo el diametro junto con el Radio dado que el diametro es radio*2 y use un metodo para calcularlo
        this.diametro = calcularDiametro();
    }

    public double getDiametro() {
        return diametro;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", diametro=" + diametro + '}';
    }
    

}
