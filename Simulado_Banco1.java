class Cliente {
    String nome;
    String sobrenome;
    String cpf;
}

class Conta {
    int numero;
    double saldo;
    Cliente titular = new Cliente();

    boolean saca(double valor) {
        if (this.saldo < valor) {
            return false;
        }
        else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }
    void deposita(double quantidade) {
        this.saldo += quantidade;
    }
    boolean transferePara(Conta destino, double valor) {
        boolean retirou = this.saca(valor);
        if (retirou == false) {
            // não deu pra sacar!
            return false;
        }
        else {
            destino.deposita(valor);
            System.out.println(this.titular.nome +" transferiu o valor de '"+ valor +"' para "+ destino.titular.nome);
            System.out.println("Saldo atual de "+ this.titular.nome + " é de "+ this.saldo);
            return true;
        }
    }
}
class Simulado_Banco {
    public static void main(String[] args) {
        // criando a conta
        Conta minhaConta = new Conta();
        // outra conta
        Conta minhaConta2 = new Conta();

        // outra conta com foco objetivo
        Conta meuSonho;
        meuSonho = new Conta();
        meuSonho.saldo = 1500000;

        // alterando os valores de minhaConta
        minhaConta.titular.nome = "Duke";
        minhaConta.saldo = 1000;
        System.out.println(minhaConta.saldo + " de saldo atual da conta do "+ minhaConta.titular.nome);
        // alterando da minhaconta2
        minhaConta2.titular.nome = "Derick";
        minhaConta2.saldo = 5000;
        System.out.println(minhaConta2.saldo + " de saldo atual da conta do "+ minhaConta2.titular.nome);

        // saca 200 reais minhaconta
        minhaConta.saca(200);
        System.out.println(minhaConta.saldo + " de saldo atual, 200 sacado da conta do "+ minhaConta.titular.nome);

        // deposita 500 reais minhaconta
        minhaConta.deposita(500);
        System.out.println(minhaConta.saldo + " de saldo atual, 500 depositado da conta do "+ minhaConta.titular.nome);
    
        int x = 2000;

        if (minhaConta.saca(x)) {
            System.out.println("Consegui sacar o valor "+ x +" do "+ minhaConta.titular.nome);
        } else {
            System.out.println("Não consegui sacar o valor "+ x +" do "+ minhaConta.titular.nome);
        }
        if (meuSonho.saca(x)) {
            System.out.println("Consegui sacar o valor "+ x +" do 'meuSonho'");
        } else {
            System.out.println("Não consegui sacar"+ x +" do 'meuSonho'");
        }
        
        minhaConta.transferePara(minhaConta2,100);
    }
}
