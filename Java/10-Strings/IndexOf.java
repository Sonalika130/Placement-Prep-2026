//return index of particular variable
//return first occurence of character
//also first occurence of string
public class IndexOf {
    public static void main(String[] args){
        //declaration of string like array or like class obj
        String st=new String("hello hi hello");
        String s="hi";
        String ss="hello";
        String str="hellohibadcoolbadcoolhello";
        String stt="bad";
        String s1="hello";
        System.out.println(st.indexOf(s));
                System.out.println(st.indexOf(ss));
        System.out.println(str.indexOf(stt));//present at 7 and 14 but 1st occurence

                System.out.println(str.indexOf(s1));



        System.out.println(st.indexOf('h'));
        System.out.println(st.indexOf('l'));
    }

    
}
