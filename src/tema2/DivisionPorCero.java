package tema2;

import java.util.Scanner;

public class DivisionPorCero {

    public static void main(String[] args) {
        String n = null;
        try {
            Scanner scanner = new Scanner(System.in);
            int a, b, c; // c = a/b
            System.out.println("Dame el valor para a");
            a = scanner.nextInt();
            System.out.println("Dame el valor de b");
            b = scanner.nextInt();
            //dividir
            c = a / b;
            System.out.println("c = " + c);
        }catch (ArithmeticException ae){
            System.out.println("No puedes divir por cero");
        }catch (NullPointerException np){
            System.out.println("Estas manejando mal un null");
        }finally {
            System.out.println("Me ejecutar siempre");
        }
    }

}
