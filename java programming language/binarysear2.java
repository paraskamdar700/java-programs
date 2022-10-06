
public class binarysear2 {
    public static int binarystring(String arr[], String x )

   {
        int start = 0;
        int last = arr.length - 1;
        while (start <= last) {
            int mid = (start +last) / 2;
            int a = x.compareTo(arr[mid]);
            if (a == 0) {
                return mid;
            } else if (a > 0) {
                start = mid + 1;
            } else {
                last= mid - 1;
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        String arr[] = { "apple", "banana", "cat", "dog", "helo" };
        String x = "banana";
        int reasult = binarystring(arr, x);
        if (reasult == -1) {
            System.out.println("string not found");
        } else {
            System.out.println("string found" + reasult);
        }

    }

}
