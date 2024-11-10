public class ExemploExcept1 {
    public static void main(String[] args) {
        int result, num1, num2;
        try {
            // Suspeitamos que este bloco de instruções pode lançar uma exceção,
            // então tratamos disso colocando estas instruções dentro de try e
            // manipulamos a exceção no bloco catch
            num1 = 0;
            num2 = 25;
            result = num2 / num1;  // Isso causará uma ArithmeticException
            System.out.println(result);
            System.out.println("Estou no bloco try");
        } catch (ArithmeticException e) {
            // Executa apenas se ocorrer uma exceção do tipo ArithmeticException
            // no bloco try
            System.out.println("Divisão por zero não permitida!");
        }
        System.out.println("Fora do bloco try/catch");
    }
}
