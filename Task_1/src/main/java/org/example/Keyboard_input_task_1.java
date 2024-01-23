/**
 *  Программа Keyboard_input_task_1 реализует
 *  алгоритм, вычисляющий среднее арифметическое
 *  цифр дробной части числа X
 *  Организован ввод данных с клавиатуры
 *
 * @атор Томилов Н.С.
 * @версия 1.0
 * @от 2024-01-23
 */

package org.example;
import java.math.BigDecimal;
import java.util.Scanner;

public class Keyboard_input_task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Х: ");
        double x = sc.nextDouble();                // Вводим Х
        double y = Math.floor(x);                  // Находим целую часть
        int count = BigDecimal.valueOf(x).scale(); // Находим количество цифр дробной части
        int count3 = count;
        int sum = 0;
        int count2 = 10;

        if(x/y == 1) {                             // Проверка на отсутствие дробной части
            System.out.println("Ввод: " + x + "\nВывод: 0");
            return;
        } else
            while(count != 0){
                sum += Math.floor(x*count2)%10;        // Ищем сумму
                count--;
                count2 *= 10;                          // Шагаем после запятой
            }

        double result = (double) sum/(double) count3;

        // Для красивого вывода, как в "примерах"
        // (целые выводятся как int, дробные - как double)
        if((result/Math.floor(result)) == 1) {
            System.out.println("Ввод: " + x + "\nВывод: " + (int)result);
        } else {
            System.out.println("Ввод: " + x + "\nВывод: " + result);
        }

    }
}