import java.util.*;
class Arrayreverse{
public static void main(String args[])
{ 
   int[] a={12,34,56,23,45,67,89};
int n=a.length;
int[] b=new int[n];
int j=0;
 for(int i=n-1;i>=0;i--)
  b[j++]=a[i];
System.out.println(Arrays.toString(b));
}
}