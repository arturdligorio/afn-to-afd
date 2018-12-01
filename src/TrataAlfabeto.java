import java.util.ArrayList;

public class TrataAlfabeto {

	public int contaAlfabeto(String linhaAlfabeto) {

		int contadorAlfabeto = 0;

		for (int i = 0; i < linhaAlfabeto.length(); i++) {

			if (linhaAlfabeto.charAt(i) != ' ') {

				contadorAlfabeto++;
			}
		}

		return contadorAlfabeto;
	}

	public ArrayList<String> alfabeto(String linhaAlfabeto) {

		ArrayList<String> alfabetos = new ArrayList<>();

		for (int i = 0; i < linhaAlfabeto.length(); i++) {

			if (linhaAlfabeto.charAt(i) != ' ') {

				alfabetos.add(linhaAlfabeto.substring(i, i+1));

			}

		}

		return alfabetos;
	}

}
