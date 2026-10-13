package tema3;

import java.util.Scanner;

public class OperacionMatematicas {
    public static void main(String[] args) {
        int op,a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1)Suma \n 2)Resta \n 3)Multiplicación \n 4)División");
        op = scanner.nextInt();
        System.out.println("Ingresa el valor para a");
        a = scanner.nextInt();
        System.out.println("Ingresa el valor para b");
        b = scanner.nextInt();
        switch (op){
            case 1:
                System.out.println("Resultado = " + (a+b));
                break;
            case 2:
                System.out.println("Resultado = " + (a-b));
                break;
            case 3:
                System.out.println("Resultado = " + (a*b));
                break;
            case 4:
                if(b != 0) {
                    System.out.println("Resultado = " + (a / b));
                }else{
                    System.out.println("No puedes dividir entre cero");
                }
        }
    }
}
