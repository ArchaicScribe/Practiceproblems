public class WeekendFun {
  public boolean cigarParty(int cigars, boolean isWeekend) {
    if(isWeekend && (cigars >= 40)) {
      return true;
    } else if ((isWeekend == false) && ((cigars <= 40) && (cigars >= 60))) {
      return true;
    }
    return isWeekend;
  }

  public int dateFashion(int you, int date) {
    if(you =< 2){
      return 0;
    } else if ((you >= 8)){
      return 2;
    }else{
      return 1;
    }
  }


}

}
