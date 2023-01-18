import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class RegistroTemperaturas {
    public static void main(String[] args)   {
        Scanner teclado = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();
        
        int contador=0;
        while (true){
            if (contador == 6) break;

            System.out.print("--\tDigite a temperatura:");
            double registro = teclado.nextDouble();
            temperaturas.add(registro);
            contador++;

        }
        System.out.println("----------------------------------------");
            
        System.out.println("--\tTodos os registros de temperaturas\t--");
        temperaturas.forEach(t -> System.out.println(t+" "));

        double media = temperaturas.stream()
            .mapToDouble(Double::doubleValue)
            .average()
            .orElse(0d);
        System.out.printf("\nMédia das Temperaturas: %.1f\n", media);

        System.out.println("Temperaturas acima da média: ");
        temperaturas.stream()
                .filter(t -> t> media)
                .forEach(t -> System.out.printf("%.0f ",t));

        System.out.println("\n\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator = temperaturas.iterator();
        contador=0;
        while (iterator.hasNext()){
            Double registro = iterator.next();
            if (registro> media){
                switch (contador){
                    case (0): System.out.printf("1 - janeiro: %.0f\n ", registro);
                    break;
                    case (1): System.out.printf("2 - fevereiro: %.0f\n ", registro);
                    break;
                    case (2): System.out.printf("3 - março: %.0f\n ", registro);
                    break;
                    case (3): System.out.printf("4 - abril: %.0f\n ", registro);
                    break;
                    case (4): System.out.printf("5 - maio: %01f\n ", registro);
                    break;
                    case (5): System.out.printf("6 - junho: %.0f\n ", registro);
                    break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            contador++;
        }


    }
}


