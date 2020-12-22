import java.util.Arrays;

public class LinearIn {
  /*

Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the
numbers in inner appear in outer.
The best solution makes only a single "linear" pass of both arrays,
taking advantage of the fact that both arrays are already in sorted order.
   */

  public static void main(String[] args) {
      LinearIn linear = new LinearIn();
      int[] outer = {1, 2, 4, 6};
      int[] inner = {2 ,3, 4};

    System.out.printf("\ndoes the inner array %s appear in the outer array %s?: "
        + linear.linearIn(outer, inner) +"\n", Arrays.toString(inner), Arrays.toString(outer));

  }

  public boolean linearIn(int[] outer, int[] inner) {
    int j = 0;

    for (int i = 0; i < outer.length && j < inner.length; i++) {
      if (outer[i] == inner[j]) {
        j++;
      }
    }
    return (j == inner.length);
  }

}
