// Solving Honor thy Parents
// https://open.kattis.com/problems/apaxianparent

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HonorThyParents {
    private static final List<Character> vowels = Arrays.asList('a', 'i', 'o', 'e', 'u', 'A', 'E', 'I', 'O', 'U');

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        var input = sc.nextLine();

        sc.close();

        var names = input.split(" ");
        var y = names[0];
        var p = names[1];

        String name;

        if (y.endsWith("e")) {
            name = String.format("%sx%s", y, p);
        } else if (y.endsWith("ex")) {
            name = String.format("%s%s", y, p);
        } else if (vowels.contains(y.charAt(y.length() - 1))) {
            var z = y.substring(0, y.length() - 1);
            name = String.format("%sex%s", z, p);
        } else {
            name = String.format("%sex%s", y, p);
        }

        System.out.println(name);
    }
}
