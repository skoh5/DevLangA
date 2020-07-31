package programmers.lv2;

//https://programmers.co.kr/learn/courses/30/lessons/42626
public class Q42626 {

    public int solution(int[] scoville, int k) {
        int answer = 0;
        sort(scoville);
        int result = 0;
        Integer a = null;
        Integer b = null;

        int[] tmp = null;
        while(true) {
            if(scoville[0] >= k) {
                break;
            }
            if(scoville.length <= 1) {
                answer = -1;
                break;
            }

            a = scoville[0];
            b = scoville[1];
            result = makeNew(a, b);
            tmp = new int[scoville.length-1];
            System.arraycopy(scoville, 1, tmp, 0, tmp.length);
            tmp[0] = result;
            scoville = tmp;
            sort(scoville);
            answer++;
        }
        return answer;
    }

    private int makeNew(int a, int b) {
        return a + (b * 2);
    }

    public void sort(int arr[]) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // One by one extract an element from heap
        for (int i=n-1; i>0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2*i + 1; // left = 2*i + 1
        int r = 2*i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        int result = new Q42626().solution(scoville, k);
        System.out.print(result);
    }
}
