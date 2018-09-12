package pl.coderslab.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GenerateRandom {
    public static void main(String[] args) {
        System.out.println(checkRand(500000,10));

    }
    public static Map<Integer, Integer> checkRand(int amount, int interval){
        Map<Integer, Integer> randMap = new HashMap<>();
        Random random = new Random();
        Integer counter = 0;
        for (int i = 0; i<amount;i++) {
            int numb = random.nextInt(interval);
            if (!randMap.containsKey(numb)) {
                counter = 1;
                randMap.put(numb,counter);
            }else {
                counter = randMap.get(numb);
                counter++;
                randMap.put(numb, counter);
            }
        }

        return randMap;
    }
}
//`public static Map<Integer, Integer> checkRand(int amount, int interval)`,
//metoda ta ma zwracać mapę wystąpień wartości losowych generowanych za pomocą klasy `Random`.
//
//Kluczem mapy ma być losowana liczba, wartością ilość jej wystąpień.
//
//Parametry:
//- `amount` - oznaczają ilość losowań jaka ma być wykonana.
//- `interval` - zakres wartości dla metody klasy `nextInt` klasy `Random`.
//
//Przykładowy wynik wyświetlenia elementów mapy dla wywołania metody z parametrami `amount` = 500000
// oraz `interval` = 10:
//
//````
//0 : 50082
//1 : 49956
//2 : 49771
//3 : 50001
//4 : 50036
//5 : 49699
//6 : 50082
//7 : 50272
//8 : 50094
//9 : 50007