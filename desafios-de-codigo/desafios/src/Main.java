import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        double M = input.nextDouble();
        double D = input.nextDouble();

        double desconto = ((M-D)/M)*100;
        int desc = (int)desconto; //conversão 

        System.out.println("O desconto foi de "+ desc + "%");
       
    }
}
