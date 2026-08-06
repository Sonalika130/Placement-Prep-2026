import java.util.*;//after clicking zero it tottaly shuts down but with 1 multiple students data can be collected.
class MenuDrivMarks{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;

        do{
            System.out.println("enter choice(0 or 1):");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter marks(0 to 100)");

                    int m=sc.nextInt();
                    if(m>=90&&m<=100)
                        System.out.println("this is good");
                    else if(m>=60&&m<90)
                        System.out.println("this is also good");
                    else if(m<=59&&m>=0){
                        System.out.println("this is good as well");
                        System.out.println("coz marks don't matter but our effort does!!");}
                    else
                        System.out.println("enter marks properly!!");
                break;
                case 0:
                    System.out.println("exiting,goodbye");
                    break;
                default:
                    System.out.println("invalid choice try once agin");



             }

        }while(choice!=0);

    }
}