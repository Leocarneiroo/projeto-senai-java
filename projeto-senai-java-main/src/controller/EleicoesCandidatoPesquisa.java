package controller;

import java.util.List;

import dao.CandidatoPDao;
import eleicoes.CandidatoPesquisa;

public class CanditatoPController {
	
	public static final CandidatoPesquisa CandidatoPesquisa = null;

	public class CandidatoController {
		
		public void salvar(CandidatoPesquisa candidato) throws Exception {
			if (eleicoes.CandidatoPesquisa.getDescricao() == null || ((CandidatoPesquisa) eleicoes.CandidatoPesquisa.getDescricao()).trim().equals("")) {
				throw new Exception("Descriçăo do produto inválida");
			}
			CandidatoPDao.getInstance().salvar(CandidatoPesquisa);
		}
		
	public void atualizar (CandidatoPesquisa candidato) throws Exception {
		if (eleicoes.CandidatoPesquisa.getDescricao() == null || ((CandidatoPesquisa) eleicoes.CandidatoPesquisa.getDescricao()).trim().equals("")) {
			throw new Exception("Descriçăo do produto inválida");
		}
		CandidatoPDao.getInstance().atualizar(CandidatoPesquisa);
	}

	public void excluir (int idcandidatoPesquisa) {
		CandidatoPDao.getInstance().excluir(CandidatoPesquisa);
		
	}
	public List<CandidatoPesquisa> listar(){
			return null;
	}
}
}