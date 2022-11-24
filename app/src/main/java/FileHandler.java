import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandler {
  public String readTextFile(String path) {
    String content = "";
    try {
      content = Files.readString(Path.of(path));
    } catch (Exception e) {
    }
    return content;
  }

  public void writeToTextFile(String text, String path) {
    try {
      Files.writeString(Path.of(path), text);
    } catch (Exception e) {
    }
  }
}
