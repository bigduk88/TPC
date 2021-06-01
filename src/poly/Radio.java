package poly;

public class Radio implements RemoCon{

    @Override
    public void chUp() {
        System.out.println("라디오 채널을 올립니다.");
    }

    @Override
    public void chDown() {
        System.out.println("라디오 채널을 내립니다.");
    }

    @Override
    public void internet() {
        System.out.println("인터넷을 사용할 수 없습니다.");
    }
}
