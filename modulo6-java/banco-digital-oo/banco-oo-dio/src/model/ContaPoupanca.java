package model;

import model.Cliente;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato model.Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
}
