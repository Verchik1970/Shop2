import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Bakery {


    FileReader fr = new FileReader("bakery.txt");

    List<String> bakery = new ArrayList<>();

    public Bakery() throws FileNotFoundException {
    }

    // добавляем в бакалею артикли
    public List<String> addToBakery() {
        List<String> bakeryArticles = new ArrayList<>();
        try (BufferedReader br1 = new BufferedReader(fr)) {
            String art; //наименование артикля
            int qwt; //количество позиций артикля

            while ((art = br1.readLine()) != null) { // читаем строку из файла
                String[] lineWords = art.split("\\n"); // разбиваем строку на слова по строкам

                for (String word : lineWords) {
                    bakeryArticles.add(word); // добавляем каждое слово в список
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(bakeryArticles);
        return bakeryArticles;
    }
}