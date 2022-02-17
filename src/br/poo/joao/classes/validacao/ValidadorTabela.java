package br.poo.joao.classes.validacao;

import br.poo.joao.enumeracoes.Collate;
import br.poo.joao.enumeracoes.CollateVersion;

/**
 * A classe <code>ValidadorTabela</code> � uma classe utilizada para validar os atributos na classe <code>Tabela</code>
 * Esta classe possui m�todos est�ticos.
 * 
 * @author Jo�o Paulo Back
 * @since 2018
 * 
 * */

public class ValidadorTabela {
	
	/**
	 * 
	 * M�todo respons�vel por checar se a <code>CollateVersion</code> que est� sendo passada por par�metro
	 * pertence as vers�es aceitas pelo <code>Collate</code> que tamb�m est� sendo passado por par�metro.
	 * 
	 * 
	 * @param collate - Var�avel do tipo <code>Collate</code> onde � checado a exist�ncia da vers�o.
	 * @param collateV - Var�avel do tipo <code>CollateVersion</code> utilizada para checar sua exist�ncia 
	 * no <code>Collate</code>
	 * @return - O m�todo retornar� TRUE caso o <code>CollateVersion</code> exista no <code>Collate</code>
	 * 
	 */
	
	public static boolean validarVersaoCollate(Collate collate, CollateVersion collateV) {
		for (int k = 0 ; k < collate.getVersoes().size(); k++) {
			if (collateV.equals((collate.getVersoes().get(k)))) {
				return true;
			}
		}
		return false;
	}
	
}
