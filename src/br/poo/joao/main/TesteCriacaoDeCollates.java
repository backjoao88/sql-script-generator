package br.poo.joao.main;

import br.poo.joao.enumeracoes.Collate;
import br.poo.joao.enumeracoes.CollateVersion;

public class TesteCriacaoDeCollates {
	
	public static void main(String[] args) {
		
		System.out.println(CollateVersion.BIG5_CHINESE.getDesc());
		
		// vers�es aceitas do big 5
		
		for (CollateVersion v : Collate.BIG5.getVersoes()) {
			System.out.println(v);
		}
		
	}

}
