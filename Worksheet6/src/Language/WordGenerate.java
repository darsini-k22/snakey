package Language;

public class WordGenerate {
    String word;
    int noOfChars;

    public WordGenerate(String word,int noOfChars){
        this.word=word;
        this.noOfChars=noOfChars;
    }

    public String repeatEnd(String word,int n){
        String repeat="";
        for(int i=0;i<n;i++){
            repeat=word.substring(word.length()-n)+repeat;
        }
        return repeat;
    }




}
