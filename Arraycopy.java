import java.util.*;
class Arraycopy{
public static void main(String args[])
{ 
   int[] a={12,34,56,23};
int n=a.length;
   int[] b=new int[n];
 for(int i=0;i<n;i++)
   b[i]=a[i];
System.out.println(Arrays.toString(b));
}
}
 