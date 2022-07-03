import java.util.*;
class Arrayspecific{
public static void main(String args[])
{ 
   int[] a={12,34,56,23};
int n=a.length;
   int[] b=new int[n-1];
 
int removeIndex=2;
for(int i=0,j=0;i<n;i++)
{
if(i!=removeIndex)
b[j++]=a[i];

}
System.out.println(Arrays.toString(b));
}
}
	