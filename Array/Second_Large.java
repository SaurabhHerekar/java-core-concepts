public class Second_Large {

    public static void main(String[] args) {
        int[] arr = {10,20,30};

        int largest=arr[0];
        int Second_Large=arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]> largest){
                Second_Large=largest;
                largest=arr[i];
            }
            else if(arr[i]>Second_Large && arr[i]!= largest){
                Second_Large=arr[i];
            }
        }
        System.out.println("Second largest number: "+ Second_Large);
    }
}
