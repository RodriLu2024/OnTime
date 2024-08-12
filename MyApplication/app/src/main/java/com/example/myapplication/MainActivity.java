package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    private RadioGroup radioGroup;
    private Button btnGenerateSchedule;
    private TextView txtSchedule;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        btnGenerateSchedule = findViewById(R.id.btnGenerateSchedule);
        txtSchedule = findViewById(R.id.txtSchedule);

        btnGenerateSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  generateSchedule();
            }
        });
    }

  /*  private void generateSchedule() {
        int selectedId = radioGroup.getCheckedRadioButtonId();
        String shiftPreference = "";

        switch (selectedId) {
            case R.id.radioMorning:
                shiftPreference = "Mañana";
                break;
            case R.id.radioAfternoon:
                shiftPreference = "Tarde";
                break;
            case R.id.radioNight:
                shiftPreference = "Noche";
                break;
        }

        String schedule = createSchedule(shiftPreference);
        txtSchedule.setText(schedule);
    } */

    private String createSchedule(String shiftPreference) {
        // Lógica simple para generar un cronograma de ejemplo
        StringBuilder schedule = new StringBuilder();
        schedule.append("Cronograma de Trabajo\n");
        schedule.append("-----------------------------\n");

        for (int i = 1; i <= 7; i++) {
            schedule.append("Día ").append(i).append(": Turno ").append(shiftPreference).append("\n");
        }

        return schedule.toString();
    }



}
