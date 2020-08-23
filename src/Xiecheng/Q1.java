package Xiecheng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        if (k == 0) {
            System.out.println(Arrays.toString(new int[]{}));
            return;
        }
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        // a < b

        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0; i <= k; i++) {
            output.add(i * b + (k - i) * a);
        }

        System.out.println(Arrays.toString(output.toArray()));
    }
}
