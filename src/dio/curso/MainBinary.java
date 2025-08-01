package dio.curso;

public class MainBinary {

    public static void main(String[] args){

        int value1 = 60;
        String binary1 = Integer.toBinaryString(value1);

        System.out.printf("Primeiro número da operação %s (representacao binária %s) \n", value1, binary1);

        int value2 = 85;
        String binary2 = Integer.toBinaryString(value2);

        System.out.printf("Segundo número da operação %s (representacao binária %s) \n", value2, binary2);


        int result = value1 | value2;

        String binaryResult = Integer.toBinaryString(result);

        System.out.printf("%s | %s = %s (representação binária %s )\n", value1, value2, result, binaryResult);

        int result2 = value1 << value2;

        String binaryResult2 = Integer.toBinaryString(result2);

        System.out.printf("%s << %s = %s (representação binária %s )\n", value1, value2, result2, binaryResult2);

        int result3 = value1 >>> value2;

        String binaryResult3 = Integer.toBinaryString(result3);

        System.out.printf("%s >>> %s = %s (representação binária %s )\n", value1, value2, result3, binaryResult3);

        int num1 = 6;
        int num2 = 12;
        System.out.println("\nOperações bitwise:");
        System.out.println("AND (&):  " + (num1 & num2) + " = " + Integer.toBinaryString(num1 & num2));
        System.out.println("OR  (|):  " + (num1 | num2) + " = " + Integer.toBinaryString(num1 | num2));
        System.out.println("XOR (^):  " + (num1 ^ num2) + " = " + Integer.toBinaryString(num1 ^ num2));
        System.out.println("~num1:    " + (~num1) + " = " + Integer.toBinaryString(~num1));
        System.out.println("~num2:    " + (~num2) + " = " + Integer.toBinaryString(~num2));

    }
}
