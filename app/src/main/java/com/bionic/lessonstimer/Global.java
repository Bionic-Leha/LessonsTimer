package com.bionic.lessonstimer;

import android.app.Activity;
import android.content.SharedPreferences;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

/**
 * Created by Leha on 11.11.2014.
 */
public class Global extends Activity {

    public static int result1;
    public static int result2;
    public static int mainresult;
    public static int end_hour;
    public static int end_minutes;
    public static TimePicker timepicker1;
    public static TimePicker timepicker2;
    public static TimePicker timepicker3;
    public static TimePicker timepicker4;
    public static TimePicker timepicker5;
    public static TimePicker timepicker6;
    public static TimePicker timepicker7;
    public static TimePicker timepicker8;

    /*
    public static int hour1 = (Global.timepicker1.getCurrentHour());
    public static int minute1 = (Global.timepicker1.getCurrentMinute());
    public static int hour2 = (Global.timepicker2.getCurrentHour());
    public static int minute2 = (Global.timepicker2.getCurrentMinute());
    */

    public static Calendar ct = Calendar.getInstance();
    public static int current_hours = ct.get(Calendar.HOUR_OF_DAY);
    public static int current_min = ct.get(Calendar.MINUTE);

    /*
    SharedPreferences settings = getSharedPreferences(Global.PREFS_NAME, MODE_PRIVATE);
    String endHourString = settings.getString(Global.GLOBAL_RESULT_1, "");
    String endMinutesString = settings.getString(Global.GLOBAL_RESULT_1, "");
    public static int end_hour = Integer.parseInt(endHourString);
    public static int end_minutes = Integer.parseInt(str);
    */


    public static SharedPreferences mSettings;
    public static String SAVED_TEXT = Float.toString(Global.mainresult);

    public static TextView tvSaved;

    public static final String PREFS_NAME = "TimeSettings";

    //public static String b_hours_1 = "beg_hours";
    public static String b_hours_1 = "beg_hours";
    public static String b_minutes_1 = "beg_minutes";

    public static String GLOBAL_RESULT_1 = "result_1";
    public static String e_hours_1 = "end_hours_1";
    public static String e_minutes_1 = "end_minutes_1";

    public static String GLOBAL_RESULT_2 = "result_2";
    public static String e_hours_2 = "end_hours_2";
    public static String e_minutes_2 = "end_minutes_2";

    public static String GLOBAL_RESULT_3 = "result_3";
    public static String e_hours_3 = "end_hours_3";
    public static String e_minutes_3 = "end_minutes_3";

    public static String GLOBAL_RESULT_4 = "result_4";
    public static String e_hours_4 = "end_hours_4";
    public static String e_minutes_4 = "end_minutes_4";

    public static String GLOBAL_RESULT_5 = "result_5";
    public static String e_hours_5 = "end_hours_5";
    public static String e_minutes_5 = "end_minutes_5";

    public static String GLOBAL_RESULT_6 = "result_6";
    public static String e_hours_6 = "end_hours_6";
    public static String e_minutes_6 = "end_minutes_6";

    public static String GLOBAL_RESULT_7 = "result_7";
    public static String e_hours_7 = "end_hours_7";
    public static String e_minutes_7 = "end_minutes_7";

    //public static String end_hour_s = "end_minutes_g";
    //public static String end_minutes_s = "end_minutes_g";

    //public static int end_hour = Integer.parseInt(end_hour_s);
    //public static int end_minutes = Integer.parseInt(end_minutes_s);

}

