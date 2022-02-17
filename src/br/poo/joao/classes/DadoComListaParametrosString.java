package br.poo.joao.classes;

import java.util.List;

/**
 * A classe <code>DadoComListaParametrosString</code> � respons�vel por
 * representar um dado que possua uma lista de String como par�metro.
 * 
 */

public class DadoComListaParametrosString extends Dado {

	/**
	 * Atributo private do tipo List de Strings que representa uma lista de Strings
	 * como par�metro do tipo de dados
	 * 
	 */

	private List<String> parametros = null;

	public List<String> getParametros() {
		return parametros;
	}

	public void setParametros(List<String> parametros) {
		this.parametros = parametros;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DadoComListaParametrosString [parametros=");
		builder.append(parametros);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
