package br.com.triangulo.vinicios.controller;

import br.com.triangulo.vinicios.exception.TrianguloException;



/**
 * @author Vinicios Aguiar
 *
 */
public class RunChallenge{
	
	 
	public final Long getMaximoTrianguloTotal(final Long[][] triangulo) {
		
		//valida se o triangulo é perfeito.
		validaTriangulo(triangulo);
		
		//recupera primeiro numero do triangulo.
		Long maximoTotal = triangulo[0][0];
		
		for(int row = 1; row < triangulo.length; row++) {
			
			long primeiroNumero = triangulo[row][0];
			long segundoNumero = triangulo[row][1];
			
			maximoTotal = maximoTotal + Math.max(primeiroNumero, segundoNumero);
		}
		
		
		return maximoTotal;
		
	}
	
	private void validaTriangulo(final Long[][] triangulo) {
		int row = 0;
		int col = 0;
		
		int qtdColunaProximaLinha =0;
		
		if(triangulo == null || triangulo.length == 0) {
			throw new TrianguloException("Triânugo Inválido!");
		}
		
		for (row=0; row<triangulo.length; row++) {
				
			/*
			 * Para se ter um triangulo perfeito, apenas a primeira linha matriz terá apenas uma coluna.
			 * Todas as outras linhas deverá ter apenas uma coluna a mais que a linha anterior.
			 */
			if(triangulo[row].length == 1) {
				qtdColunaProximaLinha = triangulo[row].length;
			} else {
				
				if(triangulo[row].length != qtdColunaProximaLinha + 1) {
					throw new TrianguloException("O triângulo não é perfeito!");
				}
				
				qtdColunaProximaLinha++;
				
			}
			
				
		}
	}
	
}
