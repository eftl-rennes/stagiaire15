package fr.eftl.agence.voyages.prix;

public class CalculPrixBillet {

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
		CalculPrixUnitaire prixUnitaire = new CalculPrixUnitaire(depart,arrivee);
		Integer varprixUnitaire = prixUnitaire.generer();
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
}
