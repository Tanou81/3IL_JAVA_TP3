package partie3Exo2;

public class Cercle extends Forme {
  final double PI = 3.14;

  public Cercle(double taille) {
    super(taille);

  }

  public Cercle(int taille) {
    super(taille);
  }

  @Override
  public double getSurface() {
    double result = 0;
    result = (super.getTaille() * super.getTaille() * PI);
    return result;
  }

  public String toString() {
    return "Cercle a comme ";
  }
}