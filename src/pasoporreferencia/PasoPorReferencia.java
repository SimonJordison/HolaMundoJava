package pasoporreferencia;
import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        //Persona persona1 = new Persona();
        Persona persona1 = null;
//        persona1.nombre = "Simon";
//        persona1.apellido = "Gregoire";
//        persona1.desplegarInformacion();
        persona1 = cambiaValor(persona1);
//        System.out.println("Persona1 cambio de nombre: " +persona1.nombre);
    }
    
    public static Persona cambiaValor (Persona persona){
        if(persona == null){
            System.out.println("Valor de persona invalido: null");
            return persona;
        }
        persona.nombre = "Javiera";
        return persona;
    }
}
