package br.com.casadocodigo.livrocdi.main;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import br.com.casadocodigo.livrocdi.folhapagamento.CalculadoraSalarios;
import br.com.casadocodigo.livrocdi.folhapagamento.Funcionario;

public class CalculadoraMain {

	public static void main(String[] args) {

		Weld weld = new Weld();

		WeldContainer container = weld.initialize();

		CalculadoraSalarios calculadoraSalarios = container.instance()
				.select(CalculadoraSalarios.class).get();

		Funcionario funcionario = new Funcionario("Fulano", 5000.0);

		double salario = calculadoraSalarios.calculaSalario(funcionario);

		System.out.printf("Salário calculado do %s é %.2f\n",
				funcionario.getNome(), salario);

		weld.shutdown();

	}
}
