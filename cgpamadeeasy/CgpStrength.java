package cgpamadeeasy;

public class CgpStrength {
    double CGP;
  public void calculateCgp (){
  
      if (CGP<=1.5){
          System.out.println("You are in CERTIFICATE OEF ATTENDANCE");
      }
      else if (CGP<=2.5){
          System.out.println ("You are in THIRD CLASS");
      }
      else if (CGP<=3.5){
        System.out.println ("You are in SECOND CLASS LOWER");
      }
      else if (CGP<=4.5){
         System.out.println ("You are in SECOND CLASS UPPER"); 
      }
      else if (CGP <=5.0){
          System.out.println ("You are in FIRST CLASS");
      }
          else if (CGP>5.0){
                  System.out.println ("Please kindly recheck your result and input the right grade and credit laod");
      }          

  }
}