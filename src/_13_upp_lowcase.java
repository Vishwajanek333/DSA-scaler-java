
import java.util.*;
public class _13_upp_lowcase {
    public static void main(String [] args){
        String st ="wEloMEtoScAleR";
        UpperCastoLowerCase(st);
    }
    public static  void  UpperCastoLowerCase(String st){
        char[] s=st.toCharArray();

        for(int i =0;i<s.length;i++){
            char ch =s[i];

        if(ch>='A'&& ch <='Z'){
            char asch =(char)(ch - 'A'+'a');
            s[i]= asch;

        }
        }
        for(char c :s){
            System.out.print(c);
        }


    }

}
