import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        int qtdnum;
        int qtdpares=0; int qtdimpares=0;
       
        
        System.out.println("Digite a quantidade de números que deseja inserir: ");
        qtdnum = teclado.nextInt();
        
        int contador =0;
        do {
            System.out.println("Informe um número: ");
            numero = teclado.nextInt();
            
            if (numero %2 ==0) qtdpares++;
            else qtdimpares++;

        contador++;
        } while( contador < qtdnum);

        System.out.println("Quantidade de números pares: "+qtdpares);
        System.out.println("Quantidade de números impares: "+qtdimpares);

    }
}
