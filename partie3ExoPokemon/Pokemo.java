package partie3ExoPokemon;

public class Pokemon {
  pria
  public Pokemon(double taille) {
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