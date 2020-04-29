package com.example.petagecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void calculateButtonPressed(View buttonView){
        EditText petBornTextField=findViewById(R.id.edtPetBorn);
        int petAge= Calendar.getInstance().get(Calendar.YEAR)-Integer.parseInt(petBornTextField.getText().toString()); //Calender class is used and we ge instance
        //calender.Year is passed bcz we want current year
        //parse int accepts an argument of type string
                TextView petAgeTextView=findViewById(R.id.txtPetYearOld);
                petAgeTextView.setText(petAge + "");
    }
}
