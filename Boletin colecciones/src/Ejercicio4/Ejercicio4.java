package Ejercicio4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,2,3,4));

        System.out.println(reverse(integerList));
    }

    public static <T> List<T> reverse(List<T> lista){
        return lista.stream().collect(ArrayList::new, (a , b)-> a.add(0, b), ArrayList::addAll);
    }

}
