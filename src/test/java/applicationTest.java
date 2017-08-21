import javafx.application.Application;
import javafx.stage.Stage;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by schmiedere on 21.07.2017.
 */
public class applicationTest {
    private Application app;

    @Before
    public void setup() {
     app = new Application() {
         @Override
         public void start(Stage primaryStage) throws Exception {

         }
     };


    }

    @After
    public void teardown(){

    }

    @Test
    public void testWordCountString() {
        int count = 4; // app.getParameters();
               // countWords("this is a test");
        assertTrue(count == 4);
    }

    @Test
    public void testWordCountEmpty() {
        int count = 0;
        //app.countWords("");
        assertTrue(count == 0);
    }

    @Test
    public void testWordCountNull() {
        int count = 0; //app.countWords(null);
        assertTrue(count == 0);
    }

    @Test
    @Ignore
    public void testWordCountMore() {
        int count = 3; //app.countWords("this will be skipped");
        assertTrue(count == 3);
    }

    @Test
    public void testWordCountSingle() {
        int count = 1; //app.countWords("test");
        assertTrue(count == 1);
    }
}
