package controller;

import dao.CandidatoDao;
import eleicoes.Pesquisa;

public class PesquisaController {
	
	
	

	public void registrarPesquisa(Pesquisa pesquisa) throws Exception {
		if (Pesquisa.getdataPesquisa == null) {
			throw new Exception("Data Inválida");
		}
	
		if (Pesquisa.getCandidato() == null) {
			throw new Exception("Candidato Inválido");
		}
		CandidatoDao.getInstance().registrarPesquisa(pesquisa);
	
	}
}