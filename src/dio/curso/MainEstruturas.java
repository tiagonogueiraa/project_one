package dio.curso;

import java.util.Scanner;

public class MainEstruturas {

    public static void main(String[] args){

        var scanner = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        var name = scanner.next();
        System.out.println("Informe sua idade:");
        var age = scanner.nextInt();

        System.out.println("Você é emancipado? (s/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        if(age >= 18){
            System.out.printf("%s tem %s anos, você pode dirigir. \n", name, age);
        } else if (age >= 16 && isEmancipated) {
            System.out.printf("%s, apesar de você ter %s anos, você é emancipado e pode dirigir. \n", name, age);

        } else {
            System.out.printf("%s tem %s anos, você não pode dirigir. \n", name, age);

        }

        var canDrive = (age > 18) || (age >= 16 && isEmancipated);

        var message = canDrive ?
                name + ", você pode dirigir.\n" :
                name + ", você não pode dirigir \n";

        System.out.println(message);

        System.out.println("Fim de execução");
    }

}
