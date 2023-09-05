package animales;

import animales.entities.Animal;
import animales.entities.Caballo;
import animales.entities.Gato;
import animales.entities.Perro;


public class Animales {

    public static void main(String[] args) {
        
        //Declaracion del objeto Perro
        Animal perro1 = new Perro("Stitch", "Carnivoro", 15, "Doberman");
        perro1.alimentarse();
        
        //Declaracion de otro objeto perro
        
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chiuahua");
        perro2.alimentarse();
        
        //Declaracion del objeto gato
        
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato1.alimentarse();
        
        //Declaracion del objeto Caballo
        
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.alimentarse();
        
       
    }

}
