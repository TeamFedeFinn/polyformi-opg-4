package idraet;

public class Junior extends Medlem {
  private String navnForældre;
  private int telefonForældre;

  public Junior(String navn, int alder, String navnForældre, int telefonForældre) {
    super (navn, alder);
    this.navnForældre = navnForældre;
    this.telefonForældre = telefonForældre;
  }
  
  public int kontingent() {
    if (alder < 15)
      return 150;
    else
      return 250;
  }
  
  public String toString() {
    return "[Junior: " + super.toString() + ", forældrenavn=" + navnForældre + ", forældretelefon=" + telefonForældre +", ";
  }
}
