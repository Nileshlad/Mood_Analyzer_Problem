import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyserFactory
{

    //DEFAULT CONSTRUCTOR
    public static MoodAnalyserProblem CreateMoodAnalyser()
    {
        try
        {
            Class<?> moodAnalyser = Class.forName("MoodAnalyser");
            Constructor<?> moodConstructor = moodAnalyser.getConstructor();
            Object Instance = moodConstructor.newInstance();
            return (MoodAnalyserProblem) Instance;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    //TO CHECK NO CLASS AND NO METHOD
    public static Object getConstructor(String ClassName, Class argument, String reaction) throws MoodAnalysisException
    {
        try
        {
            Class<?> moodAnalyserClass = Class.forName(ClassName);
            Constructor<?> moodConstructor = moodAnalyserClass.getConstructor(argument);
            return moodConstructor.newInstance(reaction);

        } catch (ClassNotFoundException e) {
            throw new MoodAnalysisException(MoodAnalysisException.MoodAnalysisCustomException.NO_SUCH_METHOD,e.getMessage());
        } catch (NoSuchMethodException e) {
            throw new MoodAnalysisException(MoodAnalysisException.MoodAnalysisCustomException.NO_SUCH_METHOD,e.getMessage());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    //PARAMETERIZED CONSTRUCTORS
    public static void CreateMoodAnalyser(String mood)
    {
        try
        {
        Constructor<?>moodContractor = Class.forName("MoodAnalyser").getConstructor(String.class);
        Object Instance = moodContractor.newInstance(mood);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
