import java.util.ArrayList;

public class TrataTransicoes {

	public ArrayList<String> leEstadoSaida(ArrayList<String> transicoes) {

		ArrayList<String> estadoSaida = new ArrayList<>();

		for (int i = 0; i < transicoes.size(); i++) {

			for (int j = 0; j < transicoes.get(i).length(); j++) {

				if (transicoes.get(i).charAt(j) == ' ') {

					estadoSaida.add(transicoes.get(i).substring(0, j));

					break;
				}
			}
		}

		return estadoSaida;
	}

	public ArrayList<String> leEstadoEntrada(ArrayList<String> transicoes) {

		ArrayList<String> estadoEntrada = new ArrayList<>();

		boolean fechaVarredura = false;

		for (int i = 0; i < transicoes.size(); i++) {

			fechaVarredura = false;

			for (int j = 0; j < transicoes.get(i).length(); j++) {

				if (transicoes.get(i).charAt(j) == ' ') {

					for (int k = j + 1; k < transicoes.get(i).length(); k++) {

						if (transicoes.get(i).charAt(k) == ' ') {

							estadoEntrada.add(transicoes.get(i).substring(k + 1, transicoes.get(i).length()));
							fechaVarredura = true;
							break;

						} else if (k == transicoes.get(i).length() - 1) {

							estadoEntrada.add("");
							fechaVarredura = true;
							break;
						}
					}
				}

				if (fechaVarredura) {
					break;
				}
			}
		}

		return estadoEntrada;
	}

	public ArrayList<String> leAlfabetoTrasicao(ArrayList<String> transicoes) {

		ArrayList<String> alfabetoTransicao = new ArrayList<>();
		boolean fechaVarredura = false;

		for (int i = 0; i < transicoes.size(); i++) {

			fechaVarredura = false;

			for (int j = 0; j < transicoes.get(i).length(); j++) {

				if (transicoes.get(i).charAt(j) == ' ') {

					for (int k = j + 1; k <= transicoes.get(i).length(); k++) {

						if (transicoes.get(i).charAt(k) == ' ' || k == transicoes.get(i).length() - 1) {

							alfabetoTransicao.add(transicoes.get(i).substring(j + 1, k + 1));
							fechaVarredura = true;
							break;
						}
					}
				}

				if (fechaVarredura) {
					break;
				}
			}
		}

		return alfabetoTransicao;
	}
}
