public class Main {
    public static void main(String[] args) {
        String estacion = "Otoño";

        switch (estacion) {
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            default:
                System.out.println(estacion + " no es una estación");
        }
    }
}