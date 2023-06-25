public class Cercle {
    double rayon;
     //creation du construicteur
    Cercle(double rayon) {
        this.rayon = rayon;
    }

    public void calcAir(){
        double air = 6.14*rayon*rayon;
        System.out.println("air: " + air);
    }
    public void calcPeri(){
        double peri = 3.14*rayon*2;
        System.out.println("le perimetre est : " +peri); 
    }
}
