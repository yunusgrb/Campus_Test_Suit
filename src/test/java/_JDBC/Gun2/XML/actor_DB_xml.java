package _JDBC.Gun2.XML;

import _JDBC.JDBCParent;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class actor_DB_xml extends JDBCParent {

//    Soru : getTable için yaptığını örneğin aynısını,
//    bir XML filedan sorguyu parametre olarak göndererek bir Test için yapınız.

    @Test
    @Parameters("mesaj")
    public void test3(String mesaj) throws SQLException
    {
        getTable(mesaj);
    }

    public static void getTable(String sql) throws SQLException {
        ResultSet rs = statement.executeQuery(sql);
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            System.out.printf("%-20s", rsmd.getColumnName(i));

        }

        System.out.println();

        while (rs.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.printf("%-20s", rs.getString(i));

            }
            System.out.println();

        }

    }
}
