package functionalIinterface.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio15 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -5, -4, -3);

        List<Integer> seHaNegativos = numeros.stream()
                .distinct()
                .filter(num -> num < 0)
                .toList();

        if (!seHaNegativos.isEmpty()) {
            System.out.println("Há números negativos: "+seHaNegativos);
        } else {
            System.out.println("Não há números negativos");
        }
    }
}