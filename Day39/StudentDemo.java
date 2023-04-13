import java.util.*;

class Student implements Comparable<Student> {
  private int id;
  private String name;
  private String branch;
  private int age;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  Student(int id, String name, String branch, int age) {
    this.id = id;
    this.name = name;
    this.branch = branch;
    this.age = age;
  }

  public int compareTo(Student st) {
    if (id > st.id) {
      return 1;
    } else if (id < st.id) {
      return -1;
    } else {
      return 0;
    }
  }
}

class StudentDemo {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<Student>();
    
    for (int i = 0; i < 3; i++) {
      students.add(new Student(s.nextInt(), s.next(), s.next(), s.nextInt()));
    }
    Collections.sort(students);
    for (Student st : students) {
      System.out.println(st.getId() + " " + st.getName() + " " + st.getBranch() + " " + st.getAge());
    }
  }
}