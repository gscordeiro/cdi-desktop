package br.com.casadocodigo.livrocdi.folhapagamento;

import javax.enterprise.event.Event;
import javax.inject.Inject;

public class CalculadoraSalarios {

	@Inject
	private Event<Funcionario> calculoSalarioEvent;
	
	public double calculaSalario(Funcionario funcionario){
		calculoSalarioEvent.fire(funcionario);
		return funcionario.getSalarioBase() * 1.1;
	}
}
