import java.io.PrintStream;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private final static String WELCOME_MESSAGE = "Olá, informe o seu nome:";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Olá, Informe o seu nome:");
        System.out.println(WELCOME_MESSAGE);
        //String name = scanner.next();
        var name = scanner.next();
        System.out.println("Olá, Informe a sua idade:");
        //int age = scanner.nextInt();
        var age = scanner.nextInt();

        //System.out.println("Olá " + name + " sua idade é " + age + ".");
        System.out.printf("Olá %s sua idade é %s \n", name, age);

    }
}