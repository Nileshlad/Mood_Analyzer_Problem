import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserProblemTest {

    @Test
    public void givenMessage_WhenValid_ThenReturnMood() {
        MoodAnalyserProblem moodAnalyser = new MoodAnalyserProblem("i am happy mood");
        String result = moodAnalyser.analysisMood();
        Assert.assertEquals("happy", result);
    }

    @Test
    public void givenMessage_WhenInvalid_ThenReturnMood() {
        MoodAnalyserProblem moodAnalyser = new MoodAnalyserProblem("i am sad mood");
        String result = moodAnalyser.analysisMood();
        Assert.assertEquals("sad", result);
    }
}