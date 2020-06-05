package dynamic_programming;

public class LCS {

    public int lcsFW(String x, String y) {
        int xLen = x.length();
        int yLen = y.length();
        if (xLen == 0 || yLen == 0) {
            return 0;
        } else if (x.charAt(0) == y.charAt(0)) {
            return 1 + lcsFW(x.substring(1), y.substring(1));
        } else {
            return Math.max(lcsFW(x.substring(1), y), lcsFW(x, y.substring(1)));
        }
    }

    public int lcsBW(String x, String y) {
        int xLen = x.length();
        int yLen = y.length();
        if (xLen == 0 || yLen == 0) {
            return 0;
        } else if (x.charAt(xLen - 1) == y.charAt(yLen - 1)) {
            return 1 + lcsFW(x.substring(0, xLen - 1), y.substring(0, yLen - 1));
        } else {
            return Math.max(lcsFW(x.substring(0, xLen - 1), y), lcsFW(x, y.substring(0, yLen - 1)));
        }
    }

    public void printDP(int[][] arr, int m, int n) {
        for (int i=0; i< m; i++){
            for (int j=0; j< n;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }

    public int lcsDP(String x, String y){
        int m = x.length();
        int n = y.length();
        int[][] dp = new int[m+1][n+1];
//        System.out.println("ROW Len "+dp.length);
//        System.out.println("COL Len "+dp[0].length);
        for (int i=0; i < m+1; i++) {
            for (int j=0; j <n+1; j++){
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
                else if (x.charAt(i-1) == y.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }
                else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp[m][n];
    }
}