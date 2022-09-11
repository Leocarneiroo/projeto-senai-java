package tables;
import java.time.LocalDate;

public class Principal2 {
    public static void testeCandidato() {
		Candidato cand1 = new Candidato();
		cand1.setNomeCandidato("João da Silva");
		cand1.setPartidoCadidato("PPP");
		cand1.setFichaLimpaCandidato("sim");

		CandidatoController controller = new CandidatoController();
		try {
			controller.salvar(cand1);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		for (CandidatoController c : controller.listar()) {
			System.out.println(c.toString());
		}
		
	}
	
	public static void testePesquisa() {
		Pesquisa pesq1 = new Pesquisa();
		pesq1.setInstitutoPesquisa("Data Folha");
		pesq1.setDataPesquisa(LocalDate.now());
		pesq1.setLocalPesquisa("Florianópolis");
		pesq1.setMediaIdadePesquisa(0);
		pesq1.setTipoPesquisa("4899991111");
		pesq1.setFormatoPesquisa("direto");

		PesquisaController controller = newPesquisaController();
		try {
			controller.salvar(pesq1);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		for (PesquisaController p : controller.listar()) {
			System.out.println(p.toString());
		}
		
	}
	
	public static void testeResultado() {
		CandidatoPesquisa candPesq1 = new CandidatoPesquisa();
		candPesq1.setVotosCandidatoPesquisa(0);
		
	}
}
