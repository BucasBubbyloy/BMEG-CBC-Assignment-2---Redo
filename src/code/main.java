package code;

class Main {
    public static void main(String[] args) {
        int[] goop = {0, 1, 2, 3, 4};

        int[] bar = new int[100];
        for(int i = 0; i < 100; i++){
            bar[i] = i;
        }
        System.out.println("The number of even numbers in goop is:");
        System.out.println(countEvenNum(goop));

        System.out.println("The number of even numbers in bar is:");
        System.out.println(countEvenNum(bar));

    }

    private static int countEvenNum(int[] arr){
        int count = 0;
        int arrLength = arr.length;

        for (int i = 0; i < arrLength; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
        }

        return count;
    }
}