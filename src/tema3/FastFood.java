package tema3;

import java.util.Scanner;

public class FastFood {

    public static void main(String[] args) {
        String op;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona algo del menú: \n A)Hamburguesa " +
                "\n B)Hot-dog \n C) Pizza");
        op = scanner.nextLine();
        switch (op){
            case "A":
                System.out.println("Eligiste una Hamburguesa");
                break;
            case "B":
                System.out.println("Eligiste un Hot-dog");
                    break;
            case "C":
                System.out.println("Eligiste una pizza");
                        break;
            default:
                System.out.println("Eligiste una opción que no existe en el menú");
                break;


        }


    }

}
