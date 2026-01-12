public class Re {

    public static void main(String[] args) {
     String re ="#\\w\\s";
     String text="AA";
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
