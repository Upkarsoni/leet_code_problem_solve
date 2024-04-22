public class Removeelement {
    public static void main(String[] args) {

        int[] nums = { 3, 2, 2, 3 };
        int value = 3;
        System.out.println(removeElement(nums, value));
    }

    static int removeElement(int[] nums, int value) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != value) {
                nums[count] = nums[i];
                count++;
            }

        }
        return count;

    }
}