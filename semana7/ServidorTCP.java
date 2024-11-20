import java.io.*;
import java.net.*;

public class ServidorTCP {
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;

    // Construtor passando a porta
    public ServidorTCP(int port) {
        try {
            // Inicia o servidor
            server = new ServerSocket(port);
            System.out.println("Servidor inicializado...");
            System.out.println("Esperando pela conexão do cliente...");

            // Aceita a conexão do cliente
            socket = server.accept();
            System.out.println("Cliente conectado!");

            // Lê do socket cliente
            in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

            String line = "";

            // Ler mensagem do cliente até que "Fim" seja recebido
            while (!line.equalsIgnoreCase("Fim")) {
                try {
                    line = in.readUTF();
                    System.out.println("Mensagem recebida: " + line);
                } catch (IOException e) {
                    System.out.println("Erro ao ler mensagem: " + e.getMessage());
                    e.printStackTrace();
                }
            }

            System.out.println("Conexão finalizada!");

            // Fecha a conexão
            socket.close();
            in.close();
        } catch (IOException e) {
            System.out.println("Erro do servidor: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (server != null) server.close();
            } catch (IOException e) {
                System.out.println("Erro ao fechar o servidor: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new ServidorTCP(5000); // Porta onde o servidor escutará
    }
}