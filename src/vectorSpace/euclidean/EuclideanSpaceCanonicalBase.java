package vectorSpace.euclidean;

import vectorSpace.Space;
import vectorSpace.Vector;
import java.util.ArrayList;
import java.util.Arrays;

public class EuclideanSpaceCanonicalBase implements Space{
    private Vector[] base;
    private int dimension;
    private ArrayList<Vector> associatedVectors = new ArrayList<Vector>();
    
    public EuclideanSpaceCanonicalBase() {}
    
    public EuclideanSpaceCanonicalBase(Vector[] base) {
        this.base = base;
        this.dimension = base.length;
        this.associatedVectors.addAll(Arrays.asList(base));
    }

    public EuclideanSpaceCanonicalBase(int dimension) {
        int baseIndex = 0;
        for(int i = 0; i < dimension; i++) {
            int[] components = new int[dimension];
            if(baseIndex == i) components[i] = 1;
            this.base[i] = new EuclideanVector(components);
        }
        this.dimension = dimension;
        this.associatedVectors.addAll(Arrays.asList(this.base));
    }

    public Vector[] getBase() {
        return this.base;
    }
    public int getDimension() {
        return this.dimension;
    }

    public void associateVector(Vector v) {
        this.associatedVectors.add(v);
    }

    public static void addEuclideanVectors(Vector v1, Vector v2) {
        int[] components = v1.getComponents();
        int[] tempComponents = v2.getComponents();

        if(v1.getDimension() == v2.getDimension()) {
            for(int i = 0; i < components.length; i++) {
                components[i] = components[i] + tempComponents[i];
            }
        }
    }

    public static void scaleEuclideanVector(Vector v, int scalar) {
        
        int[] components = v.getComponents();

        for(int i = 0; i < components.length; i++) {
            components[i] = components[i]*scalar;
        }
    }

    public void printAssociatedVectors() {
        associatedVectors.forEach((v) -> {
            System.out.print(v.toString());
        });
    }

    public void printSpaceAndVectors() {
        System.out.println("\nThis euclidean space has a canonical base in "+this.dimension+" dimension(s)");
        printAssociatedVectors();
    }
}
