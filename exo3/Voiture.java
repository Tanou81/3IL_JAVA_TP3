package exo3;

public class Voiture {
  // attribut final indique qu'on ne peut pas redéfinir (=changer ) les valeurs de
  // ces variables
  private final int vm;
  private final double prix_voiture;
  private final String couleur;

  public Voiture(int vm, double prix_voiture, String couleur) {
    this.vm = vm;
    this.prix_voiture = prix_voiture;
    this.couleur = couleur;
  }

  public double getPrixVoiture() {
    return this.prix_voiture;
  }

  public double calculerPrixDeVente() {
    return this.prix_voiture;
  }
}