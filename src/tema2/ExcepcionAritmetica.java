package tema2;

import java.util.Scanner;

public class ExcepcionAritmetica {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int a, b;
            int res;
            System.out.println("Ingresa el valor de a");
            a = scanner.nextInt();
            System.out.println("Ingresa el valor de b");
            b = scanner.nextInt();
            res = a / b;
            System.out.println("El resultado es: " + res);
        }catch (ArithmeticException ae){
            System.out.println("No puedes dividir entre cero");
            System.out.println(ae);
        }
    }


}
