package br.poo.joao.factory;
import java.util.List;

import br.poo.joao.interfaces.IDadoComDoisParametros;
import br.poo.joao.interfaces.IDadoComListaParametrosString;
import br.poo.joao.interfaces.IDadoComUmParametro;
import br.poo.joao.interfaces.IDadoSemParametro;

/**
 * 
 * Interface que representa uma f�brica gen�rica que possui 
 * implementa��es a serem criadas pelas f�bricas concretas.
 * 
 * @author Jo�o Paulo Back
 * @since 2018 
 * 
 * */

public interface IFabricaDeDado {
	
	/**
	 * {@inheritDoc}
	 * 
	 * M�todo que cria um dado do tipo que possua um par�metro. Retorna um objeto que implementa
	 * a interface IDadoComUmParametro.
	 * 
	 * @param tipo - Tipo do dado a ser criado passado como String.
	 * @param parametroUm - Par�metro do tipo inteiro que o dado possui.
	 * @return - Retorna um objeto do tipo IDadoComUmParametro.
	 * 
	 */
	public IDadoComUmParametro criarDadoComUmParametro(String tipo, int parametroUm);
	
	/**
	 * {@inheritDoc}
	 * 
	 * M�todo que cria um dado do tipo que n�o possua nenhum par�metro. Retorna um objeto que implementa
	 * a interface IDadoSemParametro.
	 * 
	 * @param tipo - Tipo do dado a ser criado passado como String.
	 * @return - Retorna um objeto do tipo IDadoSemParametro.
	 * 
	 */
	
	public IDadoSemParametro criarDadoSemParametro(String tipo);
	
	/**
	 * {@inheritDoc}
	 * 
	 * M�todo que cria um dado do tipo que possua dois par�metros. Retorna um objeto que implementa
	 * a interface IDadoComDoisParametros.
	 * 
	 * @param tipo - Tipo do dado a ser criado passado como String.
	 * @param parametroUm - Par�metro um do tipo inteiro que o dado possui.
	 * @param parametroDois - Par�metro dois do tipo inteiro que o dado possui.
	 * @return - Retorna um objeto do tipo IDadoComDoisParametros.
	 * 
	 */
	
	
	public IDadoComDoisParametros criarDadoDadoComDoisParametros(String tipo, int parametroUm, int parametroDois);
	
	/**
	 * {@inheritDoc}
	 * 
	 * M�todo que cria um dado do tipo que possua uma lista de strings como par�metro. 
	 * Retorna um objeto que implementa a interface IDadoComListaParametrosString.
	 * 
	 * @param tipo - Tipo do dado a ser criado passado como String.
	 * @param parametros - Lista de strings a ser passada como par�metro.
	 * @return - Retorna um objeto do tipo IDadoComListaParametrosString.
	 * 
	 */
	
	public IDadoComListaParametrosString criarDadoComListaDeParametrosString(String tipo, List<String> parametros);

}
