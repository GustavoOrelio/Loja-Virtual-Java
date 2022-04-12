package Models;

import java.util.Date;

public class Carrinho {
	
	private Integer id;
	private Date BuyDate = new Date();
	private Cliente client;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getBuyDate() {
		return BuyDate;
	}
	public Cliente getClient() {
		return client;
	}
	public void setClient(Cliente client) {
		this.client = client;
	}

}
