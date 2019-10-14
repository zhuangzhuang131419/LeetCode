
import java.util.ArrayList;
import java.util.Comparator;

class Main {
    public int solution(int[] A) {
        int[] state = new int[A.length];
        ArrayList<Integer> findIndex = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            state[i] = 0;
        }

        for (int i = 0; i < A.length; i++) {
            findIndex.clear();
            if (state[i] == 0) {
                // do the jump process
                int currentJump = 1;
                int currentIndex = i;
                while (currentIndex != A.length - 1) {
                    int find = currentIndex + 1;
                    if (currentJump % 2 == 0) {
                        // even jump

                        while (A[find] >= A[currentIndex]) {
                            find++;
                            if (find == A.length) {
                                // fail
                                for (int findindex: findIndex) {
                                    state[findindex] = -1;
                                }
                                state[i] = -1;
                                break;
                            }
                        }
                        findIndex.add(find);
                    } else {
                        // odd jump
                        while (A[find] <= A[currentIndex]) {
                            find++;
                            if (find == A.length) {
                                // fail
                                state[i] = -1;
                                break;
                            }
                        }
                    }
                    if (state[i] == -1) {
                        break;
                    }
                    currentJump++;
                    currentIndex = find;
                }

                if (currentIndex == A.length -1) {
                    for (int findindex: findIndex) {
                        state[findindex] = 1;
                    }
                    state[i] = 1;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < state.length; i++) {

            if (state[i] == 1) {
                count++;
            }
        }

        return count;
    }



    class Node {

    }

}

