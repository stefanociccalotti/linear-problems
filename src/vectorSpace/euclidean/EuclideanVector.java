package vectorSpace.euclidean;

import vectorSpace.Vector;

public class EuclideanVector implements Vector{
    private int components[];
    private int dimension;

    public EuclideanVector() {}

    public EuclideanVector(int dimension) {
        this.components = new int[dimension];
        this.dimension = dimension;
    }

    public EuclideanVector(int[] components) {
        this.components = components;
        this.dimension = components.length;
    }

    public int[] getComponents() {
        return this.components;
    }
    public int getAxisComponent(int axis) {
        return this.components[axis];
    }
    public int getDimension() {
        return this.dimension;
    }
    public void setComponents(int[] components) {
        this.components = components;
    }
    public void setAxisComponent(int axis, int component) {
        this.components[axis] = component;
    }

    public void copyVector(Vector v) {
        int[] components = new int[v.getDimension()];
        int[] tempComponents = v.getComponents();

        for(int i = 0; i < components.length; i++) {
            components[i] = tempComponents[i];
        }
        this.components = components;
    }

    public String toString() {
        String s = "(";
        int i;

        for(i = 0; i < components.length-1; i++) {
            s+=components[i]+", ";
        }
        s+=components[i]+")\n";

        return s;
    }
}
