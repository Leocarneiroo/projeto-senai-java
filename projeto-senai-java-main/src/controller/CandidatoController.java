package controller;

import java.util.List;

import dao.CandidatoDao;
import eleicoes.Candidato;

public class CandidatoController {
	
	public void salvar(Candidato candidato) throws Exception {
		if (Candidato.getNome() == null || ((Candidato) Candidato.getNome()).length() <=3) {
			throw new Exception("Nome Inválido");
		
		}
		CandidatoDao.getInstance().salvar(candidato);
	}
	
public void atualizar (Candidato candidato) throws Exception {
	if (Candidato.getNome() == null || ((Candidato) Candidato.getNome()).length()<=3) {
		throw new Exception("Nome Inválido");
	}
	CandidatoDao.getInstance().atualizar(candidato);
}

public void excluir (int idcandidato) throws Exception {
	if(idcandidato == 0) {
		throw new Exception("Nenhum Candidato Selecionado");
	}
	
	CandidatoDao.getInstance().excluir(idcandidato);
}
public List<Candidato> listar() {
		return CandidatoDao.getInstance().listar();
}
}