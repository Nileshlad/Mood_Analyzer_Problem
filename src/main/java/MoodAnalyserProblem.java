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
            if (message.contains("sad"))
            {
                return  "sad";
            } else if (message.contains("happy"))
            {
                return  null;
            }
        }
        catch (NullPointerException e)
        {
            throw new MoodAnalysisException(MoodAnalysisException.MoodAnalysisCustomException.NULL,"please enter proper mood");
        }
        return null;
    }

    //OVERRIDE EQUALS METHOD
    @Override
    public boolean equals(Object secondObject) {
        if (this == secondObject) return true;
        if (secondObject == null || getClass() != secondObject.getClass()) return false;
        MoodAnalyserProblem that = (MoodAnalyserProblem) secondObject;
        return Objects.equals(message, that.message);
    }

    //MAIN METHOD AND THROW CUSTOM EXCEPTION
    public static void main (String args[])throws MoodAnalysisException
    {
        System.out.println("WELCOME MOOD ANALYSER PROBLEM");

    }
}