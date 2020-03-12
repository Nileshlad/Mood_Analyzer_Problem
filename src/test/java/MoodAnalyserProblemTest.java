import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserProblemTest {

    //TEST CASE-1.1
    @Test
    public void givenMessage_WhenValid_ThenReturnMood() {
        MoodAnalyserProblem moodAnalyser = new MoodAnalyserProblem("i am happy mood");
        String result = moodAnalyser.analysisMood();
        Assert.assertEquals("happy", result);
    }

    //TEST CASE-1.2
    @Test
    public void givenMessage_WhenInvalid_ThenReturnMood() {
        MoodAnalyserProblem moodAnalyser = new MoodAnalyserProblem("i am sad mood");
        String result = moodAnalyser.analysisMood();
        Assert.assertEquals("sad", result);
    }

    //TEST CASE -2.1
    @Test
    public void givenMessage_WhenInvalid_ThenReturnThrowException() {
        MoodAnalyserProblem moodAnalyser = new MoodAnalyserProblem(null);
        String result = moodAnalyser.analysisMood();
        Assert.assertEquals("happy", result);
    }
}