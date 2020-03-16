import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyserFactory
{
    //DEFAULT CONSTRUCTOR
    public static MoodAnalyserProblem createMoodAnalyser() {
        try {
            Constructor<?> moodConstructor = Class.forName("MoodAnalyzer").getConstructor();
            //CONSTRUCTOR CLASS IS USED TO CREATE A NEW INSTANCE OF CLASS
            Object instance = moodConstructor.newInstance();
            return (MoodAnalyserProblem) instance;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //TO CHECK NO CLASS AND NO METHOD
    public static Object getConstructor(String ClassName, Class<?> ... argument) throws MoodAnalysisException
    {
        try
        {
            Class<?> moodAnalyserClass = Class.forName(ClassName);
            Constructor<?> moodConstructor = moodAnalyserClass.getConstructor(argument);
            return moodConstructor.newInstance(argument);

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


    //PARAMETERIZED CONSTRUCTOR
    public static MoodAnalyserProblem createMoodAnalyser(String i_am_in_happy_mood) {
        try {
            Constructor<?> moodConstructor = Class.forName("MoodAnalyzer").getConstructor(String.class);
            //CONSTRUCTOR CLASS IS USED TO CREATE A NEW INSTANCE OF CLASS
            Object instance = moodConstructor.newInstance(i_am_in_happy_mood);
            return (MoodAnalyserProblem) instance;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //INVOKE METHOD AND RETURN OUTPUT
    public static String invokeMoodAnalyser(MoodAnalyserProblem mood,String methodName) throws MoodAnalysisException {
        try {
            return (String) mood.getClass().getMethod(methodName).invoke(mood);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //SET METHOD THAT SET MOOD
    public static String setFieldMoodAnalyser(MoodAnalyserProblem mood,String fieldName,String fieldValue) throws MoodAnalysisException {
        try {
            if (fieldValue == null)
                throw new MoodAnalysisException(MoodAnalysisException.MoodAnalysisCustomException.NULL_VALUE, "Field value is Null");
            Field field = mood.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(mood,fieldValue);
        }catch (NoSuchFieldException e) {
            throw new MoodAnalysisException(MoodAnalysisException.MoodAnalysisCustomException.NO_SUCH_FIELD, "No such field found");
        }catch (MoodAnalysisException e) {
            throw new MoodAnalysisException(MoodAnalysisException.MoodAnalysisCustomException.NULL_VALUE, "No such field found");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}