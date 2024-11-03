import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_ {
    public static void main(String args[]) {
        // Declaração do TreeMap
        TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();

        // Adiciona elementos
        tmap.put(1, "UNIVESP");
        tmap.put(7, "USP");
        tmap.put(6, "UNICAMP");
        tmap.put(4, "UNESP");
        tmap.put(5, "UFMG");

        // Mostra o conteúdo usando o Iterator
        Set<Map.Entry<Integer, String>> set = tmap.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> mentry = iterator.next();
            System.out.print("A chave é: " + mentry.getKey() + " & o valor é: ");
            System.out.println(mentry.getValue());
        }
    }
}
