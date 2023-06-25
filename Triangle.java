// creation de la class Triangle qui herite de la class Forme
public class Triangle extends Forme{

     double cote;
     double hauteur;

     Triangle(double cote, double hauteur) 
     {
        this.cote = cote;
        this.hauteur = hauteur;
     }
     //redefinition de la methode CalcAire qui est une methode abstrait de la class Forme
     @Override
    public void CalcAire()
    {
        double air = (cote*hauteur)/2;
        System.out.println("l'air du triangle est : " + air);
    }
}
