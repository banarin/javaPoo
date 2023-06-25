public class IntCercle implements ICalculable{
    @Override
    public void CalculSurface(int a, int b) {
        double surface  =  3.14*a;
        System.out.println("Surfacedu cercle : " + surface);
    }
}
