class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        StringBuilder result = new StringBuilder();
        if ((numerator > 0) ^ (denominator > 0)) {
            result.append("-");
        }
        
        long n = Math.abs((long)numerator);
        long d = Math.abs((long)denominator);
        
        result.append(n / d);
        n %= d;
        if (n == 0) return result.toString();
        
        result.append(".");
        Map<Long, Integer> map = new HashMap<>();
        while (n != 0) {
            if (map.containsKey(n)) {
                result.insert(map.get(n), "(");
                result.append(")");
                break;
            }
            map.put(n, result.length());
            n *= 10;
            result.append(n / d);
            n %= d;
        }
        return result.toString();
    }
}
