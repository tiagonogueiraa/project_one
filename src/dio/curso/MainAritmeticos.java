package dio.curso;

import java.util.Scanner;

public class MainAritmeticos {

    public static void main(String[] args){


        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número:");
        var value1 = scanner.nextFloat();
        System.out.println("Informe o segundo número:");
        var value2 = scanner.nextFloat();

        System.out.printf("%s + %s = %s\n", value1, value2, value1 + value2);
        System.out.printf("%s - %s = %s\n", value1, value2, value1 - value2);
        System.out.printf("%s * %s = %s\n", value1, value2, value1 * value2);
        System.out.printf("%s / %s = %s\n", value1, value2, value1 / value2);


        System.out.println("Raiz quadrada do número:");
        var value3 = scanner.nextInt();

        System.out.printf("A raiz quadrada de %s é %s\n", value3, Math.sqrt(value3));

        System.out.println("Potência do número:");
        var value4 = scanner.nextDouble();
        System.out.printf("A potência de %s é %s\n", value4, Math.pow(value4, 2));

        System.out.printf("operador de incremento %s ", ++value4);
    }
}

