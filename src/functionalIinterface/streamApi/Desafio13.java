package functionalIinterface.streamApi;

import java.util.Arrays;
import java.util.List;

public class Desafio13 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPorIntervalo = numeros.stream()
                .distinct()
                .filter(num -> num >= 5 && num <= 10)
                .toList();
        System.out.println("Numeros entre 5 e 10: " + numerosPorIntervalo);
    }
}