import com.google.gson.Gson;
import org.ietf.jgss.GSSContext;
import tpc.*;

public class TPC18 {
    public static void main(String[] args) {

        // 1. 자바에서 제공해주는 class들.. API
        // 문자열(Stirng)
        String str = new String("APPLE");
        System.out.println(str.toLowerCase());

        // 2. 직접 만들어서 사용하는 class들... DTO/VO, DAO, Utility .. API
        MyUtil my = new MyUtil();
        int sum = my.hap();
        System.out.println(sum);

        // 3. 다른 회사에서 만들어 놓은 class들.. API
        // Gson -> Json
        Gson g = new Gson();
        // 이전에 만든 BookVO를 이용해 실슯하나 이후부터 라이브 코딩을하여 부득이 실습하지 못함.

    }
}
