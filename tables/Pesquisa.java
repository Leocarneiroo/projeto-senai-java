package tables;
import java.time.LocalDate;

public class Pesquisa {
    private int idPesquisa;
	private String institutoPesquisa;
	private LocalDate dataPesquisa;
	private String localPesquisa;
	private int mediaIdadePesquisa;
	private String tipoPesquisa;
	private String formatoPesquisa;
	
	public int getIdPesquisa() {
		return idPesquisa;
	}
	public void setIdPesquisa(int idPesquisa) {
		this.idPesquisa = idPesquisa;
	}
	public String getInstitutoPesquisa() {
		return institutoPesquisa;
	}
	public void setInstitutoPesquisa(String institutoPesquisa) {
		this.institutoPesquisa = institutoPesquisa;
	}
	public LocalDate getDataPesquisa() {
		return dataPesquisa;
	}
	public void setDataPesquisa(LocalDate dataPesquisa) {
		this.dataPesquisa = dataPesquisa;
	}
	public String getLocalPesquisa() {
		return localPesquisa;
	}
	public void setLocalPesquisa(String localPesquisa) {
		this.localPesquisa = localPesquisa;
	}
	public int getMediaIdadePesquisa() {
		return mediaIdadePesquisa;
	}
	public void setMediaIdadePesquisa(int mediaIdadePesquisa) {
		this.mediaIdadePesquisa = mediaIdadePesquisa;
	}
	public String getTipoPesquisa() {
		return tipoPesquisa;
	}
	public void setTipoPesquisa(String tipoPesquisa) {
		this.tipoPesquisa = tipoPesquisa;
	}
	public String getFormatoPesquisa() {
		return formatoPesquisa;
	}
	public void setFormatoPesquisa(String formatoPesquisa) {
		this.formatoPesquisa = formatoPesquisa;
	}
}
