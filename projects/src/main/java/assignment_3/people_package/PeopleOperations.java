package assignment_3.people_package;


import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class PeopleOperations {
    public static void main (String args []) throws Exception {
        /*
            Please ensure that you create an ArrayList of Person(s) with at least
            4 members
         */

        ArrayList<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Joules");
        names.add("Zohora");
        names.add("Kim");
        names.add("Penny");
        names.add("Meteor");
        names.add("Popcorn");
        names.add("Precious");
        names.add("Toy");
        names.add("Rico");
        names.add("Rod");
        names.add("Ed");
        names.add("Cecil");
        names.add("Eugene");
        names.add("Ato");
        names.add("Sugar");
        names.add("Smitty");
        names.add("Baby Girl");
        names.add("Candy");
        names.add("Jackie");
        names.add("Bob");
        names.add("Joyce");
        // String[] names = {"Anna", "Joules", "Zohora", "Kim", "Davey"};

        ArrayList<Person> people = new ArrayList<>();


        int listsz = 25;
        int listcnt = 0;

        while(listcnt < listsz){

             int index = ThreadLocalRandom.current().nextInt(0, names.size());

             String name = names.get(index) + Integer.valueOf(listcnt);
            Person myp = new Person();
            
           myp.SetName(name);
           myp.GetAge();

           // p.getAge();
            people.add(myp);
            listcnt = listcnt + 1;
        }

         System.out.print(people.toString());


      /*  Person youngestPerson = getYoungestPerson(people);
        Person oldestPerson = getOldestPerson(people);
        ArrayList<Person> sortedByAgeList = getSortedListByAge(people);
        ArrayList<Person> sortedByNameList = getSortedListByName(people, false); */


        /*
            For the below to work where you can see what you've done, you must have
            done the section 1 recap portion where you override the toString() method of the
            Person class!
         */

     /*   for(Person p : sortedByAgeList) {
            int [] srtAge = new int[6];
            System.out.println(p);
        }

        for(Person p : sortedByNameList) {
            System.out.println(p);
        }  */
    }

   /* public static Person getYoungestPerson(ArrayList<Person> people) throws Exception {
    int y = 0;
    int cnum = 0;
    int nnum = 0;

        for (int i = 0; i < people.size(); i++) {
            people.get() = cnum;
        }

       // return;

   throw new Exception("Please implement this method");
          } */

  /*  public static Person getOldestPerson(ArrayList<Person> people) throws Exception {

      //  return;
      throw new Exception("Please implement this method");

    }  */

  /*  public static ArrayList<Person> getSortedListByAge(ArrayList<Person> list) throws Exception {

        java.util.Arrays.sort();

        throw new Exception("Please implement this method");
    }

    public static ArrayList<Person> getSortedListByName(ArrayList<Person> list, boolean isAscending) throws Exception {

       // return();
       throw new Exception("Please implement this method");
    } */

}
