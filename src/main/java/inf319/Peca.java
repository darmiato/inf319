package inf319;

public class Peca{

	public Peca(int id, String descricao, double custo){
		this.id = id;
		this.descricao = descricao;
		this.custo = custo;
	}
	
	private double custo;
	private int id;
	private String descricao;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
	
	public double getCusto() {
		return this.custo;
	}

	public double setCusto(double custo) {
		return this.custo = custo;
	}		
}
