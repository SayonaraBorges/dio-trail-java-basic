import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        int nota;
        
        System.out.println("Informe um valor: ");
        nota = scan.nextInt();
        
        while(nota<0 || nota>10){
            System.out.println("Nota inválida. Digite novamente.");
            System.out.println("Informe um valor: ");
            nota = scan.nextInt();
        }
        System.out.println("Fim");
    }
}
