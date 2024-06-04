package functionalIinterface.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio14 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> maiorNumeroPrimo = numeros.stream()
                .distinct()
                .filter(Desafio14::seEPrimo)
                .reduce((_, b) -> b);

        if (maiorNumeroPrimo.isEmpty()) {
            System.out.println("Não há números primos na lista.");
        } else {
            System.out.println("O maior número primo da lista é: " + maiorNumeroPrimo.get());
        }
    }

    private static boolean seEPrimo(int numero) {
        boolean result = true;
        if (numero <= 1) {
            result = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
