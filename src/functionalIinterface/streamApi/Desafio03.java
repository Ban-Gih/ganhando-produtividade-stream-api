package functionalIinterface.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Desafio03 {

    public static void main(String[] args) {


        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        numeros.forEach(numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero + " É positivo");
            } else {
                System.out.println(numero + " Não é positivo");
            }
        });
    }
}


