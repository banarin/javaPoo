public class Etudiand extends Personne {
    //creation des atributs
    private String numEtudiant;
     //creation du construicteur
    Etudiand(String nimEtudiant, String nom, int age, String address)
    {
        //le mot clés super qui va permetre de recuperer les atributes de la classe mere
        super(nom, age, address);
        this.numEtudiant = nimEtudiant;
    }
        //les modificateur pour recuperer les atributes en privées
    public void setNumEtudiant(String numEtudiant)
    {
        this.numEtudiant = numEtudiant;
    }
    public String getNumEtudiant()
    {
        return numEtudiant;
    }
}
