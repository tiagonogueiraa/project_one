package dio.curso;

public class MainBinary {

    public static void main(String[] args){

        var value1 = 60;
        var binary1 = Integer.toBinaryString(value1);

        System.out.printf("Primeiro número da operação %s (representacao binária %s) \n", value1, binary1);

        var value2 = 85;
        var binary2 = Integer.toBinaryString(value1);

        System.out.printf("Segundo número da operação %s (representacao binária %s) \n", value2, binary2);


        var result = value1 | value2;

        var binaryResult = Integer.toBinaryString(result);

        System.out.printf("%s | %s = %s (representação binária %s )\n", value1, value2, result, binaryResult);

        var result2 = value1 << value2;

        var binaryResult2 = Integer.toBinaryString(result);

        System.out.printf("%s << %s = %s (representação binária %s )\n", value1, value2, result2, binaryResult2);

        var result3 = value1 >>> value2;

        var binaryResult3 = Integer.toBinaryString(result);

        System.out.printf("%s >>> %s = %s (representação binária %s )\n", value1, value2, result3, binaryResult3);

        var num1 = 6;
        var num2 = 12;
        System.out.println("\nOperações bitwise:");
        System.out.println("AND (&):  " + (num1 & num2) + " = " + Integer.toBinaryString(num1 & num2));
        System.out.println("OR  (|):  " + (num1 | num2) + " = " + Integer.toBinaryString(num1 | num2));
        System.out.println("XOR (^):  " + (num1 ^ num2) + " = " + Integer.toBinaryString(num1 ^ num2));
        System.out.println("~num1:    " + (~num1) + " = " + Integer.toBinaryString(~num1));
        System.out.println("~num2:    " + (~num2) + " = " + Integer.toBinaryString(~num2));

    }
}
