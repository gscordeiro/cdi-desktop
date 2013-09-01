package br.com.casadocodigo.livrocdi.observers;

import javax.enterprise.event.Observes;

import br.com.casadocodigo.livrocdi.folhapagamento.Funcionario;

public class ObservadorCalculadora {

	public void escutaCalculoSalario(@Observes Funcionario funcionario){
		System.out.printf("O salário do(a) %s acabou de ser calculado\n", funcionario.getNome());
	}
}
