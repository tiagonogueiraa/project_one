package dio.curso;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        // calculo da idade

        //var baseYear = 2025;
        int baseYear = OffsetDateTime.now().getYear();
        System.out.println("Informe o seu nome:");

        String name = scanner.nextLine();

        System.out.println("Informe o seu ano de nascimento");
        int year = scanner.nextInt();
        int age = baseYear - year;
        System.out.printf("Olá %s você tem %s anos \n", name, age);


        // calculo da área do quadrado
        System.out.print("Digite o tamanho do lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = lado * lado;

        System.out.println("A área do quadrado é: " + area);

        // calculo de diferenca de idades

        System.out.print("Digite a idade da pessoa 1: ");
        int idade1 = scanner.nextInt();

        System.out.print("Digite a idade da pessoa 2: ");
        int idade2 = scanner.nextInt();

        int diferenca = Math.abs(idade1 - idade2);
        System.out.println("A diferença de idade é: " + diferenca + " anos");

    }

}
