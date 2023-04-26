package ie.tudublin;

import java.util.ArrayList;

public class WordClass {

    String word = "Test String";

    ArrayList<FollowClass> follows = new ArrayList<FollowClass>();

    public WordClass(String word) {
        this.word = word;
    }

    public String toString() {
        String poem = "Test String";
        
        for(FollowClass f : follows)
        {
            poem += f.toString();
        }
        return poem;
    }

    public String getWord() {
        return word;
    }
    public ArrayList<FollowClass> getFollows() {
        return follows;
    }



    public void setFollows(ArrayList<FollowClass> follows) {
        this.follows = follows;
    }
    public void setWord(String word) {
        this.word = word;
    }

}