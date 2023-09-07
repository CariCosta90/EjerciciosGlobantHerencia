package alquileramarres.entidades;

public final class Yate extends BarcoAMotor {

    private int camarotes;

    public Yate() {
    }

    public Yate(int camarotes, int cv, String matricula, int eslora, int anio) {
        super(cv, matricula, eslora, anio);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
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
        return super.toString()+"Yate{" + "camarotes=" + camarotes + '}';
    }

    @Override
    public int calcularModulo() {
        int moduloBase = super.calcularModulo();
        return moduloBase + camarotes;
    }

}
