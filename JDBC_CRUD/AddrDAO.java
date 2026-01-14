package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AddrDAO {
	Connection conn = null;
	
	PreparedStatement psmt = null;
	
	ResultSet rs = null;
	
	public void getConn() {
		String url = "";
		String user = "";
		String password = "";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB성공!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			if(rs != null) {
				rs.close();
			}
			if(psmt != null) {
				psmt.close();
			}
			if(conn != null) {
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public ArrayList<AddrDTO> select() {
		getConn();
		ArrayList<AddrDTO> list = new ArrayList<AddrDTO>();
		try {
			String sql = "select * from addr";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				String n = rs.getString(1);
				int age = rs.getInt(2);
				String gender = rs.getString(3);
				String address = rs.getString(4);
				String tel = rs.getString(5);
				String mail = rs.getString(6);
				
				AddrDTO dto = new AddrDTO(n, age, gender, address, tel, mail);
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		close();
		return list;
	}
	public ArrayList<AddrDTO> selectOne(String category, String text) {
		getConn();
		ArrayList<AddrDTO> list = new ArrayList<AddrDTO>();
		try {
			String sql = "select * from addr where "+category+"=?";
			psmt = conn.prepareStatement(sql);
			if(category.equals("age")) {
				psmt.setInt(1, Integer.parseInt(text));
			} else {
				psmt.setString(1, text);
			}
			rs =psmt.executeQuery();
			while(rs.next()) {
				String n = rs.getString(1);
				int age = rs.getInt(2);
				String gender = rs.getString(3);
				String address = rs.getString(4);
				String tel = rs.getString(5);
				String mail = rs.getString(6);
				
				AddrDTO dto = new AddrDTO(n, age, gender, address, tel, mail);
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		close();
		return list;
	}
	public void insert(String n, int age, String gender, String address, String tel, String mail) {
		getConn();
		try {
			String sql = "insert into addr values(?,?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, n);
			psmt.setInt(2, age);
			psmt.setString(3, gender);
			psmt.setString(4, address);
			psmt.setString(5, tel);
			psmt.setString(6, mail);
			psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		close();
	}
	public void update(String n, int age, String gender, String address, String tel, String mail, String key_n) {
		getConn();
		try {
			String sql = "update addr set n=?, age=?, gender=?, address=?, tel=?, mail=? where n=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, n);
			psmt.setInt(2, age);
			psmt.setString(3, gender);
			psmt.setString(4, address);
			psmt.setString(5, tel);
			psmt.setString(6, mail);
			psmt.setString(7, key_n);
			psmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		close();
	}
	public void delete(String n) {
		getConn();
		try {
			String sql = "delete from addr where n=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, n);
			psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		close();
	}
	
}
