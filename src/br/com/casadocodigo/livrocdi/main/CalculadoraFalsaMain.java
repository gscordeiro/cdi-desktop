package br.com.casadocodigo.livrocdi.main;

import java.util.List;

import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.inject.Singleton;

import org.jboss.weld.environment.se.bindings.Parameters;
import org.jboss.weld.environment.se.events.ContainerInitialized;

import br.com.casadocodigo.livrocdi.folhapagamento.CalculadoraSalarios;
import br.com.casadocodigo.livrocdi.folhapagamento.Funcionario;

@Singleton
public class CalculadoraFalsaMain {

	@Inject
	private CalculadoraSalarios calculadoraSalarios;
	
	public void printHello(@Observes ContainerInitialized event, @Parameters List<String> parameters) {

		Funcionario funcionario = new Funcionario("Fulano", 6000.0);

		double salario = calculadoraSalarios.calculaSalario(funcionario);

		System.out.printf("Salário calculado do %s é %.2f\n",
				funcionario.getNome(), salario);

	   }
}
