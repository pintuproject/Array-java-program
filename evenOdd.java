import java.util.*;
class evenOdd{
  public static void main(String[] args)
{
  int[] a={12,54,65,23,87,21};
int n=a.length;
 int even=0;
int odd=0;
 for(int i=0;i<n;i++)
{
 if(a[i]%2==0)
  even++;
else
 odd++;
}
System.out.println("even is"+" "+even);
System.out.println("odd is"+" "+odd);
}
}