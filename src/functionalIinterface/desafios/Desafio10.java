package functionalIinterface.desafios;

import java.util.Arrays;
import java.util.List;

//Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
//Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.

public class Desafio10 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numero = numeros.stream()
                .distinct()
                .toList();

        List<Integer> multiploDe3 = numero.stream()
                .filter(num -> num % 3 == 0)
                .toList();

        List<Integer> multiploDe5 = numero.stream()
                .filter(num -> num % 5 == 0)
                .toList();

        System.out.println("Multiplos de 3" + multiploDe3);

        System.out.println("Multiplos de 5" + multiploDe5);
    }
}
