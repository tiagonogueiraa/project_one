package dio.curso;

import java.util.Scanner;

public class exercicio1_2 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número");
        int number = scanner.nextInt();

        boolean keepVerify = true;

        while(keepVerify){
            System.out.println("Informe um número para verificação");

            int toVerify = scanner.nextInt();
            if(toVerify < number) {
                System.out.printf("Informe um número maior que %s \n", number);
                continue;
            }

            int result = toVerify % number;
            System.out.printf(" toVerify %s %% number %s \n ", toVerify, number);
            keepVerify = result == 0;


            System.out.printf("%s %% %s = %s \n", toVerify, number, result);
        }

    }



}
