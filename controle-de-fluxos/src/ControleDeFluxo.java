public class ControleDeFluxo {
    public static void main(String[] args) {
        
        definirMes();
        ifinformeFerias();
        qualMesFerias();
        escolheDiaSemana();
        
    }

        private static void definirMes() {

            int mes = 9;
            if (mes == 1) {
                System.out.println("Janeiro");
            } else if (mes == 2) {
                System.out.println("Fevereiro");
            } else if (mes == 3) {
                System.out.println("Março");
            } else if (mes == 4) {
                System.out.println("Abril");
            } else if (mes == 5) {
                System.out.println("Maio");
            } else if (mes == 6) {
                System.out.println("Junho");
            } else if (mes == 7) {
                System.out.println("Julho");
            } else if (mes == 8) {
                System.out.println("Agosto");
            } else if (mes == 9) {
                System.out.println("Setembro");
            } else if (mes == 10) {
                System.out.println("Outubro");
            } else if (mes == 11) {
                System.out.println("Novembro");   
            } else if (mes == 12) {
                System.out.println("Dezembro");
            } else {
                System.out.println("Mês indefinido");
            }
    
        }

        private static void ifinformeFerias() {

            String mes = "Maio";
            if (mes == "julho" || mes == "dezembro" || mes == "janeiro") {
                System.out.println("Férias");
            } else {
                System.out.println("Error!");
            }
        }
        
        private static void qualMesFerias() {

            String mes = "dezembro";
            switch (mes) {
                case "dezembro":
                case "julho":
                case "janeiro":
                    System.out.println("Férias");
                    break;
                default:
                    System.out.println("Mês Indefinido");
                    break;
            }
        
        }

        private static void escolheDiaSemana() {

            String dia = "Sextou ;)";
            switch (dia){
                case "Segunda":
                    System.out.println(2);
                    break;
                case "Terça":
                    System.out.println(3);
                    break;
                case "Quarta":
                    System.out.println(4);
                    break;
                case "Quinta":
                    System.out.println(5);
                    break;
                case "Sexta":
                    System.out.println(6);
                    break;
                case "Sábado":
                    System.out.println(7);
                    break;
                case "Domingo":
                    System.out.println(1);
                    break;
                default:
                //System.out.println(1);
                    System.out.println("Dia inválido: " + dia);
                    break;
            }
        }
}

