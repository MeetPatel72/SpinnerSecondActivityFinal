package temple.edu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;   //creating a spinner object
    String[] myColor = {"White", "Red", "Blue", "Black", "Yellow", "Green", "Gray", "Cyan", "Magenta"};  //creatting array list
    int colorIntValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner)findViewById(R.id.spinner);
        final ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, myColor);

        // specify the layout to use when the list of choices appears
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);

        spinner.setAdapter(myAdapter);

        ColorAdapter ArrayAdapter = new ColorAdapter(this, myColor);
        spinner.setAdapter(ArrayAdapter);




        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String color = parent.getItemAtPosition(position).toString();
                view.setBackgroundColor(Color.parseColor("White"));
                View mainll = findViewById(R.id.first);
                //mainll.setBackgroundColor(Color.parseColor(color));
/*
                if(position == 0){
                    return;
                }else{
                    colorIntValue = Color.parseColor(myColor[position]);
                    //Intent nextIntent = new Intent(MainActivity.this, Main2Activity.class);
                    //nextIntent.putExtra("newColor", colorIntValue);
                    //findViewById(R.id.second).setBackgroundColor(Color.parseColor(color));
                    //onclicks(color);
                    //startActivity(nextIntent);


                }
                */
    final Intent intent;
        switch (position){//at this position change the back color
            case 1:
                intent = new Intent(MainActivity.this, Main2Activity.class);

                View y = findViewById(R.id.second);
                view.setBackgroundColor(Color.parseColor(color));
                startActivity(intent);

                break;
            case 2:
                intent = new Intent(MainActivity.this, Main2Activity.class);
                View x = findViewById(R.id.second);
                view.setBackgroundColor(Color.parseColor(color));

                startActivity(intent);
                break;
            case 3:
                intent = new Intent(MainActivity.this, Main2Activity.class);
                View z = findViewById(R.id.second);
                view.setBackgroundColor(Color.parseColor(color));

                startActivity(intent);
                break;
        }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });




    }
    public void onclicks(String color){
        findViewById(R.id.second).setBackgroundColor(Color.parseColor(color));

    }
}



