package br.com.triangulo.vinicios;

import org.junit.Test;

import br.com.triangulo.vinicios.controller.RunChallenge;

/**
 * Unit test for simple RunChallenge.
 */
public class RunChallengeTest {
   
	@Test
	public final void testeTotalMaximo() {
		
		Long[][] triangulo = {{16l},{3l,3l},{9l,7l,1l},{4l,6l,8l,4l}};
		
		RunChallenge run = new RunChallenge();
		
		Long maximo = run.getMaximoTrianguloTotal(triangulo);
		
		System.out.println(maximo);
		
	}
	
	@Test
	public final void testeTrianguloNullOuVazio() {
		
		Long[][] triangulo = {};
		
		RunChallenge run = new RunChallenge();
		
		Long maximo = run.getMaximoTrianguloTotal(triangulo);
		
		System.out.println(maximo);
		
	}
	
	@Test
	public final void testeTrianguloNotPerfeito() {
		
		Long[][] triangulo = {{16l},{3l,3l},{9l,7l,1l},{4l,6l,8l,4l,8l}};
		
		RunChallenge run = new RunChallenge();
		
		Long maximo = run.getMaximoTrianguloTotal(triangulo);
		
		System.out.println(maximo);
	}
}
