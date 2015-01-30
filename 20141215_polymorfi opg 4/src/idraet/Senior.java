package idraet;

public class Senior extends Medlem {

  public Senior(String navn, int alder) {
    super (navn, alder);
  }
  
  public int kontingent() {
    if (alder < 40 )
      return 400;
    else if (alder < 60)
      return 250;
    else
      return 100;  
  }
  
  public String toString() {
    return "[Senior: " + super.toString() + ", ";
  }
}
