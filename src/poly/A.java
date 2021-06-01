package poly;
import java.lang.*; //todfir

public class A extends Object {

    public A() {//생략
        super();//생략
    }

    public void display() {
        System.out.println("나는 A이다.");
    }

    //tostring 재정의
    @Override
    public String toString() {
        return "재정의 메서드 입니다.";
    }
}

