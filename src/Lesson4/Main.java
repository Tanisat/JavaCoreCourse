package Lesson4;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String[] myWords = {
                "Кошка", "Собака", "Крыса", "Сурок", "Кот", "Кролик",
                "Выдра", "Енот", "Паук", "Жираф", "Обезьяна", "Птица",
                "Паук", "Лев", "Собака", "Корова", "Медведь"
        };
        countUniqueWordsIn(myWords);
        System.out.println("--------------------------");

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addNewPhoneToName("89111111111", "Иванов");
        phoneBook.addNewPhoneToName("89222222222", "Петров");
        phoneBook.addNewPhoneToName("89333333333", "Сидоров");
        phoneBook.addNewPhoneToName("89444444444", "Крылов");
        phoneBook.addNewPhoneToName("89555555555", "Иванов");
        phoneBook.addNewPhoneToName("89666666666", "Сидоренко");
        phoneBook.addNewPhoneToName("89777777777", "Астахов");
        phoneBook.addNewPhoneToName("89888888888", "Крылов");
        phoneBook.addNewPhoneToName("89999999999", "Остапенко");

        System.out.println(phoneBook.getPhonesBy("Иванов"));
        System.out.println(phoneBook.getPhonesBy("Петров"));
        System.out.println(phoneBook.getPhonesBy("Сидоров"));
        System.out.println(phoneBook.getPhonesBy("Крылов"));
        System.out.println(phoneBook.getPhonesBy("Сидоренко"));
        System.out.println(phoneBook.getPhonesBy("Астахов"));
        System.out.println(phoneBook.getPhonesBy("Остапенко"));



    }
    public static void countUniqueWordsIn(String[] array) {
        HashMap<String, Integer> wordsToCount = new HashMap<>();
        final int firstTimeSee = 1;
        for (String word : array) {
            if (wordsToCount.containsKey(word)) {
                int count = wordsToCount.get(word);
                wordsToCount.put(word, count + 1);
            } else {
                wordsToCount.put(word, firstTimeSee);
            }
        }
        for (Map.Entry<String, Integer> wordEntry : wordsToCount.entrySet()) {
            if (wordEntry.getValue() == firstTimeSee) {
                System.out.println("Уникальные слова: " + wordEntry.getKey());
            }
        }
        System.out.println("--------------------------");
        for (Map.Entry<String, Integer> wordEntry : wordsToCount.entrySet()) {
            System.out.println(wordEntry.getKey() + " : " + wordEntry.getValue());
        }
    }



}
