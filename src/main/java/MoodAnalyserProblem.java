public class MoodAnalyserProblem {
    //VARIABLE
    String message;
    String mood;

    //METHOD
    public String analysisMood(String message)
    {
        if(message.equals("i am happy mood"))
        {
            mood = "happy";
        }else if(message.equals("i am sad mood")){
            mood= "sad";
        }
        return mood;
    }
    public static void main (String args[]){
        System.out.println("WELCOME MOOD ANALYSER PROBLEM");

    }


}
