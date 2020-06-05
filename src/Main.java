import dynamic_programming.LCS;

public class Main{
    public static void main(String[] args) {
        System.out.println("Leetcode solution testing...");
        LCS lcs = new LCS();
        int fw , bw, dp;
        String x = "AGGTAB";
        String y = "GXTXAYB";
        fw = lcs.lcsFW(x,y);
        bw = lcs.lcsBW(x,y);
        dp = lcs.lcsDP(x,y);

        System.out.println("fw "+fw);
        System.out.println("bw "+bw);
        System.out.println("dp "+dp);

    }
}