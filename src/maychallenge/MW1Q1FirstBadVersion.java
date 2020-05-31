package maychallenge;

public class MW1Q1FirstBadVersion {
    public boolean isBadVersion(int n){
        return false;
    }
    public int fbv(int n) {
        int left = 1;
        int right = n;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid))
                right = mid;
            else
                left = mid+1;
        }
        return left;
    }
}
