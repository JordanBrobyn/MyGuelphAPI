package my.guelph.api;



import android.annotation.TargetApi;

import android.app.Activity;
import android.os.Bundle;

public class MainTest extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //Create guelph object to control primary API functions
        MyGuelph Guelph = new MyGuelph("jordan","e77e58cf77e78e718f5dc2eb2cc177c4ef708fd1");
        
        //Performs a full test of basic features. Messages are displayed in LogCat
        //Individual tests can be performed, see function list
        
        Test_Cases test = new Test_Cases();
        test.runFullTest(Guelph);   
        
    }
}