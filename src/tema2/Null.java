package tema2;

public class Null {

    public static void main(String[] args) {
        String nombre = "null";

        try {
            System.out.println(nombre.length());
        } catch (NullPointerException e) {
            System.out.println("La variable no contiene un objeto.");
        }
    }
}
