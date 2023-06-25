// creation de la class Triangle qui herite de la class Forme
public class Carre  extends Forme{
    
    double cote;

    Carre(double cote){
        this.cote = cote;
    }

    //redefinition de la methode CalcAire qui est une methode abstrait de la class Forme
	@Override
	public void CalcAire() {
		double aire = cote*cote;
        System.out.println("l'aire du carre est : " + aire);
	}

}
