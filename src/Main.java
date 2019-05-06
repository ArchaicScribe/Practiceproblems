import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    //31, 45, 22, 98, 10
    int[] numbers = {31, 45, 22, 98, 10};
    Arrays.sort(numbers);//sorting the numbers array.
    System.out.println(Arrays.toString(numbers));//calling on the Arrays class to sort, then convert the array into a string so not to get a reference point back.



    String[] myFavoriteVideoGames = {"Halo", "Assassin's Creed", "The Division", "Skyrim"};

    System.out.println("Index 1" + numbers[1]);
    System.out.println("The length of the array is: " + numbers.length);

    System.out.println(Array.get(myFavoriteVideoGames, 0));


  }

}
