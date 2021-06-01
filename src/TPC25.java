import poly.Animal;
import poly.Cat;
import poly.Dog;

public class TPC25 {
    public static void main(String[] args) {
        // eat() -> 재정의 했다는 전제하에 다형성 보장됨.
        Animal ani = new Dog();
        ani.eat();
        ani.move();

        ani = new Cat();
        ani.eat();
        ((Cat)ani).night();
        ani.move();
    }
}
