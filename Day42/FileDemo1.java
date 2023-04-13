/*import java.io.FileOutputStream;
import java.io.FileReader;
class FileDemo1{
  public static void main(String args[]){
    try{
      FileReader fr=new FileReader("abc.txt");
      int i;
      while((i=fr.read())!=-1){
        System.out.print((char)i);
      }
    }
    catch(Exception e){
      System.out.println(e);
    }
    // try{
    //   FileOutputStream fw=new FileOutputStream("xyz.txt");
    //   String str="hi hello how are you";
    //   byte bytes[]=str.getBytes();
      
    //   fw.write(bytes);
    //   fw.close();
    // }
    // catch(Exception e){
    //   System.out.println(e);
    // }
    
  }
}*/
import java.io.FileWriter;
class File{
  public static void main(String args[]){
    try{
      FileWriter fw=new FileWriter("err.txt");
      fw.write("Greetings everyone!!!");
      fw.close();
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
