import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args)   {
        System.out.println("Crie uma lista e adicione as sete notas: ");
        //criar uma lista
        List<Double> notas = new ArrayList<Double>();
        //preenchendo
        notas.add(7d);
        notas.add(8.5d);
        notas.add(9.3d);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6d);
        System.out.println(notas.toString()); //.toString Opcional

        //outra forma de criar e preencher uma List
        //List<Double> notas = new ArrayList<>(Arry.asList(7d, 8.5d, 9.3d, 5d, 7d, 0d, 3.6d));

        System.out.println("Mostre a posição da nota 5.0: "+ notas.indexOf(5d));
        System.out.println("Adicionar da lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);
        System.out.println("Confira se a nota 5.0 esta na lista: "+notas.contains(5d));
        System.out.println("Mostre todas as notas na ordem que foram inseridas: ");
        for (Double nota : notas) System.out.println(nota);
        //aula parte 2
        System.out.println("Mostre a 3ª nota adicionada: "+notas.get(2));
        System.out.println("Qual a menor nota da lista? "+ Collections.min(notas));
        System.out.println("Qual a menor nota da lista? "+ Collections.max(notas));
        
        //Como realizar SOMA
        //chama o metoro iterator e cria variavel do tipo iterator
        Iterator<Double> iterator = notas.iterator();
        Double soma =0d;
        while (iterator.hasNext()){ //para saber se tem um proximo
            Double next = iterator.next();// variavel recebe valor e segue para o proximo
            soma += next; //realiza a soma
        }
        System.out.println("Exiba a soma dos valores: "+soma);
        System.out.println("Exiba a soma dos valores: "+soma/notas.size());

        System.out.println("Remova a nota 0:  ");
        notas.remove(5);
        System.out.println("Remova a nota na posição 5:  ");
        notas.remove(7d);
        System.out.println(notas);

        System.out.println("Remova todas as notas menores que 7.0: ");
        Iterator<Double> iterator2=notas.iterator();
        while (iterator2.hasNext()){
            Double next = iterator2.next();
            if (next<7) iterator2.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista!");
        notas.clear();
        System.out.println("Confira se a lista está vazia: "+notas.isEmpty());

        
       }
}
