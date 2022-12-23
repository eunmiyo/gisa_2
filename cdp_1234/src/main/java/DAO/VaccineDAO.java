package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VaccineDAO {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public static Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager
				.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "gisa", "gisa1234");
		return con;
	}
	
	public int vaccine(HttpServletRequest request, HttpServletResponse response) {
		String resvno = request.getParameter("resvno");
		String jumin = request.getParameter("jumin");
		String vcode = request.getParameter("vcode");
		String hcode = request.getParameter("hcode");
		String resvdate = request.getParameter("resvdate");
		String resvtime = request.getParameter("resvtime");
		int result = 0;
		
		try {
			conn = getConnection();
			String sql = "INSERT INTO TBL_VACCRESV_202108 VALUES(?, ?, ?, ?, ?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, resvno);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
