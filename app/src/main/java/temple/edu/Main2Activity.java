package temple.edu;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.RelativeLayout;



public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
       int nextColor = i.getIntExtra("newColor", -1);
       findViewById(R.id.second).setBackgroundColor(nextColor); //set the background to the color that users picks


    }
}
