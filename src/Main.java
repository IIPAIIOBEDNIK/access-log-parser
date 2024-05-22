import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int i = 0;
        int count = 0, maxLengt = 0, minLength = 10000;

        while (true) {
            String path = new Scanner(System.in).nextLine();

            File file = new File(path);
            boolean fileExist = file.exists();

            boolean isDirectory = file.isDirectory();

            if (fileExist == false && isDirectory == false){
                System.out.println("Файл отсутствует или путь ведет к директории");
                continue;
            } else {
                System.out.println("Путь указан верно");
                i++;
                System.out.println("Это файл номер " + i);
            }
            try {
                FileReader fileReader = new FileReader(path);
                BufferedReader reader = new BufferedReader(fileReader);
                String line;
                while ((line = reader.readLine()) != null) {
                    int length = line.length();
                    if (maxLengt <= length){
                        maxLengt = length;
                    } else if (minLength >= length) {
                        minLength = length;
                    }
                    if (length > 1024) {
                        throw new RuntimeException("Row is too biggest");
                    }
                    count++;
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            System.out.println("Общее количество строк в файле:" + count);
            System.out.println("Длина самой короткой строки равна: " + minLength);
            System.out.println("Длина сомой длиной строки равна: " + maxLengt);
        }
    }
}


