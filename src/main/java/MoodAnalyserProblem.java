public class MoodAnalyserProblem {
    //VARIABLE
    String message;
    String mood;

    //DEFAULT CONSTRUCTORS
    public MoodAnalyserProblem() {
        message="";

    }
    //PARAMETER CONSTRUCTORS
    public MoodAnalyserProblem(String message) {
        this.message = message;
    }

    //METHOD
    public String analysisMood()
    {
        if(message.contains("happy"))
        {
            mood = "happy";
        }else if(message.contains("sad")){
            mood= "sad";
        }
        return mood;
    }
    public static void main (String args[]){
        System.out.println("WELCOME MOOD ANALYSER PROBLEM");

    }
}
