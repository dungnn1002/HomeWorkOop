public class Main {
    public static void main(String []args)
    {
        Vector a = new Vector(2f,3f,4f);
        Vector b = new Vector(3f,4f,5f);
        Vector c = new Vector();
        c = c.addVector(a,b);
//        System.out.println("Vector a +b = "+ c);
        c.printVector(c);
    }
}
