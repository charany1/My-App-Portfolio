package me.yogeshwardan.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

//Todo: Put all hard coded strings from activity_main.xml into res/values/strings.xml .

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View v) {
        String buttonName ;
        switch(v.getId())
        {
            case R.id.first_button:
                buttonName = "Spotify Streamer";
                break;
            case R.id.second_button:
                buttonName = "Scores App";
                break;
            case R.id.third_button:
                buttonName = "Library App";
                break;
            case R.id.fourth_button:
                buttonName = "Build It Bigger";
                break;
            case R.id.fifith_button:
                buttonName = "XYZ Reader";
                break;
            case R.id.sixth_button:
                buttonName = "Capstone";
                break;
            default:
                buttonName = "No";

        }
        Toast.makeText(MainActivity.this, "This button will launch my "+buttonName+" app!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }
}
