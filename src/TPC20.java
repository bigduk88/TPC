import tpc.Animal;
import tpc.Cat;
import tpc.Dog;

public class TPC20 {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();

        Cat c = new Cat();
        c.eat();
        c.night();

        Animal ani = new Dog(); // upcasting (자동형변환)
        ani.eat();

        ani = new Cat(); // downcasting (강제형변환)
        ani.eat();
        ((Cat)ani).night();

    }


}
