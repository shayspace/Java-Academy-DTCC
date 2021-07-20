package assignment_3.people_package;
/*
    This is the class you need to work on
    If you were to create a class from scratch, please remember that the name of the class should match
    the name of the file the class resides in. (this is more of a convention thing)

    Reference:
    1) https://stackoverflow.com/questions/1841847/can-i-compile-a-java-file-with-a-different-name-than-the-class
 */

import java.util.concurrent.ThreadLocalRandom;

public class Person {

  public static void main (String[] args) {

      Person myPerson = new Person();
      myPerson.GetName();
      myPerson.GetAge();
      myPerson.GetID();

      String p = myPerson.name;
      int a = myPerson.age;
      int z = myPerson.id;

      System.out.println(String.format("The persons name is: %s.", p));
      System.out.println(String.format("%s is %s years old.", p, String.valueOf(a)));
      System.out.println(String.format("%s' ID Number is: %s.", p, String.valueOf(z)));

      // System.out.println("The persons name is: " + p.toString());
      // System.out.println(p + "is: " + a.toString() + "years old.");
      // System.out.println(p + "ID Number is: " + z.toString() + ".");
  }

    //  public static class Individual {
          public String name = "";
          public int age = -1;
          public int id = -1;

      /*    public Individual() {
              name = "";
              age = -1;
              id = -1;
          } */

          public String GetName() {
              SetName("");
              return name;
          }

          public void SetName(String n) {
              if (name.isEmpty()) {
                  name = n;
              }
          }

          public int GetAge() {
              SetAge();
              return age;
          }

          public void SetAge() {
              int bottom = 1;
              int top = 99;
              age = ThreadLocalRandom.current().nextInt(bottom, top + 1);
          }

          public int GetID() {
              SetID();
              return id;

          }

          public void SetID() {

              int low = 0;
              int max = 1000;
              id = ThreadLocalRandom.current().nextInt(low, max + 1);

          }
      }
 // }


