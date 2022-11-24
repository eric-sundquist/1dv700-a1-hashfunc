
import java.util.Scanner;

public class App {
  Scanner input = new Scanner(System.in, "UTF8");

  public void run(HashFunc hf, FileHandler fh) {
    String text = fh.readTextFile("/Users/ericsundquist/webprog/1dv700/a1/1dv700-a1-hashfunc/data/input.txt");
    String stringArr[] = text.split("\n");

    StringBuilder sb = new StringBuilder();
    for (String str : stringArr) {
      String hash = hf.hash(str);
      sb.append(hash + "\n");
    }

    fh.writeToTextFile(sb.toString(), "/Users/ericsundquist/webprog/1dv700/a1/1dv700-a1-hashfunc/data/output.txt");
  }

  // Generates a file with 15360 random test strings
  private void genInputFile(FileHandler fh) {
    StrGenerator sg = new StrGenerator();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 15360; i++) {
      sb.append(sg.genStr() + "\n");
    }
    fh.writeToTextFile(sb.toString(), "/Users/ericsundquist/webprog/1dv700/a1/1dv700-a1-hashfunc/data/input.txt");
  }

  public static void main(String[] args) {
    App app = new App();
    HashFunc hf = new HashFunc();
    FileHandler fh = new FileHandler();

    app.genInputFile(fh);

    app.run(hf, fh);
  }
}
