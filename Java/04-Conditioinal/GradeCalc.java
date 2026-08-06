import java.util.*;
class GradeCalc{
    public static void main(String[] arsg){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur score:");
        int score=sc.nextInt();
        if(score<=100 && score>90)
            System.out.println("grade is O");
        else if(score<=90 && score>80)
            System.out.println("grade is E");
        else if(score<=80 && score>70)
            System.out.println("grade is A");
        else if(score<=70 && score >60)
            System.out.println("garde is B");
        else if(score<=60 && score>50)
            System.out.println("grade is C");
        else if(score<=50 && score>=0)
            System.out.println("u r failed,grade is 'F'");
        else
            System.out.println("invalid score");
        }
    }
