package ie.tudublin;

import java.util.ArrayList;

public class WordClass {

    String word = "Test String";


    public WordClass(String word) {
        this.word = word;
    }

    public String toString() {
        String poem = "Test String";

        for(FollowClass f : Follow)
        {
            poem += f.toString();
        }
        
        return poem;
    }



    public String getWord() {
        return word;
    }
    public ArrayList<FollowClass> getFollows() {
        return Follow;
    }



    public void setFollows(ArrayList<FollowClass> Follow) {
        this.Follow = Follow;
    }
    public void setWord(String word) {
        this.word = word;
    }

}