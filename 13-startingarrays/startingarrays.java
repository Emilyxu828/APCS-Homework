public class startingarrays {

  public int[] frontPiece(int[] nums) {
    int[] hello;
    hello = new int[2];
    if (nums.length <= 2)
      return nums;
    else {
      hello[0] = nums[0];
      hello[1] = nums[1];
      return hello;
    }
  }

  public int sum13(int[] nums) {
    int sum = 0;
    int i = 0;
    while (i<nums.length) {
      if (nums[i] == 13){
        sum = sum;
        i = i + 2;
      }
      else {
        sum = sum + nums[i];
        i++;
      }
    }
    return sum;
  }

}
