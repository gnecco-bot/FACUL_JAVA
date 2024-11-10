public class ExemploExcept2 {
    public static void main(String[] args) {
        try {
            int[] a = new int[4];
            // a[4] = 30 / 0; // Isso causaria uma ArithmeticException se descomentado
            a[5] = 31; // Isso causará uma ArrayIndexOutOfBoundsException
            System.out.println("Primeira declaração impressa no bloco try");
        } catch (ArithmeticException e) {
            System.out.println("Aviso: ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Aviso: ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Aviso: Outro tipo de exception");
        }
        System.out.println("Fora do bloco try-catch...");
    }
}