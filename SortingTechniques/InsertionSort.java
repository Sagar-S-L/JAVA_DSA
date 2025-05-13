public class InsertionSort {
    
    public static void insertionSort(int n[]){
        for(int i=1;i<n.length;i++){
            int curr = n[i];
            int previous = i-1;
            while(previous>=0 && n[previous]> curr){
                n[previous+1]=n[previous];
                previous--;
            }
            n[previous+1]=curr;
        }
        }
    
    public static void main(String[] args) {
        int n[] = {20,10,40,70,50};
        insertionSort(n);

        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        } 
    }
}
