import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyserFactory {

        public static MoodAnalyserProblem CreateMoodAnalyser() {
        try {
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
    public static Object getConstructor(String ClassName, Class param, String reaction) throws MoodAnalysisException {

        try {
            Class<?> moodAnalyserClass = Class.forName(ClassName);
            Constructor<?> moodConstructor = moodAnalyserClass.getConstructor(param);
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
}
