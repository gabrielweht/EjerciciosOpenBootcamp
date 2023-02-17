public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.sumaPuertas();
        System.out.println("Mi coche tiene " + miCoche.puertas + " puertas");
    }
}
