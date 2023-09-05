
package electrodomesticos.entidades;

import java.util.Scanner;



/*Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.

13

• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:

LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100

PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000
*/


public class Electrodomestico {
    
    //Atributos: precio, color, consumo energético (letras entre A y F) y peso.
    
    protected int precio;
    protected String color;
    protected char letra;
    protected int peso;
    
    //constructores:
    //uno vacio

    public Electrodomestico() {
    }
    
    //uno con todos los atributos pasados por parametro

    public Electrodomestico(int precio, String color, char letra, int peso) {
        this.precio = precio;
        this.color = color;
        this.letra = letra;
        this.peso = peso;
    }
    
    //getters y setters

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", letra=" + letra + ", peso=" + peso + '}';
    }
    
    //Metodos para heredar
    
    /*
     Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
    sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
    objeto y no será visible.
    */
    
    public char comprobarConsumoEnergetico(char letra){
   
       
        if (letra!='A' && letra!='B' && letra!='C' && letra!='D' && letra!='E' && letra!='F') {
            letra = 'F';
        }
        
        return letra;
    }
    
    /*
    Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
    usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
    blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
    minúsculas. Este método se invocará al crear el objeto y no será visible.
    */
    
    public String comprobarColor(String color){
        
        if(!color.equalsIgnoreCase("blanco") && !color.equalsIgnoreCase("negro") && !color.equalsIgnoreCase("rojo") && !color.equalsIgnoreCase("azul") && !color.equalsIgnoreCase("gris")){
            color = "blanco";
        }
        
        return color;
    }  
    
    /*
     Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
    precio se le da un valor base de $1000.
    */
    
    public Electrodomestico crearElectrodomestico(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingresa el precio del electrodomestico");
        precio = leer.nextInt();
        
        System.out.println("Ingresa el color");
        color= leer.next();
        
 
        System.out.println("Ingresa la letra del consumo energetico");
        letra = Character.toUpperCase(leer.next().charAt(0));
        
       
        System.out.println("Ingresa el peso del electrodomestico");
        peso = leer.nextInt();  
 
        
        return new Electrodomestico(precio, color, letra, peso);
    }
    
    
    
    public int precioFinal(char letra, int peso){
                  
         
        //calculo por consumo
        int precioPorConsumo=0;
       
                switch (letra) {
            case 'A':
                precioPorConsumo = 1000;
                break;
            case 'B':
                precioPorConsumo = 800;
                break;
            case 'C':
                precioPorConsumo = 600;
                break;
            case 'D':
                precioPorConsumo = 500;
                break;
            case 'E':
                precioPorConsumo = 300;
                break;
            case 'F':
                precioPorConsumo = 100;
                break;
        }               
                
         
        //calculo de precio por peso
        int precioPorPeso=0;
        
        if(peso >=1 && peso <=19){
            precioPorPeso=100;
        }else if(peso >=20 && peso <= 49){
            precioPorPeso=500;
        }else if (peso >=50 && peso <= 79){
            precioPorPeso=800;
        }else{
            precioPorPeso=1000;
        }
        
        
        int precioFinal = precioPorConsumo + precioPorPeso;
        
        return precioFinal;
        
                
    }
    
    

}
