package test.app;


import com.app.oop.Main;
import org.junit.jupiter.api.Test;


public class MainTest {

    @Test
    void mainTest(){
        Main.main(null);
    }

    //
    @Test
    void callAppTest(){
        Main m = new Main();
        String r = m.callApp();
        System.out.println("r:" + r);


    }

}
