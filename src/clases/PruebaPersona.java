package clases;

public class PruebaPersona {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Simon";
        persona1.apellido = "Gregoire";
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona();
        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);
        
        persona2.desplegarInformacion();
        persona2.nombre = "Javiera";
        persona2.apellido = "Rosales"; 
        persona2.desplegarInformacion();
    }

}
