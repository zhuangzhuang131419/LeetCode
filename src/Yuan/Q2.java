package Yuan;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0, x;
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int [] value = new int[n];

        for (int i = 0; i < arr.length; i++) {
            value[i] += arr[i][0];
            for (int j = 0; j < arr.length; j++) {
                if (j == i) continue;
                if (arr[j][1] - 2 == i) {
                    if (arr[j][0] > 0) {
                        value[i] += arr[j][0];
                    }
                }
            }
        }


        

        int max = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i] > max) {
                max = value[i];
            }
        }

        System.out.println(max % 1000000003);
    }
}
