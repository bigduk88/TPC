import poly.RemoCon;
import poly.*;

public class TPC27 {
    public static void main(String[] args) {

        RemoCon r = new TV();
        for (int i = 0; i < 40; i++) {
            r.chUp();
        }
        for (int i = 0; i < 100; i++) {
            r.chDown();
        }
        r.internet();

    }
}
