/*Задача 1
статический метод для создания животного при прочтении данных из строки "dog,кличка",
"cat,кличка,вес", "turtle,кличка,вес,дата рождения".
Создать класс Main, в котором данные будут считываться с консоли и красиво выводиться на экран.
Формат входных данных: количество строк с записями о домашних животных, затем сами записи в
описанном формате.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

enum Kind {
  DOG,
  CAT,
  OTHER,
}

public class Pet {
  final public static String SEP = ",";
  Kind type;
  String name;
  String birthDay;
  double weight;

  public Pet(Kind type, String name, String birthDay, double weight) {
    this.type = type;
    this.name = name;
    this.weight = weight;
    this.birthDay = birthDay;
  }

  public Pet(Kind type, String name) {
    this.type = type;
    this.name = name;
  }

  public Pet(Kind type, String name, double weight) {
    this.type = type;
    this.name = name;
    this.weight = weight;
  }

  public static ArrayList<Pet> animalBase = new ArrayList<>();

  public static void addPet(String line) {

    String[] lineArray = line.split(SEP);

    double tempWeight;
    String tempKind, tempName, tempBirth;

    int counter = lineArray.length;

    //тип животного
    tempKind = lineArray[0];
    Kind kindToLook;
    try {
      kindToLook = Kind.valueOf(tempKind.toUpperCase());
    } catch (IllegalArgumentException e) {
      kindToLook = Kind.OTHER;
    }

    //Запись с одной запятой
    if (counter == 2) {
      tempName = lineArray[1];
      Pet newPet = new Pet(kindToLook, tempName);
      animalBase.add(newPet);

      printAnimal(newPet);
    }

    //Запись с двумя запятыми
    if (counter == 3) {
      tempName = lineArray[1];
      tempWeight = Double.parseDouble(lineArray[2]);
      Pet newPet2 = new Pet(kindToLook, tempName, tempWeight);
      animalBase.add(newPet2);

      printAnimal(newPet2);
    }
    //Запись с тремя запятыми
    if (counter == 4) {
      tempName = lineArray[1];
      tempWeight = Double.parseDouble(lineArray[2]);
      tempBirth = lineArray[3];
      Pet newPat3 = new Pet(kindToLook, tempName, tempBirth, tempWeight);
      animalBase.add(newPat3);

      printAnimal(newPat3);


    }


  }

  public static void printAnimal(Pet newPet) {
    if (newPet.birthDay != null) {
      System.out.println("Вид животного: " + newPet.type + ". Кличка: " + newPet.name + ". Вес: " +
          newPet.weight + ". День рождения: " + newPet.birthDay);
    }
    if (newPet.weight == 0) {
      System.out.println("Вид животного: " + newPet.type + " Кличка: " + newPet.name);
    }
    if (newPet.weight != 0 && newPet.birthDay == null) {
      System.out.println("Вид животного: " + newPet.type + ". Кличка: " + newPet.name + ". Вес: " +
          newPet.weight);
    }

  }

  public String getName() {
    return name;
  }

  public String getBirthDay() {
    return birthDay;
  }

  public double getWeight() {
    return weight;
  }

  public Kind getType() {
    return Kind.CAT;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setType(String type) {
    //this.type = type;
  }

  public void setBirthDay(String birthDay) {
    this.birthDay = birthDay;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

}

