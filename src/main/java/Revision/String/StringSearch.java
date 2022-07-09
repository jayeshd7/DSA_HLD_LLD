package Revision.String;

public class StringSearch {

    public static void main(String[] args) {
        String arr[] = {"for", "geeks", "", "", "", "", "ide",
                "practice", "", "", "", "quiz"};
        String x = "geeks";
        int n = x.length();
        int index = sparseSearch(arr, x, n);
        if (index != -1)
            System.out.println(x+ " found at index "+index);
        else
            System.out.println(x+" not found");

        //liner solution
        /*for(int i = 0 ; i <arr.length;i++){
            if(find.equals(arr[i])){
                System.out.println("find at index"+i);
            }

        }*/

        // binary search
        
    }

    private static int sparseSearch(String[] arr, String x, int n) {
        return binarySearchSol(arr, 0, n - 1, x);
    }

    private static int binarySearchSol(String[] arr, int low, int high, String x) {
        if (low > high)
            return -1;

        int mid = (low + high) / 2;

//Modified Part
        if (arr[mid] == "") {
            int left = mid - 1;
            int right = mid + 1;

            /*Search for both side for a non empty string*/
            while (true) {

                /* No non-empty string on both sides */
                if (left < low && right > high)
                    return -1;

                if (left >= low && arr[left] != "") {
                    mid = left;
                    break;
                }

                else if (right <= high && arr[right] != "") {
                    mid = right;
                    break;
                }

                left--;
                right++;
            }
        }

        /* Normal Binary Search */
        if (arr[mid] == x)
            return mid;
        else if (x.compareTo(arr[mid]) < 0)
            return binarySearchSol(arr, low, mid - 1, x);
        else
            return binarySearchSol(arr, mid + 1, high, x);
    }
}
