public class BlackJack {
  static class Card {
    String color;
    int value;

    Card(String color, int value) {
      this.color = color;
      this.value = value;
    }

    public String getColor() {
      return color;
    }

    public int getValue() {
      return value;
    }
  }
}
