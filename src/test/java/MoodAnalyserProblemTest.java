import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserProblemTest {

    //OBJECT
    MoodAnalyserProblem moodAnalyser = new MoodAnalyserProblem();

    //TEST CASE 1
    @Test
    public void givenMessage_WhenValid_ThenReturnMood() {
       String result = moodAnalyser.analysisMood("i am happy mood");
        Assert.assertEquals("happy",result);
    }

    //TEST CASE 2
    @Test
    public void givenMessage_WhenInvalid_ThenReturenMood() {
        String result = moodAnalyser.analysisMood("i am sad mood");
        Assert.assertEquals("sad",result);

    }
}
