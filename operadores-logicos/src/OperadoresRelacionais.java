public class OperadoresRelacionais {
    public static void main(String[] args) {
        boolean b1= true;
        boolean b2 = false;
        boolean b3 =true;
        boolean b4 = false;

        System.out.println("b1 && b2 é "+ (b1 && b2));
        System.out.println("b1 && b3 é "+ (b1 && b3));
        System.out.println("b2 || b3 é "+ (b2 || b3));
        System.out.println("b2 && b4 é "+ (b2 || b4));
        System.out.println("b1 ^ b3 é "+ (b1 ^ b3));
        System.out.println("b4 ^ b2 é "+ (b4 ^ b1));

        System.out.println("!b1 é "+!b1);
        System.out.println("!b2 é "+!b2);

        int i1=10;
        int i2=5;
        float f1=20f;
        float f2=50f;
        System.out.println("((i1+i2)>(f2-f1))&& true é: " + (((i1+i2)>(f2-f1))&& true));
        System.out.println("(i1>i2)||(f2<f1) é: " + ((i1>i2)||(f2<f1)));
        System.out.println("========================******************========================");

        //boas práticas com valores intermediários e reduzir a extensão do códico e facilita o entendimento
        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;
        int quantidadeDependentes = 4;
        int mediaDependetes =2;
        System.out.println((salarioMensal<mediaSalario) && (quantidadeDependentes>=mediaDependetes));

        boolean salarioBaixo = salarioMensal<mediaSalario;
        boolean muitosDependentes = quantidadeDependentes>=mediaDependetes;
        
        System.out.println((salarioBaixo)&&(muitosDependentes));
        
        boolean recebeAuxilio = (salarioBaixo)&&(muitosDependentes);
        System.out.println("Recebe auxílio: "+ recebeAuxilio);

    }
}
