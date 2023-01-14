public class ex1Metodos {
    public static void main(String[] args) {
        System.out.println("Exibindo resultados: ");
        Calculadora.somar(8,2);
        Calculadora.subtrair(9, 6);
        Calculadora.dividir(20, 4);
        Calculadora.multiplicar(3, 4);

        System.out.println("Exidindo mensagem: ");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(19);

        System.out.println("Empréstimo: ");
        Emprestimo.calcular(1000, Emprestimo.DuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.TresParcelas());
        Emprestimo.calcular(1000, 5);
        
    }
}
