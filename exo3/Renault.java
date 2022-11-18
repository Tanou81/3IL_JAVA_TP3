package exo3;

public class Renault extends Voiture {
  private int anneFabrique;
  private int reducConstructeur;

  public Renault(int vm, double prix_voiture, String couleur, int anneFabrique, int reducConstructeur) {
    super(vm, prix_voiture, couleur);
    this.anneFabrique = anneFabrique;
    this.reducConstructeur = reducConstructeur;
  }

  
  public double calculerPrixDeVente() {
    double result = 0;
    result = (this.getPrixVoiture() * (this.reducConstructeur / 100));
    result = this.getPrixVoiture() - result;
    return result;
  }

}