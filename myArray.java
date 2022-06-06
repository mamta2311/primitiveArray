import java.util.Arrays;

public class myArray {
    public static void main(String[] args) {
        int[] sampleArray = new int[10];

        for(int i=0; i <10; i++) {
            sampleArray[i] = (int)(Math.random() * 100);
        }

        printArray(sampleArray);
        sortArray(sampleArray);
        printArray(sampleArray);
    }

    private static void printArray(int[] sampleArray) {
        for(int i=0; i <10; i++) {
            System.out.print(sampleArray[i] + "\t");
        }

        System.out.println();
    }

    private static void sortArray(int[] nums) {
        for (int i = 0; i < nums.length - 1; ++i)
        {
            for (int j = i + 1; j < nums.length; ++j)
            {
                if (nums[i] > nums[j])
                {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
