package tema2;

import java.util.Scanner;

public class DivisionPorCeroV2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c; // c = a/b
        String n = null;
        System.out.println("Dame el valor para a");
        a = scanner.nextInt();
        System.out.println("Dame el valor de b");
        b = scanner.nextInt();
        //dividir
        if(b != 0) {
            c = a / b;
            System.out.println("c = " + c);
        }
        else {
            System.out.println("No puedes dividir por cero");
        }
    }


}
