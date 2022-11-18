package partie3Exo2;

public abstract class Forme {
  // public class Forme {
  private double taille;

  public Forme(double taille) {
    this.taille = taille;
  }

  public Forme(int taille) {
    this.taille = (double) taille;
  }

  public double getTaille() {
    return this.taille;
  }

  public abstract double getSurface();
  /*
   * public double getSurface() {
   * double i = 0;
   * return i;
   * }
   */

  public void afficher() {
    System.out.println("personnes : " + this.taille);
  }

  public abstract String toString(); 

}