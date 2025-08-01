package dio.curso;

import java.util.Scanner;

public class MainKeywords {

    public static void main(String[] args){

        float number = 1.0f;
        double number1 = 1.0;

        char character = 'a';
        System.out.println("number ->"+ number);
        System.out.println("number 1 ->"+ number1);
        System.out.println("char ->"+ character);

        // operadores em java

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto é 2 = 2 ?");

        int result = scanner.nextInt();
        boolean isRight = result == 4;


        System.out.printf("O resultado é 4, você acertou? (%s) \n", isRight);
        if(result == 4){
            System.out.println("Você acertou!");
        } else {
            System.out.println("Você errou!");
        }


        System.out.println("Quantos anos você tem?");
        int age = scanner.nextInt();

        System.out.println("Você é emancipado?");
        boolean isEmancipated = scanner.nextBoolean();

        boolean canDrive = age >= 17 || (isEmancipated && age >= 16);

        System.out.printf("Você pode digigir? %s \n", canDrive);


    }

}
