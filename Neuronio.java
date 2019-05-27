import java.util.ArrayList;

public class Neuronio {

	private Dentrito dentritos;

	private Arborizacao aborizacao;

	private boolean bainhaMielina;

	private ArrayList<String> informacao = new ArrayList<String>();
	private ArrayList<Neuronio> neuronio = new ArrayList<Neuronio>();

	public void coesao(Neuronio neuro) {
		neuronio.add(neuro);
		informacao.addAll(neuro.getInformacao());

	}
	

	public ArrayList<String> getInformacao() {
		return informacao;
	}


	public void setInformacao(ArrayList<String> informacao) {
		this.informacao = informacao;
	}


	public ArrayList<Neuronio> getNeuronio() {
		return neuronio;
	}


	public void setNeuronio(ArrayList<Neuronio> neuronio) {
		this.neuronio = neuronio;
	}


	public Dentrito getDentritos() {
		return dentritos;
	}

	public void setDentritos(Dentrito dentritos) {
		this.dentritos = dentritos;
	}

	public Arborizacao getAborizacao() {
		return aborizacao;
	}

	public void setAborizacao(Arborizacao aborizacao) {
		this.aborizacao = aborizacao;
	}

	public boolean isBainhaMielina() {
		return bainhaMielina;
	}

	public void setBainhaMielina(boolean bainhaMielina) {
		this.bainhaMielina = bainhaMielina;
	}

}
