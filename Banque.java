public class Banque extends CompteBancaire{
    Banque(){
        super(numComptes, sold);
    }

    public void addCompte(int numCompte){
        numComptes = numCompte;
        System.out.println("le compte est ajouter");
    }

    public void removeCompte(){
        numComptes = 0;
    }
    public void soldCompte()
    {
        System.out.println("le solde total est : " + numComptes);
    }
}
