public class IntCarre implements ICalculable{
    @Override
    public void CalculSurface(int a, int b) {
        
        int surface  = a*b;
        System.out.println("surface du carre est : "+surface);
        
    }
}
