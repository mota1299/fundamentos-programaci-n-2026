package tema3;

/*
* Instituto Tecnológico de Pachuca
* Fundamentos de programación
* AVILA MOTA JUAN JESÚS 17200782
* 2026-10-14
* Programa que evalua en una serie de números si es par o impar
* */

import java.util.Scanner;

public class ParImparWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res;
        do{
        int n,contador = 1;
        System.out.println("Ingrese un número");
        n = scanner.nextInt();

            while (contador <= n) {
                if (contador % 2 == 0) { // ¿n dividido entre dos tiene residuo cero?
                    System.out.println("El número: " + contador + " es par");
                } else {
                    System.out.println("El número: " + contador + " es impar");
                }
                contador++; //contador = contador + 1
            }
            System.out.println("¿Desea ingresar otro número? 1) Si , 2) No");
            res = scanner.nextInt();
        }while(res == 1);

    }

}
