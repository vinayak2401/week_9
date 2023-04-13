/*Write a Java class called Person that has fields for the person's name and age. Write a custom Comparator implementation called AgeComparator that sorts Person objects in ascending order based on their age. Then, modify the Person class to implement the Comparable interface, so that Person objects are sorted first by age (ascending order), and then by name (alphabetical order). Test your implementation by creating a list of Person objects and sorting them using both the AgeComparator and the Comparable implementation.*/
import java.util.*;
class Person implements Comparable<Person>{
  String name;
  int age;
  Person(String name,int age){
    this.name=name;
    this.age=age;
  }
  public int compareTo(Person p1){
    return name.compareTo(p1.name);
  }
}
class AgeComparator implements Comparator<Person>{
  public int compare(Person p1,Person p2){
    if(p1.age>p2.age){
      return 1;
    }
    else if(p1.age<p2.age){
      return -1;
    }
    else{
      return 0;
    }
  }
}
class PersonDemo{
  public static void main(String args[]){
    ArrayList<Person> per=new ArrayList<Person>();
    Scanner s=new Scanner(System.in);
    for(int i=0;i<3;i++){
      per.add(new Person(s.next(),s.nextInt()));
    }
    System.out.println("Sorted based on age");
    Collections.sort(per,new AgeComparator());
    for(Person p:per){
      System.out.println(p.name+" "+p.age);
    }
    System.out.println("Sorted based on name");
    Collections.sort(per);
    for(Person p:per){
      System.out.println(p.name+" "+p.age);
    }
  }
}