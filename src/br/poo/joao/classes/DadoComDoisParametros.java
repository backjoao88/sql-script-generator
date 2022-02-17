package br.poo.joao.classes;

/**
 * A classe <code>DadoComDoisParametros</code> � respons�vel por representar
 * dado que possua dois par�metros.
 * 
 */

public class DadoComDoisParametros extends Dado {

	/**
	 * Atributo private do tipo int que representa o par�metro um de um tipo de dado
	 * com dois par�metros
	 * 
	 */

	private int parametroUm;

	/**
	 * Atributo private do tipo int que representa o par�metro dois de um tipo de
	 * dado com dois par�metros
	 * 
	 */

	private int parametroDois;

	public int getParametroUm() {
		return parametroUm;
	}

	public void setParametroUm(int parametroUm) {
		this.parametroUm = parametroUm;
	}

	public int getParametroDois() {
		return parametroDois;
	}

	public void setParametroDois(int parametroDois) {
		this.parametroDois = parametroDois;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DadoComDoisParametros [parametroUm=");
		builder.append(parametroUm);
		builder.append(", parametroDois=");
		builder.append(parametroDois);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
