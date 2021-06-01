package tpc;

public class JavaMySQL implements Dbconnect {

    @Override
    public void getConnection(String url, String user, String password) {

        System.out.println("MySQL DB에 연결합니다.");

    }
}
