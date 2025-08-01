package dio.curso;

import java.util.Scanner;

public class MainEstruturaWhile {

    public static void main(String[]  args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(!name.equals("exit")){
            System.out.println("Informe um nome:");

            name = scanner.next();

            System.out.println(name);
        }
        while(true){
            System.out.println("Informe um nome:");

            name = scanner.next();

            System.out.println(name);
            if(name.equalsIgnoreCase("exit")) break;

        }
//        com do roda pelo menos uma vez, mesmo sem ser correto
        do {
            System.out.println("Informe um nome:");

            name = scanner.next();

            System.out.println(name);
            if(name.equalsIgnoreCase("exit")) break;

        } while (!name.equalsIgnoreCase("exit"));
    }

}
