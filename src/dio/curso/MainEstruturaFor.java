package dio.curso;

import java.util.Scanner;

public class MainEstruturaFor {

    public static void main(String[]  args) {
        var scanner = new Scanner(System.in);

        for(var i = 1; i <= 100; i++){

            if(i % 2 == 0) continue;
            System.out.println("->"+ i);

            if(i == 100){
                System.out.println("Fim da execução");
            }

        }

        for (var i = 0; i < args.length; i++){
            System.out.println("["+i+"]" + "->" +args[i]);
        }


    }
}
