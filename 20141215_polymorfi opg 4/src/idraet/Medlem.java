package idraet;

public abstract class Medlem {
  protected String navn;
  protected int alder;

  public Medlem(String navn, int alder) {
    this.navn = navn;
    this.alder = alder;
  }
  
  public abstract int kontingent();
  
  public String toString() {
    return "navn=" + navn + ", alder=" + alder;
  }
}
