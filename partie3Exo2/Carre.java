package partie3Exo2;

public class Carre extends Forme {
  public Carre(double taille) {
    super(taille);
  }

  public Carre(int taille) {
    super(taille);
  }

  @Override
  public double getSurface() {
    double result = 0;
    result = (super.getTaille() * super.getTaille());
    return result;
  }

  public String toString() {
    return "Carre a comme   ";
  }
}