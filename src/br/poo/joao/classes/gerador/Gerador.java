package br.poo.joao.classes.gerador;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 * Classe auxiliar respons�vel por criar um arquivo TXT em um determinado
 * diret�rio passado para o construtor.
 * 
 * @author Jo�o Paulo Back
 *
 */

public class Gerador {

	/** Atributo private do tipo String que representa o nome do arquivo **/

	private String nomeDoArquivo = "";

	public Gerador comONomeDeArquivo(String nome) {
		setNomeDoArquivo(nome);
		return this;
	}

	public String getNomeDoArquivo() {
		return nomeDoArquivo;
	}

	public void setNomeDoArquivo(String nomeDoArquivo) {
		this.nomeDoArquivo = nomeDoArquivo;
	}
	
	/**
	 * 
	 * M�todo respons�vel por criar o arquivo TXT.
	 * Recebe o script SQL em formato de String e o copia para um arquivo TXT.
	 * 
	 * @param sql Par�metro String onde est� contido o script SQL.
	 */

	public void gerarTxt(String sql) {
		FileWriter file = null;
		PrintWriter print = null;

		try {
			file = new FileWriter("scripts/" + getNomeDoArquivo() + ".txt");
			print = new PrintWriter(file);
			print.printf(sql);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			print.close();
		}
	}

}
