package alquileramarres.entidades;

public class BarcoAMotor extends Barco {

    private int cv;

    public BarcoAMotor() {
    }

    public BarcoAMotor(int cv, String matricula, int eslora, int anio) {
        super(matricula, eslora, anio);
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
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
        return super.toString() + "BarcoAMotor{" + "cv=" + cv + '}';
    }

    @Override
    public int calcularModulo() {
        int moduloBase = super.calcularModulo();
        return moduloBase + cv;
    }

}
