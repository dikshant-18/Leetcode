class Solution {
    public String entityParser(String text) {
        Map<String, String> map = new HashMap<>();
        map.put("&quot;", "\"");
        map.put("&apos;", "'");
        map.put("&amp;", "&");
        map.put("&gt;", ">");
        map.put("&lt;", "<");
        map.put("&frasl;", "/");

        StringBuilder sb = new StringBuilder();
        int n = text.length();
        int i = 0;

        while (i < n) {
            char c = text.charAt(i);
            if (c == '&') {
                boolean matched = false;

                for (int len = 4; len <= 7 && i + len <= n; len++) {
                    String sub = text.substring(i, i + len);
                    if (map.containsKey(sub)) {
                        sb.append(map.get(sub));
                        i += len;
                        matched = true;
                        break;
                    }
                }
                if (!matched) {
                    sb.append(c);
                    i++;
                }
            } else {
                sb.append(c);
                i++;
            }
        }

        return sb.toString();
    }
}