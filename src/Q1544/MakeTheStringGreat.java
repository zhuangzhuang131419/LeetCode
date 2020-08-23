package Q1544;

public class MakeTheStringGreat {
    public String makeGood(String s) {
        String s1 = check(s);
        String s2 = s;

        while (s1.length() != s2.length()) {
            s2 = s1;
            s1 = check(s1);
        }

        return s2;
    }

    public String check(String s) {
        StringBuilder sb = new StringBuilder();
        int i;
        for (i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) - 'A' == s.charAt(i + 1) - 'a' || s.charAt(i) - 'a' == s.charAt(i + 1) - 'A') {
                i++;
                continue;
            }
            sb.append(s.charAt(i));
        }
        if (i == s.length() - 1) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
