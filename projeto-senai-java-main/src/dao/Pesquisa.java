package dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.ConnectionUtil;
import eleicoes.Candidato;
import eleicoes.Pesquisa;

public class PesquisaDao {
	
	private static PesquisaDao instance;
	private List<Pesquisa> listaPesquisa = new ArrayList<>();
	private Connection con = ConnectionUtil.getConnection();
	
	public static PesquisaDao getInstance() {
		if (instance == null) {
			instance = new PesquisaDao();
		}
		return instance;
	}
	public void registrarPesquisa(Pesquisa venda) {
		try {
			
			String sql = "insert into  dados pesquisa) values (?, ?, ?)"; 
			
			PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			pstmt.setString(1, java.sql.Date.valueOf(Pesquisa.rs("id")));
			PreparedStatement pstmt1 = con.prepareStatement(sql);
			pstmt1.setString(1,Candidato.getNome());
			pstmt1.setString(2, Candidato.getIdCandidato());
			pstmt1.setString(3, Candidato.getLocalPesquisa());
			pstmt1.setString(4,Candidato.getFichaLimpaCandidato());
			
			int key = pstmt1.executeUpdate();
			
			if (key > 0) {
			
				ResultSet rs = pstmt1.getGeneratedKeys();
				rs.next();
				int idVenda = rs.getInt(1);
			
			
				String sqlItemVenda = "insert into dados pesquisa) values (?, ?, ?, ?)";
				PreparedStatement pstmtItemVenda = con.prepareStatement(sqlItemVenda);
				for (Pesquisa item : Pesquisa.getPesquisa()) {
					pstmt1.setString(1,Candidato.getNome());
					pstmt1.setString(2, Candidato.getIdCandidato());
					pstmt1.setString(3, Candidato.getLocalPesquisa());
					pstmt1.setString(4,Candidato.getFichaLimpaCandidato());
					
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}