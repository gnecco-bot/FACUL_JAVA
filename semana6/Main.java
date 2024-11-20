import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Criando lista de clientes
        List<Client> clients = Arrays.asList(
            new Client("Angelo", true, 1000),   
            new Client("Helena", false, 1000),
            new Client("Maiara", false, 1000),
            new Client("Isadora", true, 1000)    
        );
        // Criando lista de números
        List<Integer> numbers = Arrays.asList(1, 2, 3, 44, 32, 4, 9, 10, 22, 33);
        
        numbers.stream().filter(v -> v%2 == 0).forEach(value -> System.out.println(value));

        // filtrar clientes vips e aumentar limite
        clients.stream().filter(client -> client.vip).map(filtered -> filtered.limit+1000).forEach(mapped -> System.out.println(mapped));

        // Imprimir lista de clientes
        System.out.println(clients);
    }
}