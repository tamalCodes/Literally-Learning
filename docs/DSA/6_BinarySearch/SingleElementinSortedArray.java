class SingleElementinSortedArray {
    public static int singleNonDuplicate(int[] arr) {
        int left = 0, right = arr.length - 1, mid = 0, elementsLeft = 0;
        while (left < right) {
            mid = left + (right - left) / 2;

            // if mid is 3,next element is also 3
            if (arr[mid] == arr[mid + 1]) {
                // check if even elements are left after the second 3
                elementsLeft = right - (mid + 1);

                if (elementsLeft % 2 == 0)
                    right = mid - 1;
                else
                    left = mid + 2;
            } else if (arr[mid] == arr[mid - 1]) {
                elementsLeft = (mid - 1) - left;

                if (elementsLeft % 2 == 0)
                    left = mid + 1;
                else
                    right = mid - 2;
            } else {
                return arr[mid];
            }
        }

        return arr[left];
    }

    public static void main(String args[]) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        System.out.println(singleNonDuplicate(arr));
    }
}