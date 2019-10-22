package Q67;

/**
 * Given two binary strings, return their sum (also a binary string).
 *
 * The input strings are both non-empty and contains only characters 1 or 0.
 */

public class AddBinary {
    public String addBinary(String a, String b) {
        boolean carryOver = false;
        StringBuilder sb = new StringBuilder();
        int longerLength = Math.max(a.length(), b.length());

        for(int i = 1; i <= longerLength; i++) {

            // This prevents out of index errors
            char aVal = ((a.length() - i) < 0) ? '0' : a.charAt(a.length() - i);
            char bVal = ((b.length() - i) < 0) ? '0' : b.charAt(b.length() - i);

            if(aVal == '0' && bVal == '0') {
                if(carryOver) {
                    sb.append('1');
                    carryOver = false;
                } else {
                    sb.append('0');
                }
            } else if (aVal == '1' && bVal == '1') {
                if(carryOver) {
                    sb.append('1');
                } else {
                    sb.append('0');
                    carryOver = true;
                }
            } else {
                if(carryOver) sb.append('0');
                else sb.append('1');
            }
        }
        if(carryOver) sb.append('1');
        return sb.reverse().toString();
    }
}
