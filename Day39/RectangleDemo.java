/*Write a Java class called Rectangle that has fields for the rectangle's width and height. Write a custom Comparator implementation called AreaComparator that sorts Rectangle objects in ascending order based on their area (i.e., width x height). Then, modify the Rectangle class to implement the Comparable interface, so that Rectangle objects are sorted in ascending order based on their perimeter (i.e., 2 x width + 2 x height). Test your implementation by creating a list of Rectangle objects and sorting them using both the AreaComparator and the Comparable implementation.*/
import java.util.*;
class Rectangle implements Comparable<Rectangle>{
  private double width;
  private double height;
  Rectangle(double width,double height){
    this.width=width;
    this.height=height;
  }
    double getArea(){
    return width*height;
  }
  double getPerimeter(){
    return 2*(width+height);
  }
  public int compareTo(Rectangle r1){
    if(r1.getPerimeter()>r1.getPerimeter()){
      return 1;
    }
    else if(r1.getPerimeter()<r1.getPerimeter()){
      return -1;
    }
    else{
      return 0;
    }
  }
}
class AreaComparator implements Comparator<Rectangle>{
  public int compare(Rectangle r1,Rectangle r2){
    if(r1.getArea()>r2.getArea()){
      return 1;
    }
    else if(r1.getArea()<r2.getArea()){
      return -1;
    }else{
      return 0;
    }
  }
}
 
 

class RectangleDemo{
  public static void main(String args[]){
    ArrayList<Rectangle> rect=new ArrayList<Rectangle>();
    Scanner s=new Scanner(System.in);
    for(int i=0;i<3;i++){
      rect.add(new Rectangle(s.nextInt(),s.nextInt()));
    }
    Collections.sort(rect,new AreaComparator());
    System.out.println("Sorted in area");
    for(Rectangle r:rect){
      System.out.println(r.getArea());
    }
     Collections.sort(rect,new AreaComparator());
    System.out.println("Sorted in perimeter");
    for(Rectangle r:rect){
      System.out.println(r.getPerimeter());
    }
  }
}