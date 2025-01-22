import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

    List<String> list = new ArrayList<>();
        list.add("Rafael");
        list.add("Joao");
        list.add("Cristina");
        list.add(2, "Maria");

        System.out.println(list.size());

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("---------------");
        //remover todos os R da lista
        list.removeIf(x -> x.charAt(0) == 'R');
        for (String x : list){
            System.out.println(x);
        }

        //encontrar o index da lista
        System.out.println("---------------");
        System.out.println("Index of bob " + list.indexOf("Cristina"));

        System.out.println("---------------");
        //filtrar a lista so para a inicial C
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'C').collect(Collectors.toList());
        list.removeIf(x -> x.charAt(0) == 'R');
        for (String x : result){
            System.out.println(x);
        }
    }
}