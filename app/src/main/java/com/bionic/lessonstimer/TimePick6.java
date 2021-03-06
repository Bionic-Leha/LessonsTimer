package com.bionic.lessonstimer;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

/**
 * Created by Leha on 07.12.2014.
 */
public class TimePick6 extends Activity implements View.OnClickListener {
    TextView tvInfo;
    Button butGetTime;
    Button btnSave;
    Button btnLoad;
    TextView tvTimeLeft;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pick_time);
        Calendar now = Calendar.getInstance();

        tvTimeLeft = (TextView) findViewById(R.id.tvTimeLeft_2);

        btnSave = (Button) findViewById(R.id.btn_set_ok);
        btnSave.setOnClickListener(this);

        btnLoad = (Button) findViewById(R.id.btnLoad);
        btnLoad.setOnClickListener(this);

        tvInfo = (TextView) findViewById(R.id.textView1);

        // First TimePicker
        Global.timepicker1 = (TimePicker) findViewById(R.id.timePickerStart);
        Global.timepicker1.setIs24HourView(true);
        Global.timepicker1.setCurrentHour(now.get(Calendar.HOUR_OF_DAY));
        Global.timepicker1.setCurrentMinute(now.get(Calendar.MINUTE));
        Global.timepicker1.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {

            @Override
            public void onTimeChanged(TimePicker view, int hour1, int minute1) {
                Toast.makeText(getApplicationContext(), "onTimeChanged",
                        Toast.LENGTH_SHORT).show();

                tvInfo.setText("Часы: " + hour1 + "\n" + "Минуты: "
                        + minute1);
            }
        });

        // Button get time
        butGetTime = (Button) findViewById(R.id.button1);

        butGetTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInfo.setText(new StringBuilder()
                        .append(Global.timepicker1.getCurrentHour()).append(":")
                        .append(Global.timepicker1.getCurrentMinute()).append(" - ")
                        .append(Global.timepicker7.getCurrentHour()).append(":")
                        .append(Global.timepicker7.getCurrentMinute()));
            }
        });

        // Second TimePicker
        Global.timepicker7 = (TimePicker) findViewById(R.id.timePickerEnd);
        Global.timepicker7.setIs24HourView(true);
        Global.timepicker7.setCurrentHour(now.get(Calendar.HOUR_OF_DAY));
        Global.timepicker7.setCurrentMinute(now.get(Calendar.MINUTE));
        Global.timepicker7.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {

            @Override
            public void onTimeChanged(TimePicker view, int hour2, int minute2) {
                //Toast.makeText(getApplicationContext(), "onTimeChanged",
                        //Toast.LENGTH_SHORT).show();

                tvInfo.setText("Часы: " + hour2 + "\n" + "Минуты: "
                        + minute2);
            }
        });

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_set_ok:
                saveText();
                break;
            //case R.id.btnLoad:
            //loadText();
            //break;
            default:
                break;
        }
    }

    void saveText() {
        int hour1 = (Global.timepicker1.getCurrentHour());
        int minute1 = (Global.timepicker1.getCurrentMinute());
        int hour2 = (Global.timepicker7.getCurrentHour());
        int minute2 = (Global.timepicker7.getCurrentMinute());

        Global.result1 = hour1*60+minute1;
        Global.result2 = hour2*60+minute2;
        Global.mainresult = Global.result2-Global.result1;

        // Тестирую новый спреф
        SharedPreferences settings = getSharedPreferences(Global.PREFS_NAME, MODE_PRIVATE);
        // Writing data to SharedPreferences
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(Global.b_hours_1, String.valueOf(hour1));
        editor.putString(Global.b_minutes_1, String.valueOf(minute1));
        editor.putString(Global.e_hours_6, String.valueOf(hour2));
        editor.putString(Global.e_minutes_6, String.valueOf(minute2));
        editor.putString(Global.GLOBAL_RESULT_6, String.valueOf(Global.mainresult));
        editor.commit();
        // Конец нового спрефа
        Toast.makeText(this, getString(R.string.time_saved), Toast.LENGTH_SHORT).show();

    }


}
