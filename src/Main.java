import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Введите количество записей: ");
    int n = Integer.parseInt(br.readLine());
    for (int i = 0; i < n; i++) {
      System.out.println("Введите запись №: " + (i + 1));
      String line = br.readLine();
      Pet.addPet(line);
    }
    Pet.printAnimalArray(Pet.animalBase);
  }
}

/*3
cat,Josh
dog,Hansa,12.4
turtle,Jerry,1,1 Januar
 */