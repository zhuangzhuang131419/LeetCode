package Q134;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (gas.length != cost.length) return -1;
        if (gas.length == 0) return -1;

        int[] rest = new int[gas.length];



        for (int i = gas.length - 1; i >= 0; i--) {
            rest[i] = cost[i] - gas[i] + rest[(i + 1) % gas.length];
            if (rest[i] == 0) {
                return i;
            }
        }
        return -1;
    }

}
