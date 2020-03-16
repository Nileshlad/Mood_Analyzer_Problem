public class MoodAnalysisException extends Exception
{
    //CLASS
    enum MoodAnalysisCustomException
    {
        //VALUE
        NULL,EMPTY,NO_SUCH_CLASS_FOUND,NO_SUCH_METHOD,NO_SUCH_FIELD,NULL_VALUE;

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
