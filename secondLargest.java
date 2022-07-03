import java.util.*;
class secondLargest{
  public static void main(String[] args)
{
  int[] a={12,54,65,23,87,21};
int n=a.length;
  Arrays.sort(a);
 System.out.println("second largest element is"+" "+a[n-2]);
}
}

 