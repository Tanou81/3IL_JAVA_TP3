package partie3Exo1;

public class Personne  {
  private String nom ; 
  public Personne(String nom){
    this.nom = nom ; 
  }

  public void afficher(){
     System.out.println("personnes : "+ this.nom);
  }
  

}