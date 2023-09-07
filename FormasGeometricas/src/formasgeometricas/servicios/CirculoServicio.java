
package formasgeometricas.servicios;

import formasgeometricas.entidades.Circulo;
import formasgeometricas.interfaces.calculosFormas;
import java.util.Scanner;


public class CirculoServicio implements calculosFormas{
    
    Circulo c1;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //importo PI de Math para usar a lo largo del servicio
    
    double pi = Math.PI;    
    
    public Circulo crearCirculo(){
        
        System.out.println("Ingresa el radio");
        double radio = leer.nextDouble();
        
        c1 = new Circulo(radio);
        
        System.out.println("El circulo creado es " + c1);
        return c1;
    }

    @Override
    public void calcularArea() {
        double area = pi*Math.pow(c1.getRadio(),2);
        System.out.println("El area del circulo es " + area);
    }

    @Override
    public void calcularPerimetro() {
       double perimetro = pi*c1.getDiametro();
        System.out.println("El perimetro del circulo es " + perimetro);
    }

}
