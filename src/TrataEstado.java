import java.util.ArrayList;

public class TrataEstado {

	public int contaEstado(String estado) {

		int contEst = 1;

		for (int i = 0; i < estado.length(); i++) {

			if (estado.charAt(i) == ' ') {

				if (i + i < estado.length()) {

					contEst = contEst + contaEstado(estado.substring(i + 1, estado.length()));
				}

				break;
			}
		}
		return contEst;
	}

	public ArrayList<String> estadosDentroEstado(String estado) {
		
		ArrayList<String> estados = new ArrayList<>();
		
		int rodadas = contaEstado(estado);
		
		for (int j = 0; j < rodadas; j++) {
			
			
			for (int i = 0; i < estado.length(); i++) {

				if (estado.charAt(i) == ' ') {

					if (i + i < estado.length()) {
						
						
						estados.add(estado.substring(0, i));
						
						estado = estado.substring(i + 1, estado.length());
						
						
					}

					break;
				}else if (i == estado.length() - 1) {
					
					estados.add(estado);
					break;
				}
			}
			
		}
		
		
		
		return estados;
	}
	
	
	
}
