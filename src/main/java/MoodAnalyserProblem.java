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

    //METHOD AND EXCEPTION
    public String analysisMood()
    {
        try {
            if (message.contains("happy")) {
                return  "happy";
            } else {
                return  "sad";
            }
            }
        catch (NullPointerException e) {
                return "happy";
        }
    }
    //MAIN METHOD
    public static void main (String args[]){
        System.out.println("WELCOME MOOD ANALYSER PROBLEM");

    }
}
