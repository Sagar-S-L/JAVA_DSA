package SearcingTechniques;

public class BinarySearch {

    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;

        while(start <=end){
            int mid = (start + end)/2;

            if(key==numbers[mid]){
                return mid;
            }
            else if(key<numbers[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;

    }
    


    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8 ,10 , 12, 14};
        int key = 10;
        int index = binarySearch(numbers, key);

        if(index == -1){
            System.out.println("Key not found");
        }
        else{
            System.out.println(key +" found at index "+ index);
        }
    }
}
