public class WeekendFun {
  public boolean cigarParty(int cigars, boolean isWeekend) {
    if(isWeekend && (cigars >= 40)) {
      return true;
    } else if ((isWeekend == false) && ((cigars <= 40) && (cigars >= 60))) {
      return true;
    }
    return isWeekend;
  }

  public boolean firstLast6(int[] nums) {
    if (nums[0] == 6){
      return true;
    } else if ((nums[nums.length -1] == 6)) {
      return true;
    } else {
      return false;
    }
  }

  public boolean sameFirstLast(int[] nums) {
    if((nums[nums.length] > 0) && (nums[0] == nums[nums.length - 1])){
      return true;
    } else if (nums[nums.length] < 1){
      return false;
    }
    return false;
  }


}


