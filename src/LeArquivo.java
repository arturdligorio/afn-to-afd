import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class LeArquivo {

	private static BufferedReader read;

	public String linha(String nome, String classe) {

		String linhaInteira = null;
		String linha = null;
		boolean controle = true;
		char classeLetra = classe.charAt(0);

		try {
			read = new BufferedReader(new FileReader(nome));

			while (controle) {

				linha = read.readLine().toLowerCase();

				if (linha.charAt(0) == classeLetra) {

					linhaInteira = linha;
					controle = false;
				}
			}

		} catch (IOException e) {
			JOptionPane.showMessageDialog( null, "Caminho especificado não encontrou arquivo !!");
			e.printStackTrace();
		}

		return separaNome(linhaInteira);
	}

	private String separaNome(String nomeDaLinha) {

		String nomeEst = "";

		for (int i = 0; i < nomeDaLinha.length(); i++) {

			if (nomeDaLinha.charAt(i) == ':') {

				if (nomeDaLinha.charAt(i + 1) == ' ') {

					for (int j = i + 1; j < nomeDaLinha.length(); j++) {

						if (nomeDaLinha.charAt(j) != ' ') {

							nomeEst = nomeDaLinha.substring(j, nomeDaLinha.length());
							break;

						}
					}

				} else if (nomeDaLinha.charAt(i + 1) != ' ') {

					nomeEst = nomeDaLinha.substring(i + 1, nomeDaLinha.length());
					break;

				}
			}
		}

		return nomeEst;
	}

	public ArrayList<String> lendoTransicoes(String nome) {

		boolean controle = true;
		String linhaTransicao = " ";
		ArrayList<String> tranzicoes = new ArrayList<>();

		try {
			read = new BufferedReader(new FileReader(nome));

			while (controle) {

				if (read.readLine().toLowerCase().charAt(0) == 'f') {

					controle = false;
				}
			}

			while (read.ready()) {

				linhaTransicao = read.readLine().toLowerCase();
				tranzicoes.add(linhaTransicao);
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

		return tranzicoes;
	}

	
}
