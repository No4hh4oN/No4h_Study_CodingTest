package oracle_DBstudy.awtTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Awt_MemberDAO {
    String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521/orcl";
    String user = "c##sahmyook";
    String password = "1234";

    private Connection con;
    private Statement stmt;
    private ResultSet rs;

    public ArrayList<Awt_MemberVo> list(String id) {
        ArrayList<Awt_MemberVo> list = new ArrayList<>();

        try {
            connDB();

            String query = "SELECT * FROM ACCOUNT";
            if (id != null) {
                query += " WHERE ID = '" + id + "'";
            }
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                String accountId = rs.getString("ID");
                String accountPassword = rs.getString("PASSWORD");

                Awt_MemberVo data = new Awt_MemberVo(accountId, accountPassword);
                list.add(data);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return list;
    }

    public void connDB() {
        try {
            Class.forName(driver);
            System.out.println("JDBC driver loading success.");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Oracle connection success.");
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("Statement create success.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
