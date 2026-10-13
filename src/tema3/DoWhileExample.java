package tema3;




public class DoWhileExample {
    public static void main(String[] args) {
        int contador = 6;
        do{ //inicio de do-while
            System.out.println("contador = " + contador);
            contador = contador + 1;
        }while(contador <= 5); // fin de do-while
        System.out.println("Continua el programa");
    }


}
