package iterator;

import java.util.Iterator;

public class Driver {

  public static void main(String[] args) {
    Integer[][] m1 = {{1,2,3}, {-1,-2,-3}, {4,5,6}, {-4,-5,-6}, {7,8,9},
        {-7,-8,-9}};
    Matrix matrix1 = new Matrix(m1);
    // This is allowed because the Matrix class implemented the Iterable
    // interface
    for(Integer num : matrix1) {
      System.out.print(num + " ");
    }

    System.out.println();

    Integer[][] m2 = {{1,2}, {3,4}, {5,6}, {7,8}, {9,10}};
    Matrix matrix2 = new Matrix(m2);

    // This is you would normally do it if the Iterable interface is not
    // implemented
    Iterator<Integer> matrix2Iterator = matrix2.iterator();
    while(matrix2Iterator.hasNext()) {
      Integer num = matrix2Iterator.next();
      System.out.print(num + " ");
    }

    System.out.println();

    // This is how the professor did it in his lecture slides
    // This utilizes a static method that does the traversal
    Integer[][] m3 = {{1,1}, {2,2}, {3,3}, {4,4}, {5,5}, {6,6}, {7,7}, {8,8}};
    Matrix matrix3 = new Matrix(m3);
    print(matrix3.iterator());
  }

  public static void print(Iterator<Integer> itr) {
    while(itr.hasNext()) {
      Integer num = (Integer) itr.next();
      System.out.print(num + " ");
    }
  }
}
