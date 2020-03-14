import java.util.Objects;

public class MoodAnalyserProblem {
    //VARIABLE
    String message;
    String mood;

    //DEFAULT CONSTRUCTORS
    public MoodAnalyserProblem() {
        message="";

    }
    //PARAMETERIZED CONSTRUCTORS
    public MoodAnalyserProblem(String message){
        this.message = message;
    }

    //METHOD AND THROW CUSTOM EXCEPTION
    public String analysisMood(Object o)throws MoodAnalysisException
    {
        try {
            if(message.length() == 0)
            {
                throw new MoodAnalysisException(MoodAnalysisException.MoodAnalysisCustomException.EMPTY,"please proper mood");
            }
            if (message.contains("happy"))
            {
                return  "happy";
            } else {
                return  "sad";
            }
            }
        catch (NullPointerException e)
        {
            throw new MoodAnalysisException(MoodAnalysisException.MoodAnalysisCustomException.NULL,"please enter proper mood");
        }
    }

    //OVERRIDE EQUALS METHOD
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof MoodAnalyserProblem)) return false;
        MoodAnalyserProblem that = (MoodAnalyserProblem) o;
        return Objects.equals(message, that.message) &&
        Objects.equals(mood, that.mood);
    }

    //MAIN METHOD AND THROW CUSTOM EXCEPTION
    public static void main (String args[])throws MoodAnalysisException
    {
        System.out.println("WELCOME MOOD ANALYSER PROBLEM");

    }
}
