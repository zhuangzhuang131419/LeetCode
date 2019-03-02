package Practice;

import java.util.Scanner;

public class WriteLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] lengthForEachLetter = new int[26];
        for (int i = 0; i < 26; i++) {
            lengthForEachLetter[i] = sc.nextInt();
        }
        sc.nextLine();
        String letter = sc.nextLine();
        int currentCol = 0;
        int currentRow = 1;
        for (int i = 0; i < letter.length(); i++) {
            currentCol += lengthForEachLetter[letter.charAt(i) - 'a'];
            if (currentCol > 100) {
                currentRow += currentCol / 100;
                currentCol %= 100;
            }
        }

        System.out.print(currentRow + " " + currentCol);

    }
}
