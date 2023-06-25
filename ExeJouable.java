public class ExeJouable {
   public static void main(String[] args) {
     IJouable[] jouable = new IJouable[3];

    Guitar guitar = new Guitar();
    Bactterie bactterie = new Bactterie();
    Piano piano = new Piano();
    
    jouable[0] = guitar;
    jouable[1] = bactterie;
    jouable[2] = piano;

    jouable[2].jouer();
   }
}
