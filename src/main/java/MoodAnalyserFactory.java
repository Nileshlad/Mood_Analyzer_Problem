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



}