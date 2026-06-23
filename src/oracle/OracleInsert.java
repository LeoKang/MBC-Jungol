package oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleInsert {
    public static void main() {
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "c##mbc";
        String password = "qwer1234";

        try{
            Class.forName(driver);
            System.out.println("jdbc driver loading success.");
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("oracle connection success.\n");
            Statement stmt = conn.createStatement();

            // 1. deptno의 최대값 조회
            String sql1 = "select max(deptno) from dept";
            ResultSet rs = stmt.executeQuery(sql1);
            String maxno = "";
            while(rs.next()) {
                maxno = rs.getString("max(deptno)");
                System.out.println(maxno);
            }
            int imaxno = Integer.parseInt(maxno) + 10;

            String ideptno = String.valueOf(imaxno), sdname = "IT", sloc = "SEOUL";
            String sql = "INSERT INTO dept VALUES ('" + ideptno + "','" + sdname + "','" + sloc + "')";
            boolean b = stmt.execute(sql);
            if(!b) {
                System.out.println("Insert success.\n");
            }else{
                System.out.println("Insert fail.\n");
            }

            String sql2 = "SELECT * FROM dept";
            ResultSet rs2 = stmt.executeQuery(sql2);
            while(rs2.next()) {
                System.out.print(rs2.getString("deptno") + " ");
                System.out.print(rs2.getString("dname") + " ");
                System.out.print(rs2.getString("loc") + "\n");
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
