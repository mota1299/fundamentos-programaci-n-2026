import java.util.Scanner;

public class Jubilacion { //algoritmo

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int EDAD_JUBILACION = 65;
        String nombre;
        int edad = 0;
        System.out.println("Escribe tu nombre");
        nombre = scanner.nextLine();
        System.out.println("Escribe tu edad");
        edad = scanner.nextInt();
        if(edad >= EDAD_JUBILACION) { // SI edad >= 65 entonces....... true o false
            System.out.println(nombre + " Tiene " + edad + " años y esta listo para jubilarse");
        }
        else{ //sino
            System.out.println(nombre + " Tiene " + edad + " años y aún no se puede jubilar");
            System.out.println("Le faltan " + (EDAD_JUBILACION-edad) + " años para jubilarse");
        } //FinSi
    }
} //fin algoritmo
