import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/* 1. Количество слов в тексте.
   На вход программе подается литературный текст. Программа должна
   вывести список слов, встречающихся в тексте, и для каждого слова
   указать количество вхождений этого слова в текст.*/

public class numberWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<String, Integer> wordToCount = new TreeMap<>();
        for (String word : text.replaceAll("[^a-zA-Zа-яА-Я]", " ").replaceAll("  ", " ").split(" ")) {
            wordToCount.put(word, wordToCount.getOrDefault(word, 0) + 1);
        }
        System.out.println(wordToCount);
    }
}
