package com.app.simpsonfading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean bartIsShowing=true;
    public void clickMe(View view) {
        Log.i("Click","Image Is Clicked");
        ImageView bart=(ImageView)findViewById(R.id.imageView1);
        ImageView  homer=(ImageView)findViewById(R.id.imageView2);
if(bartIsShowing) {
    bartIsShowing=false;
    bart.animate().alpha(0).setDuration(2000);
    bart.animate().alpha(1).setDuration(2000);
}else{
    bartIsShowing=true;
    bart.animate().alpha(1).setDuration(2000);
    bart.animate().alpha(0).setDuration(2000);
}
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


}
