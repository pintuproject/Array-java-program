import java.util.*;
class Arrayinsert{
public static void main(String args[])
{ 
   int[] a={12,34,56,23,45,67,89};
int n=a.length;
   int[] b=new int[n];
 
int index=2,value=15;
for(int i=n-1;i>=0;i--)
{
if(i!=index)
  b[i]=a[i];
else
b[i]=value;
}
System.out.println(Arrays.toString(b));
}
}

