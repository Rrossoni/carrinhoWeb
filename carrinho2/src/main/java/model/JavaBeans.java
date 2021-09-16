package model;

public class JavaBeans {
	private String id;
	private String produto;
	private String quantidade;
	private String valor;
	private String total;
	
	public String getIdcon() {
		return id;
}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}
	

//construtor 1
	public JavaBeans() {
		super();
		
	}
	//contrutor 2 (usado no metodo Select com arraylist vetor)

	public JavaBeans(String id, String produto, String quantidade, String valor, String total) {
	super();
	this.id = id;
	this.produto = produto;
	this.quantidade = quantidade;
	this.valor = valor;
	this.total = total;
}
	
	
}


