package Models;

import java.util.Date;

public class Carrinho {
	
	private Integer id;
	private Date DataCompra = new Date();
	public Cliente cliente;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDataCompra() {
		return DataCompra;
	}
	public void setDataCompra(Date DataCompra) {
		this.DataCompra = DataCompra;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public String toString() {
		return "Cliente" + cliente.getNome() + "Data da Compra" + getDataCompra();
	}
	
}