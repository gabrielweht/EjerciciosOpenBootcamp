public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(50);
        persona.setNombre("Carlos");
        persona.setTelefono("3518021562");

        System.out.println("Hola, soy " + persona.getNombre() + ", tengo " + persona.getEdad() + " años y mi número de teléfono es " + persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;


    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public int getEdad (){
        return this.edad;
    }
    public String getTelefono(){
        return this.telefono;
    }

    public String getNombre(){
        return this.nombre;
    }
}