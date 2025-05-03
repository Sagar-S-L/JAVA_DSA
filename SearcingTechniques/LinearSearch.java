package SearcingTechniques;

public class LinearSearch {

    public static int linearSearch(int n[], int key){
        for(int i = 0;i < n.length; i++){
            if(n[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n[] = {2,4,6,8,10,12,14,16,18};
        int key = 2;
       int index = linearSearch(n, key);

       if(index == -1){
        System.out.println("NOT found");
       }
       else{
        System.out.println(key + " is at index " + index);
       }
    }
    
}
