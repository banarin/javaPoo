public class Livre {
    //creation des atributs
    private String titre;
    private String auteur;
    private String ann_pub;

    //creation du construicteur
    
    Livre(String titre, String auteur, String ann_pub)
    {
        this.titre = titre;
        this.auteur = auteur;
        this.ann_pub = ann_pub;
    }

    //les modificateur pour recuperer les atributes en privées

    public void setTitre(String titre)
    {
        this.titre = titre;
    }
    public String getTitre()
    {
        return this.titre;
    }
    public void setAuteur(String auteur)
    {
        this.auteur = auteur;
    }
    public String getAuteur()
    {
        return this.auteur;
    }
    public void setAnn_pub(String ann_pub)
    {
        this.ann_pub = ann_pub;
    }
    public String getAnn_pub()
    {
        return this.ann_pub;
    }
}
