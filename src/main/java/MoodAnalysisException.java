public class MoodAnalysisException extends Exception
{
    //CLASS
    enum MoodAnalysisCustomException
    {
        //VALUE
        NULL,EMPTY,NO_SUCH_METHOD;


    }
    MoodAnalysisCustomException type;

    //CONSTRUCTOR
    public MoodAnalysisException(MoodAnalysisCustomException type,String message)
    {
        super(message);
        this.type = type;
        System.out.println(message);
    }
}
