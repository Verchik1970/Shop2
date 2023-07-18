import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    public ShoppingList() throws FileNotFoundException {

    }
    FileReader fr1 = new FileReader("shoppingbad.txt");


    List<String> shoppingList = new ArrayList();

    public List<String> shList() {
        // добавляем товары в список
        try (BufferedReader br = new BufferedReader(fr1)) {
            String art; //наименование артикля
            int qwt; //количество позиций артикля

            while ((art = br.readLine()) != null) { // читаем строку из файла
                String[] lineWords = art.split("\\n"); // разбиваем строку на слова по строкам

                for (String word : lineWords) {
                    shoppingList.add(word); // добавляем каждое слово в список
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(shoppingList);
        return null;
    }

}


