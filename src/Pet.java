/*Задача 1


статический метод для создания животного при прочтении данных из строки "dog,кличка",
"cat,кличка,вес", "turtle,кличка,вес,дата рождения".
Создать класс Main, в котором данные будут считываться с консоли и красиво выводиться на экран.
Формат входных данных: количество строк с записями о домашних животных, затем сами записи в
описанном формате.*/

import java.security.PublicKey;

enum Kind {
  DOG,
  CAT,
  OTHER,
}

public class Pet {
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

