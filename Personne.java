class Personne{
    //creation des atributs
    private String nom;
    private int age;
    private String address;
    //creation du construicteur
    Personne(String nom, int age, String address){
        this.nom = nom;
        this.age = age;
        this.address = address;
    }
    //les modificateur pour recuperer les atributes en privées
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getNom(){
        return this.nom;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }
}