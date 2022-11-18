package exo3;

public class Limousine extends Voiture {
  private int longueur;

  public Limousine(int vm, double prix_voiture, String couleur, int longueur) {
    super(vm, prix_voiture, couleur);
    this.longueur = longueur;

  }

  public double calculerPrixDeVente() {
    double result = 0;
    if (this.longueur > 6) {
      result = (this.getPrixVoiture() * (5 / 100));
      result = this.getPrixVoiture() - result;
      // this.setPrixVoiture(result);
    } else {
      result = (this.getPrixVoiture() * (10 / 100));
      result = this.getPrixVoiture() - result;
      // this.setPrixVoiture(result);
    }
    return result;
  }

}