import java.util.Arrays;  
public class ArrayAverage{  
public static void main(String[] args) {  
// TODO Auto-generated method stub  
int arr[] = {1,2,3,4,5,6};  
int n = arr.length;
int avg,sum=0;
for(int i=0;i<n;i++)
{
  sum=sum+arr[i];
}
avg=sum/n;
System.out.println("average is"+" "+avg);
}
}