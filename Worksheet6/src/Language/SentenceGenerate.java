package Language;

import java.util.Locale;
import java.util.Random;


public class SentenceGenerate {
    String[] article;
    String[] preposition;
    String[] noun;
    String[] verb;




    public SentenceGenerate(String[] noun, String[] verb) {


        this.article = new String[]{"the", "a", "one", "some", "any"};
        this.preposition = new String[]{"to", "from", "over", "under", "on"};
        this.noun = noun;
        this.verb = verb;
    }

    public String getSentence(int noOfSentences) {
//        Random rand = new Random();
//        int randomNo = rand.nextInt(5);
        String[] randomSentences=new String[100];
        int max = 10;
        int min = 1;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;

//        for(int i=0;i<noOfSentences;i++){
//            randomSentences[i]=article[rand].substring(0, 1).toUpperCase() + article[rand].substring(1) + " " + noun[rand] + " " + verb[rand] + " " + preposition[rand] + " " + article[rand] + " " + noun[rand] + ".";
//        }
         return (article[rand].substring(0, 1).toUpperCase() + article[rand].substring(1) + " " + noun[rand] + " " + verb[rand] + " " + preposition[rand] + " " + article[rand] + " " + noun[rand] + ".");}

}
