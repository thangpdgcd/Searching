public class LinearSearch {
    public static int search(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

class runnercode {
    public static void main(String[] args) {
        int[] numbers = {7, 1, 3, 6, 5};
        LinearSearch searcher = new LinearSearch();
        int target = 0;
        int index = LinearSearch.search(numbers, target);
//        int index = LinearleSearch.search(numbers);
        System.out.println(" this is a number searching " + index);

    }
}
