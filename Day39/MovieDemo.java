import java.util.*;
class Movie implements Comparable<Movie>{
  private String title;
  private String director;
  public String getTitle() {
	return title;
}
  public int compareTo(Movie mo){
    if(release_year>mo.release_year){
      return -1;
    }else if(release_year<mo.release_year){
      return 1;
    }else{
      return 0;
    }
  }
public void setTitle(String title) {
	this.title = title;
}
public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}
public int getRelease_year() {
	return release_year;
}
public void setRelease_year(int release_year) {
	this.release_year = release_year;
}
private int release_year;
  Movie(String title,String director,int release_year){
    this.title=title;
    this.director=director;
    this.release_year=release_year;
  }
  
}
class MovieDemo{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    ArrayList<Movie> movie=new ArrayList<Movie>();
    
    for(int i=0;i<3;i++){
      movie.add(new Movie(s.next(),s.next(),s.nextInt()));
    }
    Collections.sort(movie);
    for(Movie mo:movie){
      System.out.println(mo.getTitle()+" "+mo.getDirector()+" "+mo.getRelease_year());
    }
  }
}