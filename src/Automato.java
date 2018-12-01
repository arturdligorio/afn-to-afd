import java.util.ArrayList;

public class Automato {

	private ArrayList<String> transicoes = new ArrayList<>();
	private ArrayList<String> estadoSaida = new ArrayList<>();
	private ArrayList<String> alfabetoTransicao = new ArrayList<>();
	private ArrayList<String> estadoEntrada = new ArrayList<>();
	private String nomeEstInicial = "";
	private String nomeEstFinal = "";
	private String linhaAlfabeto = "";
	
	
	public ArrayList<String> getTransicoes() {
		return transicoes;
	}
	public void setTransicoes(ArrayList<String> transicoes) {
		this.transicoes = transicoes;
	}
	public ArrayList<String> getEstadoSaida() {
		return estadoSaida;
	}
	public void setEstadoSaida(ArrayList<String> estadoSaida) {
		this.estadoSaida = estadoSaida;
	}
	public ArrayList<String> getAlfabetoTransicao() {
		return alfabetoTransicao;
	}
	public void setAlfabetoTransicao(ArrayList<String> alfabetoTransicao) {
		this.alfabetoTransicao = alfabetoTransicao;
	}
	public ArrayList<String> getEstadoEntrada() {
		return estadoEntrada;
	}
	public void setEstadoEntrada(ArrayList<String> estadoEntrada) {
		this.estadoEntrada = estadoEntrada;
	}
	public String getNomeEstInicial() {
		return nomeEstInicial;
	}
	public void setNomeEstInicial(String nomeEstInicial) {
		this.nomeEstInicial = nomeEstInicial;
	}
	public String getNomeEstFinal() {
		return nomeEstFinal;
	}
	public void setNomeEstFinal(String nomeEstFinal) {
		this.nomeEstFinal = nomeEstFinal;
	}
	public String getLinhaAlfabeto() {
		return linhaAlfabeto;
	}
	public void setLinhaAlfabeto(String linhaAlfabeto) {
		this.linhaAlfabeto = linhaAlfabeto;
	}
	
	
}
