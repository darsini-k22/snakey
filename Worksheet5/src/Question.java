abstract class Question {
   private String myText;
   Question(String myText){
       this.myText=myText;
   }

   public String getText(){
       return myText;
   }

   abstract String getQuestion();
   abstract String getAnswer();
   abstract boolean checkAnswer(String answer);


}

class ShortAnswerQuestion extends Question{

    String myAnswer;

    ShortAnswerQuestion(String text) {
        super(text);
    }


    @Override
    String getQuestion() {
        return super.getText();

    }

    @Override
    String getAnswer() {
        return myAnswer;
    }

    @Override
    boolean checkAnswer(String answer) {
        if(getAnswer().equalsIgnoreCase(answer)){
            return true;
        }
        return false;
    }
}

class FillInBlankQuestion extends Question{

    private String myAnswer;
    FillInBlankQuestion(String myText,String myAnswer) {
        super(myText);
        this.myAnswer=myAnswer;
    }

    @Override
    String getQuestion() {
        return super.getText()+"\nFill in the blank.";

    }

    @Override
    String getAnswer() {
        return myAnswer;
    }

    @Override
    boolean checkAnswer(String answer) {
        if(getAnswer().equalsIgnoreCase(answer)){
            return true;
        }
        return false;
    }
}

class TrueFalseQuestion extends Question{
    boolean myAnswer;


    TrueFalseQuestion(String myText,boolean myAnswer) {
        super(myText);
        this.myAnswer=myAnswer;
    }

    @Override
    String getQuestion() {
        return super.getText()+"\nIs this statement true or false?";
    }

    @Override
    String getAnswer() {
        return String.valueOf(myAnswer);
    }

    @Override
    boolean checkAnswer(String answer) {
        if(getAnswer().equalsIgnoreCase(answer)){
            return true;
        }
        return false;
    }
}
