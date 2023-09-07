package alquileramarres;

import alquileramarres.entidades.Alquiler;
import alquileramarres.entidades.Barco;
import alquileramarres.entidades.Veleros;
import alquileramarres.entidades.Yate;
import alquileramarres.servicios.AlquilerServicio;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
clase alquiler para armar un array de alquileres??

1. En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.

Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).

clase Barco como padre de:

- veleros
- barcos a motor
- yates

CV(Caballos de vapor?????)

Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:

• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.

En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.

Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
*/


public class AlquilerAmarres {

    public static void main(String[] args) {
        
        //Prueba con Velero
        Veleros v = new Veleros(4, "sdklhgf", 8, 2012);
        
        //creo fechas en formato String y las convierto para crear un alquiler
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fecha1 = LocalDate.parse("2023-05-28", formatter);
        LocalDate fecha2 = LocalDate.parse("2023-08-28", formatter);
        
        //creo el alquiler
        Alquiler alquiler1 = new Alquiler("pepe", 455698520, fecha1, fecha2, 4, v);
        //uso alquiler servicio con el alquiler creado (que usa el velero creado anteriormente)
        AlquilerServicio as = new AlquilerServicio();
        
        int dias = as.calcularDias(alquiler1);
        
        System.out.println(v);
        int precio = as.calcularAlquiler(v, alquiler1);
        System.out.println("Precio Velero $"+ precio);
        System.out.println("");
        
        //Prueba con Yate
        Yate y = new Yate(4, 200, "skdjgf", 25, 2012);
        Alquiler alquiler2 = new Alquiler("Alquiler Yate", 458732285, fecha1, fecha2, 2, y);
        System.out.println(y);
        precio = as.calcularAlquiler(y, alquiler2);        
        System.out.println("Precio Yate $" + precio );
        
    }

}
