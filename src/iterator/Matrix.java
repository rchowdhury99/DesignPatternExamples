package iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * The Matrix class is traversable with a for-each loop since it implements the
 * Iterable interface
 */
public class Matrix implements Iterable<Integer>{

  private Integer[][] matrix;

  public Matrix(Integer[][] matrix) {
    this.matrix = matrix;
  }

  private class MatrixIterator implements Iterator<Integer> {

    private Queue<Integer> queue;

    public MatrixIterator(Integer[][] matrix) {
      this.queue = new LinkedList<Integer>();
      for(int row = 0; row<matrix.length; row++)
        for(int col = 0; col<matrix[0].length; col++)
          this.queue.add(matrix[row][col]);
    }

    @Override
    public boolean hasNext() {
      return !this.queue.isEmpty();
    }

    @Override
    public Integer next() {
      return this.queue.poll();
    }
  }

  @Override
  public Iterator<Integer> iterator() {
    return new MatrixIterator(this.matrix);
  }

}
