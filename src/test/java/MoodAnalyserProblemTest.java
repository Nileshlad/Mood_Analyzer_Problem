import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserProblemTest {

    //TEST CASE 1.1
    @Test
    public void givenMessage_WhenValid_ThenReturnMood() throws MoodAnalysisException {
        MoodAnalyserProblem moodAnalyser = new MoodAnalyserProblem("i am happy mood");
        String result = moodAnalyser.analysisMood(null);
        Assert.assertEquals("happy", result);
    }

    //TEST CASE 1.2
    @Test
    public void givenMessage_WhenInvalid_ThenReturnMood() throws MoodAnalysisException {
        MoodAnalyserProblem moodAnalyser = new MoodAnalyserProblem("i am sad mood");
        String result = moodAnalyser.analysisMood(null);
        Assert.assertEquals("sad", result);
    }

    //TEST CASE 2.1
    @Test
    public void givenMessage_WhenInvalid_ThenReturnThrowException() throws MoodAnalysisException {
        MoodAnalyserProblem moodAnalyser = new MoodAnalyserProblem(null);
        String result = moodAnalyser.analysisMood(null);
        Assert.assertEquals("happy", result);
    }

    //TEST CASE 3.1
    @Test
    public void givenNull_MoodShould_ThrowException() {
        MoodAnalyserProblem moodAnalyser = new MoodAnalyserProblem(null);

        try {
            moodAnalyser.analysisMood(null);
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.MoodAnalysisCustomException.NULL, e.type);
        }
    }

    //TEST CASE 3.2
    @Test
    public void givenEmpty_MoodShould_ThrowException() {
        MoodAnalyserProblem moodAnalyser = new MoodAnalyserProblem("");

        try {

            
            moodAnalyser.analysisMood("");
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.MoodAnalysisCustomException.EMPTY, e.type);
        }
    }

    //TEST CASE 4.1
    @Test
    public void givenMoodAnalyser_DefeatConstructors_ReturnObject() {
        MoodAnalyserProblem moodAnalyser = new MoodAnalyserProblem();
        MoodAnalyserProblem moodAnalyserProblem = new MoodAnalyserProblem();
        boolean result = moodAnalyserProblem.equals(moodAnalyser);
        Assert.assertEquals(true, result);
    }

   }