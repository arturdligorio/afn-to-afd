import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Scanner leia = new Scanner(System.in);
		
		
		
		String caminhoArquivoEntrada = "";
		
		caminhoArquivoEntrada = JOptionPane.showInputDialog("Entre com o caminho do arquivo de Entrada: ");
		
		String estInicial = null;
		String estFinal = null;
		String linhaAlfabeto = null;

		String tempSaida = "";
		String tempTransicao = "";
		String tempEntrada = "";
		String tempInterEntrada = "";
		String tempInterSaida = "";

		LeArquivo la = new LeArquivo();
		TrataAlfabeto ta = new TrataAlfabeto();
		TrataTransicoes tt = new TrataTransicoes();
		TrataEstado te = new TrataEstado();
		ProcuraEstado pe = new ProcuraEstado();
		CriaArquivo ca = new CriaArquivo();

		ArrayList<String> transicoes = new ArrayList<>();
		ArrayList<String> estadoSaida = new ArrayList<>();
		ArrayList<String> estadoEntrada = new ArrayList<>();

		ArrayList<String> estadoSaidaAFD = new ArrayList<>();
		ArrayList<String> alfabetoTransicaoAFD = new ArrayList<>();
		ArrayList<String> estadoEntradaAFD = new ArrayList<>();

		ArrayList<String> alfabeto = new ArrayList<>();
		ArrayList<String> estadoIntermediario = new ArrayList<>();

		estInicial = la.linha(caminhoArquivoEntrada, "i");
		estFinal = la.linha(caminhoArquivoEntrada, "f");
		linhaAlfabeto = la.linha(caminhoArquivoEntrada, "ab");
		transicoes = la.lendoTransicoes(caminhoArquivoEntrada);

		alfabeto = ta.alfabeto(linhaAlfabeto);

		estadoSaida = tt.leEstadoSaida(transicoes);
		estadoEntrada = tt.leEstadoEntrada(transicoes);

		boolean saidaDaIncrementacao = true;

		tempSaida = estInicial;

		int i = 0;
		while (saidaDaIncrementacao) {

			if (estadoEntradaAFD.size() == alfabetoTransicaoAFD.size()) {

				for (int j = 0; j < alfabeto.size(); j++) {

					estadoSaidaAFD.add(tempSaida);
					alfabetoTransicaoAFD.add(alfabeto.get(j));
				}
			}

			tempTransicao = alfabetoTransicaoAFD.get(i);

			for (int j = 0; j < te.contaEstado(tempSaida); j++) {

				estadoIntermediario = te.estadosDentroEstado(tempSaida);

				tempInterSaida = estadoIntermediario.get(j);

				tempInterEntrada = pe.estado(tempInterSaida, tempTransicao, estadoSaida, alfabetoTransicaoAFD,
						estadoEntrada);

				tempEntrada = tempEntrada + " " + tempInterEntrada;

			}

			estadoEntradaAFD.add(tempEntrada.trim());

			tempEntrada = "";

			if (estadoSaidaAFD.size() == i + 1) {

				for (int j = 0; j < estadoEntradaAFD.size(); j++) {

					if (!(estadoSaidaAFD.contains(estadoEntradaAFD.get(j)))) {

						tempSaida = estadoEntradaAFD.get(j);
						break;

					} else if (j + 1 == estadoEntradaAFD.size() && estadoSaidaAFD.contains(estadoEntradaAFD.get(j))) {

						saidaDaIncrementacao = false;

					}

				}
			}

			i++;
		}
		
		ca.imprimeAquivo(estadoSaidaAFD, alfabetoTransicaoAFD, estadoEntradaAFD, estInicial, linhaAlfabeto, estFinal);
		
	}

}
