  class MyDuplicateElements {
 public static int[] removeDuplicates(int[] input){

    int j = 0,flag;
    int i = 1;
    //return if the array length is less than 2
    if(input.length < 2){
        return input;
    }
    while(i < input.length){
        flag=0;
        for(int k=0;k<i;k++){
        if(input[i] == input[k]){
            flag=1;
            break;
        }

        }
        if(flag==0)
        {
            input[++j] = input[i];
        } 
         i++;
        }

    int[] output = new int[j+1];
    for(int k=0; k<output.length; k++){
        output[k] = input[k];
    }

    return output;
}

public static void main(String a[]){
    int[] input1 = {12, 34, 12, 45, 67, 89};
    int[] output = removeDuplicates(input1);
    for(int i:output){
        System.out.print(i+" ");
    }
 }
}