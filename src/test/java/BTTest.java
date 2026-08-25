import com.inflectra.spiratest.addons.junitextension.SpiraTestConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import com.inflectra.spiratest.addons.junitextension.SpiraTestCase;
import com.inflectra.spiratest.addons.junitextension.SpiraTestConfiguration;
@SpiraTestConfiguration(
        url="https://rmit.spiraservice.net/",
        login="S4140405",
        rssToken="{D385FF15-397F-43DB-92BC-8F5F7319E251}",
        projectId=1041,
        releaseId=7,
        testSetId=1
)
class BTTest {


    BT bt;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();


    @BeforeEach
    public void setup() {
        this.bt = new BT();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void isEmpty(){

    }

    @Test
    public void search() {
    }

    @Test
    public void countOneNodeTreeTest() {
    }

    @Test
    public void countMultiNodesTreeTest() {
    }

    @Test
    void inorderEmptyTree() {
    }

}