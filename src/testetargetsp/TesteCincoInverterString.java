package testetargetsp;

public class TesteCincoInverterString {
	public static void main(String[] args) {
		String texto = "PALAVRA";
		StringBuilder textoInvertido = new StringBuilder();
		
		for(int i=texto.length()-1; i>=0;i--) {
			textoInvertido.append(texto.charAt(i));
		}
		System.out.println(textoInvertido);
		
	}
}
