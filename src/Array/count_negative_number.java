package Array;

public class count_negative_number {
    public static void main(String[]args){
        int count=0;
        int n[]={10,-1,4,5,-6};
        for (int i=0;i<n.length;i++){
            if (n[i]<0){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
