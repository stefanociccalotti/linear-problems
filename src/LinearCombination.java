import vectorSpace.*;
import vectorSpace.euclidean.*;

public class LinearCombination {
    public static void main(String[] args) {

        //wtf

        Vector[] base = new EuclideanVector[]{  new EuclideanVector(new int[]{0, 0, 1}),
                                                new EuclideanVector(new int[]{0, 1, 0}),
                                                new EuclideanVector(new int[]{1, 0, 0}) 
                                            };
        Space space = new EuclideanSpaceCanonicalBase(base);

        Vector v1 = new EuclideanVector(new int[]{1, 2, 3});
        Vector v2 = new EuclideanVector(new int[]{1, 6, 2});

        space.associateVector(v1);
        space.associateVector(v2);



        Vector v3 = new EuclideanVector();

        v3.copyVector(v1);
        
        EuclideanSpaceCanonicalBase.scaleEuclideanVector(v3, 2);

        EuclideanSpaceCanonicalBase.addEuclideanVectors(v3, v2);

        space.associateVector(v3);

        space.printSpaceAndVectors();

    }
}
