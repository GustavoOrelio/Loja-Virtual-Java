package Models;

import java.util.Date;

public class Carrinho {
	
	
	private Date DataCompra = new Date();
	public Cliente cliente;
	
	public Date getDataCompra() {
		return DataCompra;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public String toString() {
		return "Cliente" + cliente.getName() + "Data da Compra" + getDataCompra();
	}
	
}