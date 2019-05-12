package cgpamadeeasy;
public class PointRanking {

    String grade;
    int courseGrade;
    public int Ranking(){
    
     
     if (grade.equals("A")){
        courseGrade = 5;
        return courseGrade;
     }
     else if (grade.equals("B")){
         courseGrade = 4;
          return courseGrade;
     }
     else if (grade.equals("C")){
         courseGrade = 3;
          return courseGrade;
     }
     else if (grade.equals("D")){
         courseGrade = 2;
          return courseGrade;
     }
     else if (grade.equals("E")){
         courseGrade = 1;
          return courseGrade;
     }
     else if (grade.equals("F")){
         courseGrade = 0;
          return courseGrade;
     }
     else {
         System.out.println("Please input a valid grade");
     }
return 0;
       /*switch (grade){
           case "A": return 5;
           break;
           case "B" : return 4;
           break;
           case "C" : return 3;
           break;
           case "D" : return 2;
           break;
           case "E" : return 1;
           break;
           case "F" : return 0;
           break;
           default: System.out.println ("A SYNTAX ERROR HAS OCCURED");
               break;*/
       
       
       
       
               
    }
}

