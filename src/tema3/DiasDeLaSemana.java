package tema3;

import java.util.Scanner;

public class DiasDeLaSemana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("Elige un número del 1 al 7");
        opcion = scanner.nextInt();
        switch (opcion){ //valor de la variable
            case 2: // if(opcion == 1)
                System.out.println("MARTES");
            break; // fin de caso 1
            case 1: // inicio de caso 2 //
                System.out.println("LUNES");
                break; //fin de caso 2
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default: // inicio caso default
                System.out.println("Elegiste una opción no valida");
                break; // fin del caso default
        }


    }



}
