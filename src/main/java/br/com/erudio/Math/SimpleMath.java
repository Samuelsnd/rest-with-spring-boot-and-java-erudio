package br.com.erudio.Math;

public class SimpleMath {

	public Double sum(Double numberOne, Double numberTwo) {
		return numberOne + numberTwo;
	}

	// subtração

	public Double sub(Double numberOne, Double numberTwo) {
		return numberOne - numberTwo;
	}

	// multiplicação

	public Double mult(Double numberOne, Double numberTwo) {
		return numberOne * numberTwo;
	}

	// Divisão
	public Double div(Double numberOne, Double numberTwo) {
		return (numberOne) / (numberTwo);
	}

	// Média
	public Double med(Double numberOne, Double numberTwo) {
		return (numberOne + numberTwo) / 2;
	}

	// Raiz quadrada
	public Double raiz(Double numberOne) {

		return Math.sqrt((numberOne));
	}
}
