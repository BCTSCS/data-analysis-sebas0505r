import java.util.*;
public class Re {

    public static void main(String[] args) {
     String re ="\\d{3}-\\d{2}-\\d{4}";
     String text="616-33-4565";
     boolean r=text.matches(re);
     //read post.txt
     //step 1 file operator obj
     Arraylist<String> posts = FileOperator.getStringList("posts.txt");
     System.out.println(posts);
     //iterate each post and find #/w
     for(String post:posts}{
        String result=post.match();
     })
     boolean result = text.matches(re);
     System.out.println(result);  
    }
}
