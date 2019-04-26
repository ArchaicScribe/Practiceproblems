public class FirstSet {

  public static void main(String[] args) {

    boolean b = false, bool = true;
    boolean a = b && (b || bool);
    System.out.println(a);


    int[]x = {2,4,6};
    for (int i = 2; i < x.length; i++) {
      System.out.println(x[i]);
    }
    int result = 100;
    int add = 2;
    try{
      for(int g= 10; g>=0; g--){
        result /=g; //divide result by g.
        add++;
      }
    } catch (Exception e){
      result = 5;
    } finally {
      result +=add;
    }
      System.out.println(result);
    }
  }

