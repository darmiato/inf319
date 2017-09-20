package inf319;

import java.util.List;

public class Componente {

	private List<Peca> componentes;

	public List<Peca> getListaDeComponentes() {
		return this.componentes;
	}

	public void setListaDeComponentes(List<Peca> componentes) {
		this.componentes = componentes;
	}
	
	public void adicionaPeca(Peca peca){
		componentes.add(peca);
	}
	
	public Peca getPecaById(int id){
		return componentes.get(id);
	}
}
