package ValorReferencia;
class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.modificarNombre("yeferson");

        System.out.println("iniciamos en metodo main");
        System.out.println("persona = " + persona.leerNombre());

        System.out.println("Antes de invocar el metodo test\n");
        test(persona);
        System.out.println("Despues de invocar al metodo test");
        System.out.println("persona = " + persona.leerNombre());
        System.out.println("Finaliza el metodo main!");

    }

    public static void test(Persona persona) {
        System.out.println("Iniciamos el método test");
        persona.modificarNombre("pepe");
        System.out.println("finaliza el metodo test");
    }
}