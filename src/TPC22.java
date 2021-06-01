import tpc.*;

public class TPC22 {
    public static void main(String[] args) {

        Animal ani = new Cat();
        ani.eat();

        ((Cat)ani).night();

        ani = new Dog();
        ani.eat();
        // 다형성
        // 상위클래스가 하위 클래스에게 동일한 메세지로 서로다르게 동작시키는 원리

        Object o = new Dog();
        ((Dog)o).eat();
    }
}
