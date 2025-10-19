class Solution {
    public String findLexSmallestString(String s, int a, int b) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        String result = s;
        
        queue.offer(s);
        visited.add(s);
        
        while (!queue.isEmpty()) {
            String current = queue.poll();
            if (current.compareTo(result) < 0) {
                result = current;
            }
            char[] chars = current.toCharArray();
            for (int i = 1; i < s.length(); i += 2) {
                chars[i] = (char) ((chars[i] - '0' + a) % 10 + '0');
            }
            String added = new String(chars);
            if (visited.add(added)) {
                queue.offer(added);
            }
            String rotated = current.substring(s.length() - b) + current.substring(0, s.length() - b);
            if (visited.add(rotated)) {
                queue.offer(rotated);
            }
        }
        
        return result;
    }
}