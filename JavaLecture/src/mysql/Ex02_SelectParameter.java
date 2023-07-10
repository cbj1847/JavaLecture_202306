package mysql;

import java.sql.*;

public class Ex02_SelectParameter {

	public static void main(String[] args) {

	}
	
	static void select(String countryCode, int num) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(
					 "jdbc:mysql://localhost:3306/world", 
					 "ysuser", "yspass");
			String sql = "SELECT * FROM city where countrycode=? limit ?;";
			
			// SQL에 파라미터 셋팅
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, countryCode);
			pstmt.setInt(2, num);
			
			// SELECT 실행
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String countrycode = rs.getString(3);
				String district = rs.getString(4);
				int population = rs.getInt(5);
				System.out.printf("%d %s %s %s %d\n", id, name, countrycode, district, population);
		 }
			rs.close(); pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
