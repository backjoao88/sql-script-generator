package br.poo.joao.interfaces;

import java.util.List;

/**
 * 
 * Interface com as implementa��es espec�ficas para um dado.
 * 
 * @see Dado
 * @author Jo�o Paulo Back
 * @since 2018
 */

public interface IDado {
	
	/**
	 * M�todo que ao ser invocado, retorna uma lista de Strings com os modificadores aceitos 
	 * pelo Dado que implementou este m�todo.
	 * 
	 * @return - Lista de strings com os modificadores aceitos.
	 */
	
	public List<String> valoresLogicosAceitos();
	
}
