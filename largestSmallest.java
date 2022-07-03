import java.util.*;
class largestSmallest{
  public static void main(String[] args)
{
  int[] a={12,54,65,23,87,21};
int n=a.length;
Arrays.sort(a);
System.out.println("differenece is"+" "+(a[n-1]-a[0]));
}
}