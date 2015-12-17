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
        String[] appList = getResources().getStringArray(R.array.app_names) ;
        String buttonName;
        switch(v.getId())
        {
            case R.id.first_button:
                buttonName = appList[0];
                break;
            case R.id.second_button:
                buttonName = appList[1];
                break;
            case R.id.third_button:
                buttonName = appList[2];
                break;
            case R.id.fourth_button:
                buttonName = appList[3];
                break;
            case R.id.fifith_button:
                buttonName = appList[4];
                break;
            case R.id.sixth_button:
                buttonName = appList[5];
                break;
            default:
                buttonName = "None";

        }
        Toast.makeText(MainActivity.this, "This button will launch my "+buttonName+" app!", Toast.LENGTH_SHORT).show();
    }



}
