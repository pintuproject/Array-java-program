import java.util.*;
public class present{
  public static void main(String[] args)
{
  int[] a={12,54,65,23,87,21};
int n=a.length;
boolean b=present.verify(a,n);
if(b)
System.out.println("present");
else
System.out.println("not present");
}
public static boolean verify(int[] a,int n)
{
 for(int i=0;i<n;i++)
  {
 if(a[i]==12||a[i]==23)
  return true;
else 
 return false;
}
 return false;
}
}