package ex03;

import java.sql.*;

public class MemberDAO {

	public void selectAll() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:xe",
					"JES","1234"
					);
			PreparedStatement st=con.prepareStatement("select * from member");
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
			}
			rs.close();
			st.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
