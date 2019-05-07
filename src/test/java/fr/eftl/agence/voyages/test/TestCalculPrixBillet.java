package fr.eftl.agence.voyages.test;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import fr.eftl.agence.voyages.prix.CalculPrixBillet;
import fr.eftl.agence.voyages.prix.CalculPrixUnitaire;



public class TestCalculPrixBillet {

	@Test
	public void prixBilletClasseEco() {
		CalculPrixBillet prixBillet= new CalculPrixBillet();
		//CalculPrixUnitaire calculPrixUnitaire = new CalculPrixUnitaire();
		CalculPrixUnitaire calculPrixUnitaire = Mockito.mock(CalculPrixUnitaire.class);
		Mockito.when(calculPrixUnitaire.generer()).thenReturn(200);
		prixBillet.setCalculPrixUnitaire(calculPrixUnitaire);
		Integer prixObtenu = prixBillet.calculer("Paris", "Londre","eco");
		Assert.assertEquals(200, prixObtenu,0);
	}
	@Test
	public void prixBilletClassebusiness() {
		CalculPrixBillet prixBillet= new CalculPrixBillet();
		//CalculPrixUnitaire calculPrixUnitaire = new CalculPrixUnitaire();
		CalculPrixUnitaire calculPrixUnitaire = Mockito.mock(CalculPrixUnitaire.class);
		Mockito.when(calculPrixUnitaire.generer()).thenReturn(200);
		prixBillet.setCalculPrixUnitaire(calculPrixUnitaire);
		Integer prixObtenu2 = prixBillet.calculer("Paris", "Londre","business");
		Assert.assertEquals(700, prixObtenu2,0);
	}
	@Test
	public void prixBilletClassepremiere() {
		CalculPrixBillet prixBillet= new CalculPrixBillet();
		//CalculPrixUnitaire calculPrixUnitaire = new CalculPrixUnitaire();
		CalculPrixUnitaire calculPrixUnitaire = Mockito.mock(CalculPrixUnitaire.class);
		Mockito.when(calculPrixUnitaire.generer()).thenReturn(200);
		prixBillet.setCalculPrixUnitaire(calculPrixUnitaire);
		Integer prixObtenu1 = prixBillet.calculer("Paris", "Londre","premiere");
		Assert.assertEquals(400, prixObtenu1,0);
	}
	
	@Test
	public void prixBilletDefault() {
		CalculPrixBillet prixBillet= new CalculPrixBillet();
		//CalculPrixUnitaire calculPrixUnitaire = new CalculPrixUnitaire();
		CalculPrixUnitaire calculPrixUnitaire = Mockito.mock(CalculPrixUnitaire.class);
		Mockito.when(calculPrixUnitaire.generer()).thenReturn(200);
		prixBillet.setCalculPrixUnitaire(calculPrixUnitaire);
		Integer prixObtenu1 = prixBillet.calculer("Paris", "Londre","");
		Assert.assertEquals(200, prixObtenu1,0);
	}
	
	
}
