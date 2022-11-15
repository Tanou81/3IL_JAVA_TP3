package exo2;

class PointNom extends Point {
  private String nom;
  private int x;
  private int y;

  public PointNom(String nom, int x, int y) {
    super();
    this.nom = nom;
    this.x = x;
    this.y = y;
  }

  public void setPointNom(int x, int y, String nom) {
    this.x = x;
    this.y = y;
    this.nom = nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public void affCoordNom() {
    System.out.println("Coordonnées : " + x + " " + y + " " + nom);
  }

}