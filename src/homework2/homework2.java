package homework2;

import java.sql.SQLOutput;

public class homework2 {
    public static void main(String[] args) {
//        Задача 1
//        Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
        // Ожидаемый результат: 1а 2а 3а .. 100а
        for (int i = 1; i < 101; i++) {
            System.out.print(i + "a ");
        }
        System.out.println("\n");

// Задание №2
        // Дано:
        int ageChildren = 10;
        // Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка, отправляет его в учебное заведение
        // если ребенку до 6 лет то в сад, если до 11 лет в младшую школу, если до 17 лет в среднюю школу, иначе в университет
        // Отправляет - имеется в виду, печатает на экран: "пошел с сад", "пошел в младшую школу" и т.д.
        // Проверьте работоспособность условий, через изменение значения переменной.
        if (ageChildren < 7) {
            System.out.println("пошел в сад");
        } else if (ageChildren < 11) {
            System.out.println("пошел в младшую школу");
        } else if (ageChildren < 17) {
            System.out.println("пошел в среднюю школу");
        } else {
            System.out.println("пошел в университет");
        }
// задача 3
        // Дано:
        boolean chicken = true;
        boolean vegetables = true;
        boolean sour = true;
        boolean toast = false;
        boolean sausage = false;
        boolean eggs = true;
        // Задача: Повара попросили сделать салат.
        // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
        // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
        // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
        // Если ингредиентов нет, то повар объявляет: У меня ничего нет
        // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному). Либо объявить о невозможности сделать салат.
        // Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
        // Проверьте работоспособность условий, через изменение значения переменных.
        if (chicken && vegetables && sour && toast) {
            System.out.println("Цезарь");
        } else if (vegetables && eggs && (sausage || chicken)) {
            System.out.println("Оливье");
        } else if (vegetables) {
            System.out.println("Овощной");
        } else {
            System.out.println("У меня ничего нет");
        }
        System.out.println('\n');

        // Задание №4
        // Создать два класса, которые описывают какое либо животное (имеют два атрибута).
        // Написать к ним конструктор, сеттеры, геттеры.
        // Создать экземпляры этих двух животных.
        Cat boris = new Cat(16.2, "red");
        Mice mikkie = new Mice(0.2, "grey");
        System.out.println(boris.getWeight());
        boris.setColour("white");
        System.out.println(boris.getColour());
        System.out.println(mikkie.getWeight());
        mikkie.setColour("black");
        System.out.println(mikkie.getColour());
        System.out.println('\n');
        // Продвинутый уровень
        // Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
        double increment = 0.01123;
        double result = 0;
        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.
        int j = 0;
        while (result <= 1_000_000){
            if (result < 0) {
                break;
            }
            result = result + increment;
            j ++;
        }
        System.out.println(result);
        System.out.println(j -=1);
        System.out.println('\n');

        // Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый четный элемент на 0;
        // Например, дано: [1,1,1,1,1]
        // Ожидаемый результат: [0,1,0,1,0]
        // Подсказка: прочитай про операнд "%".
        int[] numbers = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        for (int k = 0; k < numbers.length; k++) {
//            System.out.println(numbers[k]);
            if (k % 2 == 1){
                numbers[k] = 0;
//                System.out.println(numbers[k]);
            }
            else {
                numbers[k] = numbers[k];
//                System.out.println(numbers[k]);
            }
            System.out.print(numbers[k] + ",");
        }
    }
}
