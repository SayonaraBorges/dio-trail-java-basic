import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int fatorial = teclado.nextInt();

        int multiplicacao=1;

        System.out.print(fatorial+"!=");

        for (int i=fatorial; i>=1; i--){
            multiplicacao = multiplicacao*i;
        }

        System.out.println(multiplicacao);
    }
    
}
