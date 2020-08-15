package Yuan;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0, x;
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int max = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i][1] > max) {
                max = arr[i][1];
            }
        }

        int[] time = new int[max + 1];

        for (int i = 0; i < n; i++) {
            for (int j = arr[i][0] + 1; j <= arr[i][1]; j++) {
                time[j]++;
            }
        }

        max = -1;
        for (int i = 0; i < time.length; i++) {
            if (time[i] > max) {
                max = time[i];
            }
        }

        System.out.println(max);


//        Arrays.sort(arr, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if (o1[0] == o2[0]) {
//                    return o1[1] - o2[1];
//                }
//                return o1[0] - o2[0];
//            }
//        });
//
//        HashMap<int[], Integer> map = new HashMap<>();
//        map.put(arr[0], 1);
//        for (int i = 1; i < n; i++) {
//            HashMap<int[], Integer> newMap = new HashMap<>();
//            for (int[] a :map.keySet()) {
//                if (arr[i][0] == a[0]) {
//                    if (arr[i][1] == a[1]) {
//                        newMap.put(a, map.get(a) + 1);
//                    } else if (arr[i][1] > a[1]){ // arr[i][1] > a[1]
//                        newMap.put(a, map.get(a) + 1);
//                        newMap.put(new int[]{a[1], arr[i][1]}, 1);
//                    } else { // arr[i][1] < a[1]
//                        newMap.put(new int[]{a[0], arr[i][1]}, map.get(a) + 1);
//                        newMap.put(new int[]{arr[i][1], a[1]}, map.get(a));
//                    }
//                } else {
//                    if (arr[i][0] >= a[1]) {
//                        newMap.put(a, map.get(a));
//                        newMap.put(arr[i], 1);
//                    } else if (arr[i][1] < a[1]){
//                        newMap.put(new int[]{a[0], arr[i][0]}, map.get(a));
//                        newMap.put(new int[]{arr[i][0], arr[i][1]}, map.get(a) + 1);
//                        newMap.put(new int[]{arr[i][1], a[1]}, map.get(a));
//                    } else if (arr[i][1] == a[1]){
//                        newMap.put(new int[]{a[0], arr[i][0]}, map.get(a));
//                        newMap.put(new int[]{arr[i][0], arr[i][1]}, map.get(a) + 1);
//                    } else {
//                        newMap.put(new int[]{a[0], arr[i][0]}, map.get(a));
//                        newMap.put(new int[]{arr[i][0], a[1]}, map.get(a) + 1);
//                        newMap.put(new int[]{a[1], arr[i][1]}, 1);
//                    }
//                }
//            }
//            map = newMap;
//        }
//
//        int max = -1;
//        for (Integer i: map.values()) {
//            if (i > max) {
//                max = i;
//            }
//        }
//        System.out.println(max);
    }
}
