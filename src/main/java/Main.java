import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] agrs) {
    String message = "исходный текст сообщения местного жителя";
    // реализация Function
    Function<String, List<String>> genDictionary = new Function<String, List<String>>() {
      @Override
      public List<String> apply(String s) {
        // монада
        return Arrays.stream(s.split("\\s")).distinct().sorted().collect(Collectors.toList());
      }
    };
    System.out.println("Словарь: " + genDictionary.apply(message).toString());
  }

}
