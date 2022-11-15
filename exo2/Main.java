package exo2;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Point p = new Point();
    PointNom pA = new PointNom("Hey ", 1 , 2 );
    pA.affCoordNom();
    // si il n'y a pas de get alors la classe PointA n'a pas accès aux attributs 
  }
}