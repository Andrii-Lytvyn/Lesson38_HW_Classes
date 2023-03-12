import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите количество записей");
    int n = Integer.parseInt(br.readLine());
    String line = br.readLine();
    Pet.addPet(line,n);
  }
}