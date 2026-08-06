package com.comincodeworks.habittracker.ui.habit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.comincodeworks.habittracker.Habit;
import com.comincodeworks.habittracker.R;

import java.util.List;

public class HabitAdapter extends RecyclerView.Adapter<HabitAdapter.HabitViewHolder> {

    private List<Habit> habitList;

    public HabitAdapter(List<Habit> habitList){
        this.habitList = habitList;
    }

    @NonNull
    @Override
    public HabitViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_habit, parent, false);

        return new HabitViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HabitViewHolder holder, int position) {
        Habit habit = habitList.get(position);

        holder.habitName.setText(habit.getName());
        holder.habitCheckBox.setChecked(habit.isCompleted());
        holder.habitCheckBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            habit.setCompleted(isChecked);
        });
    }

    @Override
    public int getItemCount() {
        return habitList.size();
    }

    public static class HabitViewHolder extends RecyclerView.ViewHolder {
        ImageView habitIcon;
        TextView habitName;
        CheckBox habitCheckBox;
    public HabitViewHolder(@NonNull View itemView) {
        super(itemView);

        habitIcon = itemView.findViewById(com.comincodeworks.habittracker.R.id.habitIcon);
        habitName = itemView.findViewById(com.comincodeworks.habittracker.R.id.habitName);
        habitCheckBox = itemView.findViewById(com.comincodeworks.habittracker.R.id.habitCheckBox);
        }
    }
}
