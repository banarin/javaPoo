public class Employe {
    String nom;
    int salaire;
    String date_embauch;
    Employe(String nom, int salaire, String date_embauch)
    {
        this.nom = nom;
        this.salaire = salaire;
        this.date_embauch = date_embauch;
    }
    public void Augment_salire(int bonus)
    {
        int newSalaire = salaire + bonus;
        System.out.println("le nouveau salire est : " + newSalaire);
    }
    public void info_employe()
    {
        System.out.println("le nom : " + nom + "\nsalaire : " + salaire + "\ndate d'embauche : " + date_embauch);
    }
}
