package com.comincodeworks.habittracker;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.comincodeworks.habittracker.ui.habit.HabitAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.activity_main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        RecyclerView habitsRecyclerView = findViewById(R.id.habitsRecylclerView);

        List<Habit> habits = new ArrayList<>();

        habits.add(new Habit(1, "Wasser trinken", "water", 0, false));
        habits.add(new Habit(2, "Sport machen", "sport", 0, false));
        habits.add(new Habit(3, "Lesen 10 Seiten", "book", 0, false));

        habitsRecyclerView.setLayoutManager(new LinearLayoutManager((this)));

        HabitAdapter adapter =  new HabitAdapter(habits);

        habitsRecyclerView.setAdapter(adapter);
    }
}