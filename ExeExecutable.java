public class ExeExecutable {
   public static void main(String[] args) {
     IExecutable[] executable = new IExecutable[3];
    Script script = new Script();
    Application app = new Application();
    FichierBat bat = new FichierBat();
    executable[0] = script;
    executable[1] = bat;
    executable[2] = app;
    executable[0].executer();
    executable[1].executer();
    executable[2].executer();
   }
}
