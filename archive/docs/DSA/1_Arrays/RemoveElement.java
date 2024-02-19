// description: https://leetcode.com/problems/remove-element/submissions/
// Basically the k that we have is the length of the new array 
// or the length of the valid elements in the array

// Explanation: https://i.ibb.co/6bMf92M/Screenshot-1.png

// K is keeping a track of the useless values
// as soon as we find useful values swap it with useless ones and increment k

class RemoveElement {
    public static int removeElement(int[] arr, int x) {

        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != x) {
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;

                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 4, 2 };
        int x = 2;

        System.out.println(removeElement(arr, x));

    }
}