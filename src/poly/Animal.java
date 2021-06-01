package poly;

public abstract class Animal { // 추상클래스(불완전한객체) -> Animal ani = new Animal(); x

    public abstract void eat(); // 추상클래스(불완전한객체)

    public void move() { // 구현메서드
        System.out.println("무리를 지어서 이동한다.");
    }
}
