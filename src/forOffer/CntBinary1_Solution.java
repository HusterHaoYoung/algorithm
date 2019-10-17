package forOffer;

public class CntBinary1_Solution {
    int cnt1(int num) {
        int cnt = 0;
        while (num != 0) {
            cnt++;
            num = num & (num - 1);
        }
        return cnt;
    }
}
