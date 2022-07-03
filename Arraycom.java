import java.util.*;
class Arraycommon{
public static void main(String args[])
{ 
   int[] a={12,34,56,23,45,12,34,67,89};
int n1=a.length;
   int[] b={ 13,23,22,34,35,78,87,12,67};
  int n2=b.length;
  for(int i=0;i<n1;i++)
  { 
 for(int j=i+1;j<n2;j++)
  {
 if(a[i]==a[j])
  System.out.print(a[i]+" ");
}
}
}
}