class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        Deque <String> queue = new ArrayDeque<>();
        Set<String> vstd = new HashSet<>();
        queue.offer(startGene);
        vstd.add(startGene);
        int mut = 0;
        char[] genes = {'A', 'C', 'G', 'T'};
        Set<String> bankSet = new HashSet<>(Arrays.asList(bank));
        if (!bankSet.contains(endGene)) return -1;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int s = 0; s < size; s++ ) {
                String cur = queue.poll();
                if(cur.equals(endGene)) {
                    return mut;
                }
                char[] currArr = cur.toCharArray();
                for(int i = 0; i < currArr.length; i++) {
                    char origin = currArr[i];
                    for(char g : genes) {
                        if(g == origin) continue;
                        currArr[i] = g;
                        String next = new String(currArr);
                        if(!vstd.contains(next) && bankSet.contains(next)) {
                            vstd.add(next);
                            queue.offer(next);
                        }
                    }
                    currArr[i] = origin;
                }
            }
            mut++;
        }
        return -1;
    }
}