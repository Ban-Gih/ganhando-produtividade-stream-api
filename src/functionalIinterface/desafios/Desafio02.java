package functionalIinterface.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

//Desafio 2 - Imprima a soma dos números pares da lista:
//Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.

public class Desafio02 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        BinaryOperator<Integer> somar = Integer::sum;

        int resultado = numeros.stream()
                        .reduce(0, Integer::sum);

        System.out.println("A soma de todos os números é : " + resultado);
    }
}
