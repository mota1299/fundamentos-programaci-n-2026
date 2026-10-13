package tema2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcion {


    public static void main(String[] args) {
        try {
            int edad;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa tu edad");
            edad = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Debes ingresar un numero entero");
        }
    }
}
