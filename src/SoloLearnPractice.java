public class SoloLearnPractice {

  public static void main(String[] args) {
    int[] myArr = {10, 20, 30, 40};
    int sum = 0;
    for (int x = 0; x < myArr.length; x++) {
      sum += myArr[x];
    }
    System.out.println(sum);

    String name = "James Gosling";
    int yearCreated = 1995;
    System.out.println(name);
    System.out.println(yearCreated);

    double creditsEarned = 176.5;
    double creditsOfSeminar = 8;
    double creditsToGraduate = 180;
    System.out.println(creditsEarned < creditsToGraduate);

  }
}

