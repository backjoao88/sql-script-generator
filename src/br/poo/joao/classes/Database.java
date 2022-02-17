package br.poo.joao.classes;

import java.util.List;
import br.poo.joao.classes.validacao.ValidadorTabela;
import br.poo.joao.enumeracoes.Collate;
import br.poo.joao.enumeracoes.CollateVersion;

/**
 * A classe <code>Database</code> � respons�vel por representar o banco de
 * dados.
 * 
 * @author Jo�o Paulo Back
 * @since 2018
 * 
 */

public class Database {

	/**
	 * Atributo private do tipo String que representa o nome do Database
	 */

	private String nome = "";

	/**
	 * Atributo private do tipo Collate que representa a codifica��o de caracteres
	 * aceitos pelo Database.
	 */

	protected Collate collate = null;

	/**
	 * Atributo private do tipo Collate que representa as vers�es da codifica��o de
	 * caracteres aceitos pelo Database.
	 */

	protected CollateVersion collateVersion = null;

	/**
	 * Atributo private do tipo List de Tabelas que representa a lista de tabelas do
	 * Database.
	 * 
	 */

	private List<Tabela> tabelas = null;

	public Database(List<Tabela> tabelas) {
		this.tabelas = tabelas;
		this.collateVersion = CollateVersion.DEFAULT_COLLATION;
	}

	public Database usandoONome(String nome) {
		setNome(nome);
		return this;
	}

	public Database comACollate(Collate collate) {
		setCollate(collate);
		return this;
	}

	public Database comAVersaoDaCollate(CollateVersion collateVersion) {
		setCollateVersion(collateVersion);
		return this;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Tabela> getTabelas() {
		return tabelas;
	}

	public void setTabelas(List<Tabela> tabelas) {
		this.tabelas = tabelas;
	}

	public CollateVersion getCollateVersion() {
		return collateVersion;
	}

	/**
	 * 
	 * M�todo respons�vel por setar o <code>CollateVersion</code> na classe
	 * <code>Collate</code>. Invoca o m�todo est�tico <i>validarVersaoCollate</i> da
	 * classe <code>ValidadorTabela</code> para fazer a valida��o da vers�o do
	 * <code>Collate</code>.
	 * 
	 * @param <b>collateVersion</b> - vari�vel do tipo enum
	 *        <code>CollateVersion</code> que ser� setada.
	 * 
	 */

	public void setCollateVersion(CollateVersion collateVersion) {
		if (ValidadorTabela.validarVersaoCollate(this.collate, collateVersion)) {
			this.collateVersion = collateVersion;
		}
	}

	public Collate getCollate() {
		return collate;
	}

	public void setCollate(Collate collate) {
		this.collate = collate;
	}

	public void addTabela(Tabela c) {
		if (c != null) {
			tabelas.add(c);
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Database [nome=");
		builder.append(nome);
		builder.append(", collate=");
		builder.append(collate);
		builder.append(", collateVersion=");
		builder.append(collateVersion);
		builder.append(", tabelas=");
		builder.append(tabelas);
		builder.append("]");
		return builder.toString();
	}

}
