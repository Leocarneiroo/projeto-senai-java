package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import eleicoes.Candidato;
import eleicoes.Pesquisa;

public class CandidatoDao {
	
	private static CandidatoDao instance;
	private List <Candidato> listaCandidato = new ArrayList <>();
	private Statement ConnectionUtil;
	private Connection con = ConnectionUtil.getConnection();
		public static CandidatoDao getInstance() {
		if (instance == null) {
			instance= new CandidatoDao();
			
		}
			return instance;
	}
	

public void salvar(Candidato candidato) {
	listaCandidato.add(candidato);
	
	try {
		String sql = "insert into Candidato (nome, cpf, endereco, telefone) values (?, ?, ?, ?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1,Candidato.getNome());
		pstmt.setString(2, Candidato.getIdCandidato());
		pstmt.setString(3, Candidato.getLocalPesquisa());
		pstmt.setString(4,Candidato.getFichaLimpaCandidato());
		pstmt.execute();
	} catch (SQLException e) {
		e.printStackTrace();
	}

		
	}
	
public void atualizar (Candidato candidato) throws SQLException {
	listaCandidato.set(candidato.getId(), candidato);
	try {
	String sql = "update Candidato set nome = ?, cpf = ?, endereco = ?, telefone = ? where id = ?";
	PreparedStatement pstmt = con.prepareStatement(sql);
	pstmt.setString(1,Candidato.getNome());
	pstmt.setString(2, Candidato.getIdCandidato());
	pstmt.setString(3, Candidato.getLocalPesquisa());
	pstmt.setString(4,Candidato.getFichaLimpaCandidato());
	pstmt.execute();
}   
	catch (SQLException e) {
	e.printStackTrace();
}
}

public void excluir (int idcandidato) {
	listaCandidato.remove(idcandidato);
	
	try {
		String sql = "delete from Candidato where id = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, idcandidato);
		pstmt.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}

public List<Candidato> listar(){
		return listaCandidato;
		try {
			String sql = "select * from Candidato";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Candidato c = new Candidato();
				c.setId(rs.getInt("idcandidato"));
				c.setNome(rs.getString("Nome"));
				c.setLocaPesquisa(rs.getString("Cidade: "));
				c.setfichaLimpaCandidato(rs.getString("Candidato é Ficha Limpa? "));
				listaCandidato.add(c);
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
			return listaCandidato;
		

}
		
		



public void registrarPesquisa(Pesquisa pesquisa) {
}
}