import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    int[] arr = {3,1,0,5,7};
    bubble(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void bubble(int[] nums){
    for(int i = 0; i < nums.length; i++){
      for(int j = 1; j < nums.length; j++){
        if(nums[j] < nums[j-1]){
          swap(nums, j, j-1);
        }
      }
    }
  }

  private static void swap(int[] nums, int j, int i){
    int temp = nums[j];
    nums[j] = nums[i];
    nums[i] = temp;
  }
}
