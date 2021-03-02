package Level8.Lesson8.Task6;

//Задача 6
// Только для богачей
//Уровень - Medium

//Наш заказчик — казино «Риге-Тау» с планеты Диблублублу.
// Крайне заносчивые ребята, но платят хорошо.
// Они заказали нам сделать программу автоматической рассылки писем потенциальным клиентам.
// Не пугайтесь, джуниору (вам) поручена простая задача:
// создать словарь типа «фамилия»-«зарплата» и удалить из него тех, у кого зарплата ниже 500 кредитов.

//Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
//Удалить из словаря всех людей, у которых зарплата ниже 500.
//
//Требования:
//Программа не должна выводить текст на экран.
//Программа не должна считывать значения с клавиатуры.
//Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
//Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {

    public static Map<String, Integer> createMap(){
        Map<String,Integer> staf = new HashMap<>();
        staf.put("staf1",495);
        staf.put("staf2",496);
        staf.put("staf3",497);
        staf.put("staf4",498);
        staf.put("staf5",499);
        staf.put("staf6",500);
        staf.put("staf7",501);
        staf.put("staf8",503);
        staf.put("staf9",504);
        staf.put("staf10",505);

        return staf;
    }

    public static void removeItemFromMap(Map<String, Integer> map){

        for(Map.Entry<String, Integer> pair : map.entrySet()){
           if( pair.getValue()< 500)
           {
            map.remove(pair.getKey());
            }
             }
       System.out.println(map);
        }




    public static void main(String[] args) {

 System.out.println(createMap().toString());

       removeItemFromMap();

    }


}
