package poly;

import java.util.Currency;

public class TV implements RemoCon{
    int currCH = 70;
    @Override
    public void chUp() {
        if (currCH < RemoCon.MAXCH) {
            currCH++;
            System.out.println("채널을 올립니다." + currCH);
        } else {
            currCH = 0;
        }

    }

    @Override
    public void chDown() {
        if (currCH > RemoCon.MINCH) {
            currCH--;
            System.out.println("채널을 내립니다." + currCH);
        } else {
            currCH = 101;
        }

    }

    @Override
    public void internet() {
        System.out.println("인터넷을 사용합니다.");
    }
    //TV의 독자적 기능이 있다면 추가적인 기능을 구현할 수 있다.
}
