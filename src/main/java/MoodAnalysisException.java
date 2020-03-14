public class MoodAnalysisException extends Exception {
    //CLASS
    enum MoodAnalysisCustomException{
        //VALUE
        NULL,EMPTY;

    }
    MoodAnalysisCustomException type;

    //CONSTRUCTOR
    public MoodAnalysisException(MoodAnalysisCustomException type,String message) {
        super(message);
        this.type = type;
    }
}
