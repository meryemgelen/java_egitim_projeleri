package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Birlik;
import beans.Personel;

public class PersonelDB extends DBBase {

	public List<Personel> getPersonelListesi() {
		List<Personel> personeller = new ArrayList<Personel>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			stmt = conn.prepareStatement("select * from personel");
			rs = stmt.executeQuery();
			while (rs.next()) {
				Personel personel = new Personel();
				personel.setId(rs.getInt("id"));
				personel.setTcNo(rs.getString("tcno"));
				personel.setAdi(rs.getString("adi"));
				personel.setSoyadi(rs.getString("soyadi"));
				personeller.add(personel);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs, stmt);
			closeConnection(conn);
		}
		return personeller;

	}

	public List<Birlik> getBirlikListesi() {
		List<Birlik> birlikler = new ArrayList<Birlik>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			stmt = conn.prepareStatement("select * from birlik");
			rs = stmt.executeQuery();
			while (rs.next()) {
				Birlik birlik = new Birlik();
				birlik.setId(rs.getInt("id"));
				birlik.setAdi(rs.getString("adi"));
				birlik.setMevcut(rs.getInt("mevcut"));
				birlik.setSehir(rs.getString("sehir"));
				birlikler.add(birlik);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs, stmt);
			closeConnection(conn);
		}
		return birlikler;
	}
}
