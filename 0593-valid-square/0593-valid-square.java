class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        return checkRightTriangle(p1, p2, p3) &&
               checkRightTriangle(p1, p3, p4) &&
               checkRightTriangle(p1, p2, p4) &&
               checkRightTriangle(p2, p3, p4);
    }

    private boolean checkRightTriangle(int[] pointA, int[] pointB, int[] pointC) {
        int xA = pointA[0], yA = pointA[1];
        int xB = pointB[0], yB = pointB[1];
        int xC = pointC[0], yC = pointC[1];

        int distanceAB = squaredDistance(xA, yA, xB, yB);
        int distanceAC = squaredDistance(xA, yA, xC, yC);
        int distanceBC = squaredDistance(xB, yB, xC, yC);

        return (distanceAB == distanceAC && distanceAB + distanceAC == distanceBC && distanceAB > 0) ||
               (distanceAB == distanceBC && distanceAB + distanceBC == distanceAC && distanceAB > 0) ||
               (distanceAC == distanceBC && distanceAC + distanceBC == distanceAB && distanceAC > 0);
    }

    private int squaredDistance(int x1, int y1, int x2, int y2) {
        return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
    }
}
