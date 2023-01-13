import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        //Alt+Enter para importar a classa Scanner

        //variáveis e tipos
        String nome;
        int idade;
        
        while (true){
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = scan.nextInt();
        
        }
        System.out.println("Continua aqui...");
    }
}
