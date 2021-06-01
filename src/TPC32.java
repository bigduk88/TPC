import tpc.Dbconnect;
import tpc.JavaMySQL;
import tpc.JavaOracle;

public class TPC32 {
    public static void main(String[] args) {

        Dbconnect conn = new JavaOracle();
        conn.getConnection("url", "bit", "1234");

        conn = new JavaMySQL();
        conn.getConnection("url", "root", "ABCD");

    }
}
