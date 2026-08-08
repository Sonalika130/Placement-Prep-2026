//once string created in memory can not be used 
//like anything updated must be stored in another variable
//like even after modification no change in og string
public class Immutable {
    public static void main(String[] args){
        String st="sona is a good girl";
        st.toUpperCase();//tried to change into uppercase
        System.out.println(st);//no change in string
    }

    
}
