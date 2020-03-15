import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserProblemTest<exception extends Throwable>
{

    //TEST CASE 1.1
    @Test
    public void givenMessage_WhenValid_ThenReturnMood() throws MoodAnalysisException
    {
        MoodAnalyserProblem moodAnalyser = new MoodAnalyserProblem("i am happy mood");
        String result = moodAnalyser.analysisMood(null);
        Assert.assertEquals("happy", result);
    }

    //TEST CASE 1.2
    @Test
    public void givenMessage_WhenInvalid_ThenReturnMood() throws MoodAnalysisException
    {
        MoodAnalyserProblem moodAnalyser = new MoodAnalyserProblem("i am sad mood");
        String result = moodAnalyser.analysisMood(null);
        Assert.assertEquals("sad", result);
    }

    //TEST CASE 2.1
    @Test
    public void givenMessage_WhenInvalid_ThenReturnThrowException() throws MoodAnalysisException
    {
        MoodAnalyserProblem moodAnalyser = new MoodAnalyserProblem(null);
        String result = moodAnalyser.analysisMood(null);
        Assert.assertEquals("happy", result);
    }

    //TEST CASE 3.1
    @Test
    public void givenNull_MoodShould_ThrowException()
    {
        MoodAnalyserProblem moodAnalyser = new MoodAnalyserProblem(null);
        try
        {
            moodAnalyser.analysisMood(null);
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.MoodAnalysisCustomException.NULL, e.type);
        }
    }

    //TEST CASE 3.2
    @Test
    public void givenEmpty_MoodShould_ThrowException()
    {
        MoodAnalyserProblem moodAnalyser = new MoodAnalyserProblem("");
        try
        {
            moodAnalyser.analysisMood("");
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.MoodAnalysisCustomException.EMPTY, e.type);
        }
    }

    //TEST CASE 4.1
    @Test
    public void givenMoodAnalyserClassNameDefaultConstructor_WhenProper_ShouldReturnObject()  {
        try
        {
            MoodAnalyserProblem mood = new MoodAnalyserProblem();
            MoodAnalyserProblem analyseMood = MoodAnalyserFactory.createMoodAnalyser();
            boolean resultMood = analyseMood.equals(mood);
            Assert.assertEquals(true, resultMood);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //TEST CASE 4.2
    @Test
    public void givenMoodAnalyserClassName_WhenImproper_ShouldThrowMoodAnalysisException() {
        try {
            MoodAnalyserFactory.getConstructor("oodAnalyzer",String.class);
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.MoodAnalysisCustomException.NO_SUCH_METHOD, e.type);
        }
    }

    //TEST CASE 4.3
    @Test
    public void givenClassNameConstructor_NotProper_ShouldThrowMoodAnalyserException()
    {
        try
        {
            MoodAnalyserFactory.getConstructor("oodMoodAnalyser", String.class);
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.MoodAnalysisCustomException.NO_SUCH_METHOD, e.type);
        }
    }

    //TEST CASE 5.1
    @Test
    public void givenMoodAnalyserClassNameParameterizedConstructor_WhenProper_ShouldReturnObject()  {
        try
        {
            MoodAnalyserProblem mood = new MoodAnalyserProblem("happy");
            MoodAnalyserProblem analyseMood = MoodAnalyserFactory.createMoodAnalyser("happy");
            boolean resultMood = analyseMood.equals(mood);
            Assert.assertEquals(true, resultMood);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //TEST CASE 5.2
    @Test
    public void givenMoodAnalyserClassNameWithParameter_WhenImproper_ShouldThrowMoodAnalysisException() {
        try
        {
            MoodAnalyserFactory.getConstructor("oodAnalyzer",String.class);
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.MoodAnalysisCustomException.NO_SUCH_METHOD, e.type);
        }
    }
}