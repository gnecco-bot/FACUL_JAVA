import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_ {
    public static void main(String args[]) {
        // Declaração do HashMap
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        // Adição de elementos
        hm.put(1, "UNIVESP");
        hm.put(2, "USP");
        hm.put(7, "UNICAMP");
        hm.put(9, "UNESP");
        hm.put(3, "UFMG");

        // Mostra o conteúdo usando o Iterator
        Set<Map.Entry<Integer, String>> set = hm.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> mentry = iterator.next();
            System.out.print("A chave é: " + mentry.getKey() + " & o Valor é: ");
            System.out.println(mentry.getValue());
        }

        // Obtém valor baseado na chave
        String var = hm.get(2);
        System.out.println("Valor no índice 2 é: " + var);

        // Remove valor baseado na chave
        hm.remove(3);
        System.out.println("Chave e valor do mapa após remoção:");
        Set<Map.Entry<Integer, String>> set2 = hm.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            Map.Entry<Integer, String> mentry2 = iterator2.next();
            System.out.print("A chave é: " + mentry2.getKey() + " & o Valor é: ");
            System.out.println(mentry2.getValue());
        }
    }
}