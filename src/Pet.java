/*Задача 1


статический метод для создания животного при прочтении данных из строки "dog,кличка",
"cat,кличка,вес", "turtle,кличка,вес,дата рождения".
Создать класс Main, в котором данные будут считываться с консоли и красиво выводиться на экран.
Формат входных данных: количество строк с записями о домашних животных, затем сами записи в
описанном формате.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.PublicKey;

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

  public static void addPet(String line) {
    int indexOf = line.lastIndexOf(SEP);
    String temp, temp2;
    Kind kindToLook;
    temp = line.substring(0, indexOf);
    try {
      kindToLook = Kind.valueOf(temp.toUpperCase());
    } catch (IllegalArgumentException e) {
      kindToLook = Kind.OTHER;
    }
    temp2 = line.substring(indexOf + 1);
    Pet newPat = new Pet(kindToLook, temp2);
    System.out.println(newPat);
  }


//
//  статический метод для создания животного при прочтении данных из
//  строки "dog,кличка", "cat,кличка,вес", "turtle,кличка,вес,дата рождения
//


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

