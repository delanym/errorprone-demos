import java.nio.file.Files;
import java.nio.file.Path;

public class DefaultCharset {
  public void test(Path path) throws Exception {
    byte[] bytes = Files.readAllBytes(path); // DefaultCharset: uses system default charset if converted to string
    String s = new String(bytes); // <-- triggers DefaultCharset
  }
}
