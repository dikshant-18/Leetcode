class Solution {
    public String solveEquation(String equation) {
        String[] sequ = equation.split("=");
        int[] a = f(sequ[0]), b = f(sequ[1]);
        int x1 = a[0], y1 = a[1];
        int x2 = b[0], y2 = b[1];
        if (x1 == x2) {
            return y1 == y2 ? "Infinite solutions" : "No solution";
        }
        return "x=" + (y2 - y1) / (x1 - x2);
    }
    int[] f(String s) {
        int x = 0, y = 0;
        if (s.charAt(0) != '-') {
            s = "+" + s;
        }
        int i = 0, n = s.length();
        while (i < n) {
            int sn = s.charAt(i) == '+' ? 1 : -1;
            ++i;
            int j = i;
            while (j < n && s.charAt(j) != '+' && s.charAt(j) != '-') {
                ++j;
            }
            String v = s.substring(i, j);
            if (v.endsWith("x")) {
                x += sn * (v.length() > 1 ? Integer.parseInt(v.substring(0, v.length() - 1)) : 1);
            } else if (!v.isEmpty()) {
                y += sn * Integer.parseInt(v);
            }
            i = j;
        }
        return new int[] {x,y};
    }
}
