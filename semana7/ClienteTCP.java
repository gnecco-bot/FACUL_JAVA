import java.io.*;
import java.net.*;

public class ClienteTCP {
    private Socket socket;
    private DataOutputStream out;

    // Construtor da classe, passando endereço e porta
    public ClienteTCP(String address, int port) {
        try {
            // Estabelece a conexão
            socket = new Socket(address, port);
            System.out.println("Conexão estabelecida...");

            // Lê dados do terminal usando BufferedReader
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            // Envia dados para o socket
            out = new DataOutputStream(socket.getOutputStream());

            // String para ler mensagem da entrada
            String line = "";

            // Leia até que receba "Fim"
            while (!line.equalsIgnoreCase("Fim")) {
                System.out.print("Digite uma mensagem: ");
                line = input.readLine(); // Lê do terminal
                if (line != null) {
                    out.writeUTF(line);   // Envia ao servidor
                }
            }

            // Fecha a conexão
            input.close();
            out.close();
            socket.close();
            System.out.println("Conexão encerrada.");
        } catch (UnknownHostException u) {
            System.out.println("Host desconhecido: " + u.getMessage());
        } catch (IOException i) {
            System.out.println("Erro de E/S: " + i.getMessage());
        }
    }

    public static void main(String[] args) {
        new ClienteTCP("127.0.0.1", 5000); // Inicializa o cliente
    }
}