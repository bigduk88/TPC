package tpc;

public class JavaOracle implements Dbconnect {

    @Override
    public void getConnection(String url, String user, String password) {

        System.out.println("오라클 DB에 연결합니다.");

    }
}
