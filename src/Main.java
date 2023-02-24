import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int numeros1;
        int numeros2;

        System.out.println("introduce el primer numero");
        int numero1 = lectura.nextInt();

        System.out.println("introduce el segundo numero ");
        int numero2 = lectura.nextInt();

        double resta=numero1-numero2;
        double resultado1= numero1/resta;
        double resultado2=numero2/resta;

       System.out.println("el resultado de la resta de los numeros  es: " +resta);
       System.out.println("el resultado del prime numero es " +resultado1+ " el resulatdo de segundo valor: "+resultado2);




    }
    }