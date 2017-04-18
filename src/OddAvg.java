import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Balázs on 2017. 04. 18..
 */
public class OddAvg {

  public static void main(String[] args) {
    List<Integer> numberList = new ArrayList<>(Arrays.asList(3, 4, 5));
    System.out.println(getOddNumbers(numberList));
  }

  public static int getOddNumbers(List<Integer> numberList) {
    List<Integer> getOddNumbersList = new ArrayList<>();
    int sum = 0;
    for (int i = 0; i < numberList.size(); i++) {
      sum += i;
      if (i % 2 != 1) {
        getOddNumbersList.add(numberList.get(i));
      }
    }
    return sum / getOddNumbersList.size();
  }
}
