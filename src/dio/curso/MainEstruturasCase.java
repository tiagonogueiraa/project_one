package dio.curso;

import java.util.Scanner;

public class MainEstruturasCase {

    public static void main(String[]  args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número de 1 até 7");

        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        String message;
        switch (option) {
            case 1:
            case 7:
                String day = option == 1 ? "Domingo" : "Sábado";
                message = String.format("Hoje é %s, fim de semana \\o//", day);
                break;
            case 2:
                message = "Segunda";
                break;
            case 3:
                message = "Terça";
                break;
            case 4:
                message = "Quarta";
                break;
            case 5:
                message = "Quinta";
                break;
            case 6:
                message = "Sexta";
                break;
            default:
                message = "Opção inválida.";
                break;
        }

        System.out.println(message);
    }

}
