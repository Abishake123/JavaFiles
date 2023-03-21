import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String args[]) {
        try {

            // Class.forName("java.lang.Thread");

            Class.forName("com.mysql.jdbc.Driver");// calling and registiring the driver

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/food", "root", "1234");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from meat");

            // System.out.println("Result Set : " + r);

            // List<Shop> shops = new ArrayList<>();

            while (rs.next()) {

            // Shop shop = new Shop();

            // shop.setId(rs.getInt(1));

            // shop.setShopName(rs.getString(2));

            // shops.add(shop);

            System.out.println("id : "+ rs.getInt(1) +" meatName : " +rs.getString(2));

            }

            con.close();

            // System.out.println("Result : " + shops);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
