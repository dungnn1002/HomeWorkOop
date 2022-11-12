public class Vector {
    private float x;
    private float y;
    private float z;

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public Vector() {

    }

    public Vector(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector addVector(Vector a, Vector b)
    {
        Vector c = new Vector();
        c.x = a.x+b.x;
        c.y = a.y+b.y;
        c.z = a.z+b.z;
        return c;
    }
    public void printVector(Vector c)
    {
        System.out.print("Vector c = "+ c.x+" "+c.y +" "+c.z);
    }
}


