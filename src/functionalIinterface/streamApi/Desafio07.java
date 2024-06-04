package functionalIinterface.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio07 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoMaior = numeros.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        segundoMaior.ifPresentOrElse(
                integer -> System.out.println("O segundo maior número é: " + integer),
                () -> System.out.println("Não foi possível encontrar o segundo maior número")
        );
    }
}
