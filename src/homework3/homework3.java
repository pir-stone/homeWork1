package homework3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class homework3 {
    public static void main(String[] args) throws IOException {
//        Задача 1
        Toyota toyota = new Toyota();
        Lada lada = new Lada();
        toyota.music();
        toyota.light();
        toyota.stop();
        toyota.move();
        lada.breaks();
        lada.light();
        lada.stop();
        lada.move();
//        Задача 2
        String filename = "C:\\Users\\user\\IdeaProjects\\homeWork\\src\\homework3\\my.txt";
        FileWriter fileWriter = new FileWriter(filename);
        fileWriter.write("Моя бабушка" + "\n" +"читает газету жизнь");
        fileWriter.close();
        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            System.out.print(line+" ");
        }
        fileReader.close();
        bufferedReader.close();

//        Задача 3
        Financial_record record = new Financial_record(500,300);
        String filename2 = "C:\\Users\\user\\IdeaProjects\\homeWork\\src\\homework3\\report.txt";
        FileWriter fileWriter2 = new FileWriter(filename2);
        fileWriter2.write("доходы = " + record.getIncome() + ", расходы = " + record.getOutcome());
        fileWriter2.close();
    }
}
