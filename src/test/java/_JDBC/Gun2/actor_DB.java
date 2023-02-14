package _JDBC.Gun2;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class actor_DB extends JDBCParent {
    @Test
    public void test4() throws SQLException {
        // actor tablosundaki tüm satırları ve tüm sütunların test edilmesi.

        getTable("select * from actor");
    }

    public void getTable(String sorgu) throws SQLException {
        ResultSet rs=statement.executeQuery(sorgu);

        ResultSetMetaData rsmd=rs.getMetaData();

        for(int i=1; i<= rsmd.getColumnCount(); i++)
            System.out.printf("%-20s",rsmd.getColumnName(i));

        System.out.println();

        while (rs.next()) // bir sonraki
        {
            for(int i=1; i<= rsmd.getColumnCount(); i++)
                System.out.printf("%-20s",rs.getString(i));

            System.out.println();
        }
    }


}
