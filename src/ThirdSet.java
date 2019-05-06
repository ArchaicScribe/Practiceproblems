public class ThirdSet {


  public static int rt(int x){
    return x + 1;
  }

  public static void main(String[] args) {
    int p = rt(4) + rt(3) * (rt(4)-rt(4));
    System.out.println(p);
  }


  public boolean cigarParty(int cigars, boolean isWeekend) {
    if(cigars < 40) {
      return false;
    } else if (cigars >= 60){
      return true;
    }
    return isWeekend;
  }

}
