package vectorSpace;

public interface Vector {
    public int[] getComponents();
    public int getAxisComponent(int axis);
    public int getDimension();
    public void setComponents(int[] components);
    public void setAxisComponent(int axis, int component);
    public void copyVector(Vector v);
}
