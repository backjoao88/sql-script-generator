package br.poo.joao.classes.validacao;

import java.util.List;
import br.poo.joao.interfaces.IDado;

/**
 * A classe <code>ValidadorCampo</code> � uma classe utilizada para validar os atributos na classe <code>Campo</code>
 * Esta classe possui m�todos est�ticos.
 * 
 * @author Jo�o Paulo Back
 * @since 2018
 * 
 * */

public class ValidadorCampo {
	
	/**
	 * 
	 * M�todo est�tico utilizado para conferir se um determinado modificador pertence aos modificadores aceitos 
	 * por um determinado tipo de dado.
	 * 
	 * @param tipoDado - Tipo de dado do tipo <code>IDado</code> onde ser� verificado a exist�ncia do modificador.
	 * @param modificador - Modificador do tipo <code>String</code> a ser verificado.
	 * @return - O m�todo retornar� TRUE caso o tipo de dado aceite o modificador.
	 * @return - O m�todo retornar� FALSE caso o tipo de dado n�o aceite o modificador.
	 * 
	 */
	
	public static boolean validarModificadoresDado(IDado tipoDado, String modificador) {
		List<String> lista = tipoDado.valoresLogicosAceitos();
		for (int k = 0 ; k < lista.size(); k++) {
			if (modificador.equals(lista.get(k))) {
				return true;
			}
		}
		return false;
	}

}
