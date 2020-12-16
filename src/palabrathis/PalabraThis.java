
package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Simon", "Gregoire");
        System.out.println("persona = " + persona);
        System.out.println("Nombre persona: "+ persona.nombre);
        System.out.println("Apellido persona: "+ persona.apellido);
    }
}

class Persona {
    String nombre; 
    String apellido;
    
    Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando This: "+ this);
        new Imprimir().imprimir(this);
        
    }
}

class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("Persona desde imprimir: " + persona);
        System.out.println("Impresion del objeto actual (This)" + this);
    }
    
}