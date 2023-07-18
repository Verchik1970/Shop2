import java.io.FileNotFoundException;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Bakery bakery = new Bakery();
        List<String> lineWords1 = bakery.addToBakery();//вызываем список товаров с бакалее
        ShoppingList shoppingList = new ShoppingList();
        List<String> lineWords2 = shoppingList.shList();// вызываем список покупок
        StringBuilder result = new StringBuilder();
        for (String words2 : lineWords1) {
            for (String words1 : lineWords2) {
                if (words1.equals(words2)) {
                    System.out.println(result);

                }
            }
        }
    }
}