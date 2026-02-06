class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int s1 = calsc(player1);
        int s2 = calsc(player2);
        
        if (s1 > s2) return 1;
        if (s2 > s1) return 2;
        return 0;
    }
    
    private int calsc(int[] scores) {
        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            boolean bonus = (i > 0 && scores[i - 1] == 10) || (i > 1 && scores[i - 2] == 10);
            total += bonus ? 2 * scores[i] : scores[i];
        }
        return total;
    }
}