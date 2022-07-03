import java.util.Arrays;  
public class Arrayindex{  
public static void main(String[] args) {  
// TODO Auto-generated method stub  
int arr[] = {1,2,3,4,5,6};  
int n = arr.length;
int value=3;
int index;
for(int i=0;i<n;i++)
{
if(arr[i]==value)
{
System.out.println("index is found at "+" "+i);
 break;
}
else
System.out.println("number is wrong");
}
}
}