import java.util.regex.*;    
import java.util.*;    
public class EmailVerification{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();        
        for(int i=0;i<10;i++){
        Scanner sc=new Scanner(System.in);
        String newemail=sc.nextLine();
        emails.add(newemail);}
        //Regular Expression   
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
        //Iterate emails array list  
        for(String email : emails){  
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}  