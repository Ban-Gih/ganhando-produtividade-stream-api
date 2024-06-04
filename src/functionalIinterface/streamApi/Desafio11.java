package functionalIinterface.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Desafio11 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> somaQuadrados = numeros.stream()
                .filter(num -> num % 2 == 0)
                .toList();
        BinaryOperator<Integer> somar = Integer::sum;

        int resultado = somaQuadrados.stream()
                .reduce(0, somar);

        System.out.println("O resultado é: " + resultado);
    }
}
