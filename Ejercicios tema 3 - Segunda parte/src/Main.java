public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.sumaPuertas();
        System.out.println("Mi coche tiene " + miCoche.puertas + " puertas");
    }
}

class Coche {
    public int puertas = 0;

    Coche() {
    }

    public void sumaPuertas() {
        ++this.puertas;
    }
}

