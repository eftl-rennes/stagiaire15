package fr.eftl.agence.voyages.prix;

public class CalculPrixBillet {

	private CalculPrixUnitaire CalculPrixUnitaire;
	private Integer PrixUnitaire;
	private String classe;
	public Integer getPrixUnitaire() {
		return PrixUnitaire;
	}
	public void setPrixUnitaire(Integer prixUnitaire) {
		PrixUnitaire = prixUnitaire;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public Integer calculer(String depart,String arrivee, String classe) {
		CalculPrixUnitaire.setDepart(depart);
		CalculPrixUnitaire.setArrivee(arrivee);
		Integer varprixUnitaire = CalculPrixUnitaire.generer();
		switch(classe) {
		
			case"eco":
			return varprixUnitaire;
		
			case"premiere":
			return varprixUnitaire*2;
			
			case"business":
			return varprixUnitaire*2 + 300;
			
			default:
			return varprixUnitaire;
		}
	}
	public CalculPrixUnitaire getCalculPrixUnitaire() {
		return CalculPrixUnitaire;
	}
	public void setCalculPrixUnitaire(CalculPrixUnitaire calculPrixUnitaire) {
		CalculPrixUnitaire = calculPrixUnitaire;
	}
}
