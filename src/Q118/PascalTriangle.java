package Q118;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    List<List<Integer>> output = new ArrayList<>();
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return new ArrayList<>();
        }

        if (numRows == 1) {
            ArrayList<Integer> list = new ArrayList();
            list.add(1);
            output.add(list);
            return output;
        }
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        output.add(temp);
        for (int i = 0; i < numRows - 1; i++) {
            temp = helpGen(temp);
            output.add(temp);
        }

        return output;
    }

    public List<Integer> helpGen(List<Integer> lastRow) {
        ArrayList<Integer> newRow = new ArrayList<>();
        newRow.add(1);
        for (int i = 0; i < lastRow.size() - 1; i++) {
            newRow.add(lastRow.get(i) + lastRow.get(i + 1));
        }
        newRow.add(1);

        return newRow;
    }
}
