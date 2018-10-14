import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int size;

        do {
            System.out.printf("Enter size: ");
            size = scanner.nextInt();
            if(!isAcceptableSizeNumber(size)){
                System.out.printf("This size isn't valid ");
            }
        }while (!isAcceptableSizeNumber(size));

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        System.out.printf("\nEnter remove element: ");
        int rmEl = scanner.nextInt();
        int index = getIndex(array,rmEl);
        if(index==-1){
            System.out.printf("This number is not available! ");
        }else{
            remove(array,index);

            System.out.printf("%-20s%s", "New array: ", "");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
        }

    }

    public static boolean isAcceptableSizeNumber(int size){
        return size>0&&size<=10?true:false;
    }

    public static void remove(int[] array, int index){
        if(array.length-1==index){
            array[array.length-1] = 0;
        }else{
            for(int i = index; i < array.length; i++){
               if(i==array.length-1){
                   array[i] = 0;
               }else{
                   array[i] = array[i+1];
               }
            }
        }
    }

    public static int getIndex(int[] arr, int value){
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==value){
                return i;
            }
        }
        return -1;
    }
}
