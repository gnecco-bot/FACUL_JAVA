import java.util.Collection;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class hashset {
    private static final String colors[] = { "vermelho", "branco", "azul", "verde", "laranja", "branco", "cinza", "azul" };

    // cria conjunto de array para eliminar duplicatas
    private void printNonDuplicates(Collection<String> collection) {
        // cria um HashSet
        Set<String> set = new HashSet<String>(collection);
        System.out.println("\nNonduplicates are: ");
        for (String s : set)
            System.out.printf("%s ", s);
        System.out.println();
    } // fim do método printNonDuplicates

    // cria ArrayList e gera sua saída
    public hashset() {
        List<String> list = Arrays.asList(colors);
        System.out.printf("ArrayList: %s\n", list);
        printNonDuplicates(list);
    } // fim do construtor SetTest

    public static void main(String args[]) {
        new hashset();
    } // fim do main
} // fim da classe SetTest