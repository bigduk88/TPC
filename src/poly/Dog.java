package poly;

public class Dog extends Animal {
    // 이름, 나이, 종 : 상태 정보

    public Dog(){
        super();
    }

    @Override
    public void eat() {
        System.out.println("개처럼 먹다.");
    }
}
