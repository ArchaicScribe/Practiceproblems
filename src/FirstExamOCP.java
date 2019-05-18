public class FirstExamOCP {

  public static void main(String[] args) {

    int[] simpleArray = new int[5];
    for (int i = 0; i < simpleArray.length; i++) {
      simpleArray[i] = simpleArray.length - i;
    }
    int firstArray[][] = {{1, 2, 3}, {3, 2, 1}};
    for (int k[] : firstArray) {
      for (int j : k) {
        System.out.println(j + " ");
      }
    }
    //int sampleArrayA[] = {{1,2,3,6}, {3,5,8}};
    System.out.println(simpleArray[3]);

  }
}

