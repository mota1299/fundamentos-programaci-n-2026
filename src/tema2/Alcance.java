package tema2;

public class Alcance {

    public static void main(String[] args) {
        int valor = 11; //el alcance (scope) de mi variable entre en ambas condiciones
        int valor2 = 10;
        if (valor > 10){ // inicio if
            valor2 = 15;
            System.out.println(valor2);
        } //fin if
        else {
            System.out.println(valor2);
        }
        }
}
