
import java.util.*;
public class PrintMessage {
    public static void printMsg(String msg){//definition,parameter
        System.out.println(msg);
        return;//goes back to caller (coz of void not necessary)
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        printMsg(st);//calling,argument
    }
    
}
