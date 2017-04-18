import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Balázs on 2017. 04. 18..
 */
public class OddAvg {

  public static void main(String[] args) {
    List<Integer> numberList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
    System.out.println(getOddNumbers(numberList));
  }

  public static int getOddNumbers(List<Integer> numberList) {
    List<Integer> getOddNumbersList = new ArrayList<>();
    int sum = 0;
    int count = 0;
    for (int i = 0; i < numberList.size(); i++) {
      if (i % 2 != 0) {
        count ++;
        sum += numberList.get(i);
      }
    }
    return sum / count;
  }
}
