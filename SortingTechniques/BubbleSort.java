public class BubbleSort {
    
    public static void bubbleSort(int n[]){
        int temp=0;
        int swap = 0;
        for(int pass=0;pass<n.length-1;pass++){
            
            if(pass>0 && swap==0){
                System.out.println("Array already sorted");
                break;
            }
            else{
            for(int j=0;j<(n.length-pass-1);j++){
                if(n[j]>n[j+1]){
                    temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                    swap++;
                }
            }
        }
        }
    }

    public static void main(String[] args) {
        int n[] = {1,2,5,4,6};
        bubbleSort(n);

        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }
}
