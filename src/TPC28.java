import poly.A;

public class TPC28 {
    public static void main(String[] args) {

        A a = new A();
        a.display();
//        System.out.println(a.toString());
        System.out.println(a); // 재정의 하지 않으면 Object --> toString : 번지값

        Object o = new A(); // upcasting
        ((A)o).display();
        System.out.println(o.toString());
    }
}
