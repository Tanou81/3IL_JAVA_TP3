package exo3;

public class Camion extends Voiture {
  private int poids;

  public Camion(int vm, double prix_voiture, String couleur, int poids) {
    super(vm, prix_voiture, couleur);
    this.poids = poids;
  }

  
  @Override
  public double calculerPrixDeVente() {
    double result = 0;
    if (this.poids > 2000) {
      result = (this.getPrixVoiture() * (10 / 100));
      result = this.getPrixVoiture() - result;
      // this.setPrixVoiture(result);
    } else {
      result = (this.getPrixVoiture() * (20 / 100));
      result = this.getPrixVoiture() - result;
      // this.setPrixVoiture(result);
    }
    return result;
  }
}