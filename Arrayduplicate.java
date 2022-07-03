import java.util.*;
class Arrayduplicate{
public static void main(String args[])
{ 
   int[] a={12,34,56,23,45,12,34,67,89};
int n=a.length;
int value;
  for(int i=0;i<n;i++)
{
 
for(int j=i+1;j<n;j++)
 {
 if(a[i]==a[j])
{
System.out.print(a[j]+" ");
 
}
}
}
}
}