public class Copy {
  public final static String FILE_NAME = "copy-01.txt";

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("copy [source] [destination]");
    } else {
      System.out.println("Unknown argument");
    }
  }
}
