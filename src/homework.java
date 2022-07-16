public class homework {
    public static void main(String[] args) {
//        задача 1

        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        String result = hi.trim() + world.toLowerCase() + newLine;
        String newresult = result.repeat(3);
        System.out.println(newresult);

//        задача 2

    double lenth = 1.82;
    int weight = 90;
    double bodyIndex = weight / (lenth * lenth);
        System.out.println(bodyIndex + " kg/m2"+ '\n');

        // задача 3
        //Создать из массива букв a,b,c,d,e, строку,вывести на экран , поменять в массиве 4 букву по счету на h,
        //и снова создать строку, вывести на экран
        //Ожидаемый результат:
        //abcde
        //abche
        char[] array = new char[]{'a','b','c','d','e'};
        System.out.println(array);
        array[3] = 'h';
        System.out.println(array);

//        продвинутый
//        задача 1
        //Произвести преобразование текста "234" в число типа int и прибавить к этому числу
        // длину строки "some_text"
        String text = "234";
        String text2 = "some_text";
        int answer = Integer.parseInt(text);
        System.out.println(answer + text2.length() + "\n");

// задача 2
        //Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5
        int a = 3;
        int b = 5;
        int c = (a + b) * (a + b);
        System.out.println(c);

    }
}
