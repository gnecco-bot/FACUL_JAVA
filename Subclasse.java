import pacote.Superclasse;

public class Subclasse extends Superclasse {
    public void imprimeMetodo(){ 
        super.imprimeMetodo();
        System.out.println("Impresso na Subclasse");
    }
    public static void main(String[] args){
        Subclasse s = new Subclasse();
        s.imprimeMetodo();
    }
}