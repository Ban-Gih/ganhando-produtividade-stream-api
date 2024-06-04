package functionalIinterface.streamApi;

import java.util.Arrays;
import java.util.List;

public class Desafio06 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean maiorQueDez = numeros.stream()
                .anyMatch(num -> num > 10);

        if (maiorQueDez){
            System.out.println("Tem numero maior que 10");
        }else {
            System.out.println("Nao tem numero maior que 10");
        }
    }
}
