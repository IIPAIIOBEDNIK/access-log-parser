import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;

        while (true) {
            String path = new Scanner(System.in).nextLine();

            File file = new File(path);
            boolean fileExist = file.exists();

            boolean isDirectory = file.isDirectory();

            if (fileExist == false && isDirectory == false){
                System.out.println("Файл отсутствует и путь ведет к директории");
                continue;
            } else {
                System.out.println("Путь указан верно");
                i++;
                System.out.println("Это файл номер " + i);
            }

        }
    }
}
