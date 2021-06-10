package vectorSpace;

public interface Space {
    public Vector[] getBase();
    public int getDimension();
    public void associateVector(Vector v);
    public void printAssociatedVectors();
    public void printSpaceAndVectors();

}
