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
import eleicoes.CandidatoPesquisa;

public class CandidatoPDao {

	
private Connection con;

public void salvar(CandidatoPesquisa candidato) {
	List<CandidatoPesquisa> listaCandidatoPesquisa = new ArrayList<>();
	private Connection con = ConnectionUtil.getConnection();
	
	CandidatoDao getInstance; {
		if (getInstance == null) {
			getInstance = new CandidatoDao();
		}
		return;
	}
}
public void atualizar (CandidatoPesquisa candidato) {
	
	try {
		String sql = "update into Candidato (Nome, id, ficha Limpa (?, ?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, CandidatoPesquisa.getNome());
		pstmt.setString(2, CandidatoPesquisa.getIdCandidatoPesquisa());
		pstmt.setString(3,Candidato.getFichaLimpaCandidato());
		pstmt.execute();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
}


public void excluir (int idcandidatoPesquisa, int idCandidato) {
	try {
		String sql = "delete from Candidato where id = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, idCandidato);
		pstmt.execute();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}

public List<CandidatoPesquisa> listar(List<CandidatoPesquisa> listaCandidato){
	try {
		String sql = "select * from produto";
		java.sql.Statement stmt = con.createStatement();
		ResultSet rs = ((java.sql.Statement) stmt).executeQuery(sql);
		while (rs.next()) {
			Candidato p = new Candidato();
			p.setId(rs.getInt("id"));
			p.setString(1, CandidatoPesquisa.getNome());
			p.setString(3,Candidato.getFichaLimpaCandidato());
			listaCandidato.add(p);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return listaCandidato;
}


public static CandidatoDao getInstance() {
	// TODO Auto-generated method stub
	return null;
}
	
	public static Object getDescricao() {
		// TODO Auto-generated method stub
		return null;
}

	public void excluir(CandidatoPesquisa candidatopesquisa) {
		// TODO Auto-generated method stub
		
	}
}