class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Point p = new Point();
    p.initialise(1, 2);
    System.out.println(p.getX());
    PointA p1 = new PointA();
    p1.initialise(3, 4);
    System.out.println(p1.getX());
    p1.afficher();
    p1.hey();
    // si il n'y a pas de get alors la classe PointA n'a pas accès aux attributs 
  }
}