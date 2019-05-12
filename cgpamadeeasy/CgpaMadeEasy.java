package cgpamadeeasy;
import java.util.*;
public class CgpaMadeEasy {

    private static int courses;

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
  int i,j,t,totalLoad;
  i=1;
  j=0;
  t=1;
  int total = 0;
     totalLoad=0;     
  System.out.println ("INPUT STUDENT NAME");
  String Sname = input.nextLine();
   System.out.println ("INPUT MATRIC NUMBER");
   String MNo = input.nextLine();
   System.out.println ("INPUT DEPARTMENT");
   String Dept = input.nextLine ();
   System.out.println ("INPUT CURRENT ACADEMIC YEAR");
  int  year = input.nextInt();
  
  PointRanking jo = new PointRanking();
  
    while (i < year)  {
     
        System.out.println ("WELCOME TO YEAR" + year);
        System.out.println ("              ");
        System.out.println ("KINDLY INPUT THE NUMBER OF COURSES OFFERED THIS SESSION");
        int courses= input.nextInt(); 
            
    
    while (t <= courses) {
        System.out.println ("PLEASE INPUT THE CREDIT LOAD PER COURSE");
        int load = input.nextInt();
                /*Arrays will later be used here*/
        System.out.println (" INPUT THE GRADE PER COURSE");
        String grade = input.next();
        
        
        
        jo.grade=grade;
        
         int newGrade ;
// Integer.parseInt(grade);
         //CALLED CLASS IN LN 25
                newGrade = jo.Ranking();
        //int [][] TwoDim = newInt [][10];
        
         /*A CLASS SHOULD BE CREATED HERE TO CONVERT THE GRADES TO AN INTEGER VALUE*/
    int sum;
    
        sum = newGrade*load;
       
        total =total + sum;
        t++;
        i++;
       totalLoad=totalLoad+load;
       // int sumLoad = 0;
               // sumLoad= sumLoad + load;
            
             
             
    }
    i=i++;
    }
        System.out.println ("DEAR " +Sname+ " WITH MATRICULATION NUMBER OF " + MNo +" in the department of " +  Dept +" haven spent " + year+ " years ");
        
        double CGP;
      
       
        CGP = total /totalLoad;
        System.out.println("YOUR CGP IS " + CGP);
        System.out.println ("");
        System.out.println ("");
        CgpStrength CG = new CgpStrength();
      CG.CGP=CGP;
     CG.calculateCgp();
        System.out.println ("");
        System.out.println ("");
         //A class is being refered to here
      
             
        
       /*CODED BY UZOR JOSHUA CHISOM AND DECODED BY ARCHIBONG CHARLES BASSEY. PLEASE AVOID PLAGIARISM*/        
           
    
    }
    }  

