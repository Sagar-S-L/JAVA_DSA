public class SelectionSort {
     

    public static void selectionSort(int n[]){
        for(int i=0;i<n.length-1;i++){
            int minIndex =i;
            
            for(int j = i+1;j<n.length;j++){
                if(n[minIndex]>n[j]){
                    minIndex=j;
                }
            }
            int temp = n[minIndex];
            n[minIndex]=n[i];
            n[i]=temp;
        }
    }
    public static void main(String[] args) {
        
        int n[] = {60,20,90,10,45,23,54};
        selectionSort(n);

        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }

    }
}
