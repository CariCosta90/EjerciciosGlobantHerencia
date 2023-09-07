package formasgeometricas.servicios;

import formasgeometricas.entidades.Rectangulo;
import formasgeometricas.interfaces.calculosFormas;
import java.util.Scanner;

public class RectanguloServicio implements calculosFormas {

    Rectangulo r1;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo crearRectangulo() {
        
        System.out.println("Ingresa la base");
        double base = leer.nextDouble();
        System.out.println("Ingresa el altura");
        double altura = leer.nextDouble();
        r1 = new Rectangulo(base, altura);
        return r1;
    }

    @Override
    public void calcularArea() {
        System.out.println("El area del rectangulo es: " + (r1.getBase()*r1.getAltura()));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El area del rectangulo es: " + ((r1.getBase()+r1.getAltura())*2));
    }

}
