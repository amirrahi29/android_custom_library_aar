package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.mycustomlibrary.MyCustomProject;

public class MainActivity extends AppCompatActivity {

    MyCustomProject myCustomProject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myCustomProject = new MyCustomProject();
    }

    public void launchShareScreen(View view) {
        myCustomProject.shareText("Helo friends chai pee lo", MainActivity.this);
    }

    public void addNumber(View view) {
        Log.e("added value: ", String.valueOf(myCustomProject.addTwoNumbers(3, 9)));
    }

    public void minusClick(View view) {
        Log.e("minus value: ", String.valueOf(myCustomProject.minusTwoNumbers(20, 9)));
    }

    public void multipleNumber(View view) {
        Log.e("multiplied value: ", String.valueOf(myCustomProject.multiplyTwoNumbers(5, 5)));
    }

    public void divideNumber(View view) {
        Log.e("divided value: ", String.valueOf(myCustomProject.divideTwoNumbers(30, 5)));
    }
}