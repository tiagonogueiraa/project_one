package dio.curso;

import java.util.Scanner;

public class MainEstruturasIf {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String name = scanner.next();
        System.out.println("Informe sua idade:");
        int age = scanner.nextInt();

        System.out.println("Você é emancipado? (s/n)");
        boolean isEmancipated = scanner.next().equalsIgnoreCase("s");

        if(age >= 18){
            System.out.printf("%s tem %s anos, você pode dirigir. \n", name, age);
        } else if (age >= 16 && isEmancipated) {
            System.out.printf("%s, apesar de você ter %s anos, você é emancipado e pode dirigir. \n", name, age);

        } else {
            System.out.printf("%s tem %s anos, você não pode dirigir. \n", name, age);

        }

        boolean canDrive = (age > 18) || (age >= 16 && isEmancipated);

        String message = canDrive ?
                name + ", você pode dirigir.\n" :
                name + ", você não pode dirigir \n";

        System.out.println(message);

        System.out.println("Fim de execução");
    }

}
