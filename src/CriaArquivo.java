import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CriaArquivo {
	
	public void imprimeAquivo(ArrayList<String> estadosSaida, ArrayList<String> transicoes, ArrayList<String> estadosEntrada, String estadoInicial, String alfabeto, String estadoFinal){
		
		FileWriter arq;
		PrintWriter gravarArq;
		
		String estadoSaida = "";
		String transicao = "";
		String estadoEntrada = "";
		
		try {
			arq = new FileWriter(JOptionPane.showInputDialog("Coloque o caminho com o nome para salvar o arquivo: ")+ ".txt");
			gravarArq = new PrintWriter(arq);
			gravarArq.println("AB: " + alfabeto);
			gravarArq.println("i: " + estadoInicial);
			gravarArq.println("f: " + estadoFinal);
			for (int i = 0; i < estadosSaida.size(); i++) {
				
				estadoSaida = estadosSaida.get(i);
				transicao = transicoes.get(i);
				estadoEntrada = estadosEntrada.get(i);
				
				gravarArq.println(estadoSaida + " | " + transicao + " | " + estadoEntrada);
				
			}
						
			arq.close();
			
			//System.out.println("Programa executado com sucesso !!!");
			JOptionPane.showMessageDialog(null, "Programa executado com sucesso !!!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
		
	}
	

}
