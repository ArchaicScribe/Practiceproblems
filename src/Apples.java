public class Apples {

  public static void main(String[] args) {
    int firstArray[][] = {{8,9,10,11},{12,13,14,15}};
    int secondArray[][] = {{30,31,32,33},{43},{4,5,6}};
    int thirdArray[][] = {{99,98,97,85},{25,26,28,120}, {78}};

    System.out.println("This is the first array");
    display(firstArray);

    System.out.println("This is the second array");
    display(secondArray);

    System.out.println("This is the third array");
    display(thirdArray);


    int arr[][] = new int[4][];
    arr[0] = new int[1];
    arr[1] = new int[2];
    arr[2] = new int[3];
    arr[3] = new int[4];

    int i, j, k = 0;
    for(i = 0; i< 4; i++){
      for(j= 0; j < i + 1; j++){
        arr[i][j] = k;
        k++;
      }
    }
    for(i = 0; i < 4; i++){
      for(j= 0; j < i + 1; j++){
        System.out.println(" " + arr[i][j]);
        k++;
      }
      System.out.println();
    }
  }

  public static void display(int x[][]){
    for(int row = 0; row < x.length;row++){
      for(int column = 0; column < x[row].length; column++){
        System.out.print(x[row][column] + "\t");
      }
      System.out.println();
    }
  }
}
