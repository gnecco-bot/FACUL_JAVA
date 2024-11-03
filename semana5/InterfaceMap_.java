import java.util.HashMap;
import java.util.Map;

public class InterfaceMap_ {
    public static void main(String[] args) {
        Map<Integer, String> mapNames = new HashMap<Integer, String>();
        
        mapNames.put(1, "UNIVESP");
        mapNames.put(2, "USP");
        mapNames.put(3, "UNICAMP");
        mapNames.put(3, "UNESP"); // "UNICAMP" será substituído por "UNESP" na chave 3
        
        System.out.println(mapNames);

        // Resgatando o nome da posição 2
        System.out.println(mapNames.get(2));
    }
}