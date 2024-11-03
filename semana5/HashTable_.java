import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable_ {
    public static void main(String[] args) {
        Enumeration<String> names;
        String key;

        // Cria a tabela hash
        Hashtable<String, String> hashtable = new Hashtable<String, String>();

        // Adiciona o par chave/valor
        hashtable.put("Chave1", "UNIVESP");
        hashtable.put("Chave2", "USP");
        hashtable.put("Chave3", "UNICAMP");
        hashtable.put("Chave4", "UNESP");
        hashtable.put("Chave1", "Mona");
        hashtable.put("Chave1","Mona");
         // Substitui "UNIVESP" por "Mona" na chave "Chave1"
         
        // Obtém todas as chaves e valores
        names = hashtable.keys();
        while (names.hasMoreElements()) {
            key = names.nextElement();
            System.out.println("Chave: " + key + " & Valor: " + hashtable.get(key));
        }
    }
}
