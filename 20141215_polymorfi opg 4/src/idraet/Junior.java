package idraet;

public class Junior extends Medlem {
  private String navnFor�ldre;
  private int telefonFor�ldre;

  public Junior(String navn, int alder, String navnFor�ldre, int telefonFor�ldre) {
    super (navn, alder);
    this.navnFor�ldre = navnFor�ldre;
    this.telefonFor�ldre = telefonFor�ldre;
  }
  
  public int kontingent() {
    if (alder < 15)
      return 150;
    else
      return 250;
  }
  
  public String toString() {
    return "[Junior: " + super.toString() + ", for�ldrenavn=" + navnFor�ldre + ", for�ldretelefon=" + telefonFor�ldre +", ";
  }
}
