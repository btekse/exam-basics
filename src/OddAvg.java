import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Balázs on 2017. 04. 18..
 */
public class OddAvg {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
    ArrayList<Integer> finalList = new ArrayList<Integer>();

    for (int i = 0; i < list.size(); i++) {
      if (i % 2 != 1)
        finalList.add(list.get(i));
    }
    System.out.println(finalList);
  }
}
