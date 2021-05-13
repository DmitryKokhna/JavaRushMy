package Level9.Lesson6.Task3;

//Задача 3
//Исключение при работе с массивами
//Уровень - EASY

//Осваиваем механизм для контроля над ошибками в программе.
// Исключения, то бишь. На этот раз ваше задание — ловля исключений при работе с массивами.
// В приложении есть такие строчки кода: [int[] m = new int[2]; m[8] = 5;].
// Перехватите исключение, возникающее при выполнении этого кода, выведите его на экран и укажите его тип.


//Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
//int[] m = new int[2];
//m[8] = 5;
//
//Требования:
//Программа должна выводить сообщение на экран.
//В программе должен быть блок try-catch.
//Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
//Выведенное сообщение должно содержать тип возникшего исключения.
//Имеющийся код в методе main не удалять.



public class Solution {
    public static void main(String[] args) {
        //code
        int[] m = new int[2];
        try {
            m[8] = 5;
        }
        catch (ArrayIndexOutOfBoundsException outArr){
            System.out.println(outArr);
        }
    }
}
