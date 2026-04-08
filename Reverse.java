public class Reverse{
    public static void reverse(int num[]){
        int first = 0 , last = num.length-1;
        while(first<last){
            int temp = num[last];
            num[last]= num[first];
            num[first] = temp;

            first ++;
            last -- ;
        }
    }
    public static void main(String[]args){
        int num[]={10,2,9,7,1};
        reverse(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+ " ");
        }  
    }
}
