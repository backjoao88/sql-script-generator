package br.poo.joao.classes.validacao;

/**
 * A classe <code>ValidadorScript</code> � uma classe utilizada para validar o script gerado pela classe <code>Script</code>
 * Esta classe possui m�todos est�ticos.
 * @see <code>Script</code>
 * 
 * 
 * @author Jo�o Paulo Back
 * @since 2018
 * 
 * 
 * */

public class ValidadorScript {
	
	/**
	 * 
	 * M�todo utilizado para substituir a �ltima v�rgula gerada pelos campos da tabela por dois pontos.
	 *
	 * 
	 * @param script - Recebe a vari�vel do tipo String que representa o script.
	 * @return - Retorna a vari�vel script validada. A �ltima v�rgula da String � substitu�da por dois pontos.
	 * 
	 */
	
	
	public static String validarUltimaVirgulaParaDoisPontos(String script) {
		char[] chars = script.toCharArray();
		for (int k = chars.length-1; k > 0; k--) {
			if (chars[k] == ',') {
				chars[k] = ')';
				break;
			}else {
				continue;
			}
		}
		return String.valueOf(chars);
	}
}