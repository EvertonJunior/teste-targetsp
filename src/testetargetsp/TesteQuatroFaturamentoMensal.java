package testetargetsp;

import java.util.HashMap;
import java.util.Map;

public class TesteQuatroFaturamentoMensal {
	public static void main(String[] args) {
		Map<String, Double> faturamentoMensal = new HashMap<>();
		faturamentoMensal.put("SP",67836.43);
		faturamentoMensal.put("RJ",36678.66);
		faturamentoMensal.put("MG",29229.88);
		faturamentoMensal.put("ES",27165.48);
		faturamentoMensal.put("Outros",19849.53);
		
		Double total = 0.0;
		
		for(Double valor : faturamentoMensal.values()) {
			total += valor;
		}
		
		for(Map.Entry<String, Double> entry : faturamentoMensal.entrySet()) {
			Double porcentagem = (entry.getValue() * 100 ) / total;
			System.out.printf("%s representa %.1f%% do valor total\n", entry.getKey(), porcentagem);
		}
		
	}
}
