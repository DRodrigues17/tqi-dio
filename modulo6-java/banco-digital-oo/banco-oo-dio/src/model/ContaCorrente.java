package model;

import model.Cliente;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato model.Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
