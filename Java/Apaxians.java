// Solving Apaxiaaaaaaaaaaaans!
// https://open.kattis.com/problems/apaxiaaans

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Apaxians {
    
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        char[] chars = input.toCharArray();

        sc.close();

        for (char c : chars) {
            if (map.containsKey(c)) {
                int counter = map.get(c);
                map.put(c, ++counter);
            } else {
                map.put(c, 1);
            }
        }

        for (char c : map.keySet()) {
            if (map.get(c) > 1) {
                String pattern = String.format("%s+", c);
                input = input.replaceAll(pattern, Character.toString(c));
            }
        }

        System.out.println(input);
    }
}