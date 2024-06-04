package functionalIinterface.streamApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Desafio09 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        HashSet<Object> n = new HashSet<>();
        boolean seSaoDistintos = numeros.stream()
                .allMatch(n::add);

        if (seSaoDistintos) {
            System.out.println("Todos os números são distintos.");
        } else {
            System.out.println("Existem números repetidos na lista.");
        }

    }
}
