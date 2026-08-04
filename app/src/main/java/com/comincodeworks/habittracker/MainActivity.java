package com.comincodeworks.habittracker;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        CheckBox check1 = findViewById(R.id.check1);
        CheckBox check2 = findViewById(R.id.check2);
        CheckBox check3 = findViewById(R.id.check3);

        check1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Habit 1 erledigt! 🎉", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Habit 1 wieder abgehakt", Toast.LENGTH_SHORT).show();
            }
        });

        check2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Habit 2 erledigt! 🎉", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Habit 2 wieder abgehakt", Toast.LENGTH_SHORT).show();
            }
        });

        check3.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Habit 3 erledigt! 🎉", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Habit 3 wieder abgehakt", Toast.LENGTH_SHORT).show();
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}