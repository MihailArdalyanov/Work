package lesson4;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] words = {"сыр", "часы", "зажигалка", "телефон", "пылесос", "сумка", "телефон", "зарядка", "часы",
                "очки"};
        HashMap<String, Integer> uniauqWords = new HashMap <>();
        for (int i = 0; i < words.length; i++) {
            if (uniauqWords.containsKey(words[i])) {
                uniauqWords.put(words[i], uniauqWords.get(words[i])+ 1);

            }else {
                uniauqWords.put(words[i], 1);
            }
        }
        System.out.println(uniauqWords);

    }
}
