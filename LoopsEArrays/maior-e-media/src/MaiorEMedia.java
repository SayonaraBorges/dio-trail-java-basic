import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        int maiorNum = 0;
        int soma = 0;

        int contador =0;

        do {
            System.out.println("Digite um número: ");
            numero = teclado.nextInt();

            soma = soma + numero;

            if (numero > maiorNum) maiorNum=numero;
            contador++;
            
        } while (contador<5);     

        System.out.println("Maior: "+maiorNum);
        System.out.println("Média: "+(soma/5));
    }
}
