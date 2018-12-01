import java.util.ArrayList;

public class ProcuraEstado {

	public String estado(String estSaida, String alfabeto, ArrayList<String> estadoSaida,
			ArrayList<String> alfabetoTransicao, ArrayList<String> estadoEntrada) {

		String estEntrada = "";

		for (int i = 0; i < estadoSaida.size(); i++) {

			if (estadoSaida.get(i).equals(estSaida)) {

				if (alfabetoTransicao.get(i).equals(alfabeto)) {

					estEntrada = estadoEntrada.get(i);
					break;
				}
			}
		}

		return estEntrada;
	}
}
