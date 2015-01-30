package test;

import idraet.*;

public class Main {

  public static void main( String[] args ) {
    Senior s;
    Junior j;
    
    s = new Senior("Erling", 75);
    System.out.println(s + "kontingent=" + s.kontingent() + "]");
    
    j = new Junior("Hans", 9, "Valdemar", 97001100);
    System.out.println(j + "kontingent=" + j.kontingent() + "]");
    
    j = new Junior("Peter", 16, "Vera", 97224422  );
    System.out.println(j + "kontingent=" + j.kontingent() + "]");
  }
}