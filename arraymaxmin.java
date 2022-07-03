import java.util.*;
class Arraymaxmin{
public static void main(String args[])
{ 
   int[] a={12,34,56,23,45,67,89};
int n=a.length;
int temp;
 for(int i=0;i<n;i++)
{
 for(int j=0;j<n-i-1;j++)
  {
  if(a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
System.out.println(" maximum is"+" "+a[n-1]);
System.out.println(" minimum is"+" "+a[0]);
}
}



 