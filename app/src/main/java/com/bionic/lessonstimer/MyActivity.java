package com.bionic.lessonstimer;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import java.util.Calendar;

public class MyActivity extends Activity implements View.OnClickListener {
    public static TextView tvTimeLeft_1;
    TextView tvTimeLeft_2;
    TextView tvTimeLeft_3;
    TextView tvTimeLeft_4;
    TextView tvTimeLeft_5;
    TextView tvTimeLeft_6;
    TextView tvTimeLeft_7;
    TextView tvTest;
    ProgressBar updProgress;
    Button btnShow;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        updProgress = (ProgressBar) findViewById(R.id.updProgress);

        SharedPreferences settings = getSharedPreferences(Global.PREFS_NAME, MODE_PRIVATE);

        String e_hours_1 = settings.getString(Global.e_hours_1, "");
        String e_minutes_1 = settings.getString(Global.e_minutes_1, "");

        String e_hours_2 = settings.getString(Global.e_hours_2, "");
        String e_minutes_2 = settings.getString(Global.e_minutes_2, "");

        String e_hours_3 = settings.getString(Global.e_hours_3, "");
        String e_minutes_3 = settings.getString(Global.e_minutes_3, "");

        String e_hours_4 = settings.getString(Global.e_hours_4, "");
        String e_minutes_4 = settings.getString(Global.e_minutes_4, "");

        String e_hours_5 = settings.getString(Global.e_hours_5, "");
        String e_minutes_5 = settings.getString(Global.e_minutes_5, "");

        String e_hours_6 = settings.getString(Global.e_hours_6, "");
        String e_minutes_6 = settings.getString(Global.e_minutes_6, "");

        String e_hours_7 = settings.getString(Global.e_hours_7, "");
        String e_minutes_7 = settings.getString(Global.e_minutes_7, "");

        updTime();

        btnShow = (Button) findViewById(R.id.btnShow);
        btnShow.setOnClickListener(this);

        /*
        ListView lvLessons = (ListView)findViewById(R.id.less_list_t);

        List<Map<String, String>> data = new ArrayList<Map<String, String>>();

        myresult1 = current_hours*60+current_min;
        SimpleAdapter adapter = new SimpleAdapter(this, data,
                android.R.layout.simple_list_item_2,
                new String[] {"title", "date"},
                new int[] {myresult1,
                        android.R.id.text2});

        lvLessons.setAdapter(adapter);
        */

        Log.d("Start", "OK");

        FloatingActionButton fabButton = new FloatingActionButton.Builder(this)
                .withDrawable(getResources().getDrawable(R.drawable.ic_action_refresh))
                // .withButtonColor(Color.WHITE)
                .withButtonColor(0xFF3F51B5)
                .withGravity(Gravity.BOTTOM | Gravity.RIGHT)
                .withMargins(0, 0, 16, 16)
                .create();

        fabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updTime();
            }
        });

    }

    public void updTime(){
        final Animation animFadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        final Animation animFadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out);

        Log.d("updResult", "Read click");
        SharedPreferences settings = getSharedPreferences(Global.PREFS_NAME, MODE_PRIVATE);

        String e_hours_1 = settings.getString(Global.e_hours_1, "");
        String e_minutes_1 = settings.getString(Global.e_minutes_1, "");

        String e_hours_2 = settings.getString(Global.e_hours_2, "");
        String e_minutes_2 = settings.getString(Global.e_minutes_2, "");

        String e_hours_3 = settings.getString(Global.e_hours_3, "");
        String e_minutes_3 = settings.getString(Global.e_minutes_3, "");

        String e_hours_4 = settings.getString(Global.e_hours_4, "");
        String e_minutes_4 = settings.getString(Global.e_minutes_4, "");

        String e_hours_5 = settings.getString(Global.e_hours_5, "");
        String e_minutes_5 = settings.getString(Global.e_minutes_5, "");

        String e_hours_6 = settings.getString(Global.e_hours_6, "");
        String e_minutes_6 = settings.getString(Global.e_minutes_6, "");

        String e_hours_7 = settings.getString(Global.e_hours_7, "");
        String e_minutes_7 = settings.getString(Global.e_minutes_7, "");

        tvTimeLeft_1 = (TextView) findViewById(R.id.tvTimeLeft_1);
        tvTimeLeft_1.clearAnimation();
        tvTimeLeft_1.startAnimation(animFadeOut);
        tvTimeLeft_1.startAnimation(animFadeIn);

        tvTimeLeft_2 = (TextView) findViewById(R.id.tvTimeLeft_2);
        tvTimeLeft_2.startAnimation(animFadeOut);
        tvTimeLeft_2.startAnimation(animFadeIn);

        tvTimeLeft_3 = (TextView) findViewById(R.id.tvTimeLeft_3);
        tvTimeLeft_3.startAnimation(animFadeOut);
        tvTimeLeft_3.startAnimation(animFadeIn);

        tvTimeLeft_4 = (TextView) findViewById(R.id.tvTimeLeft_4);
        tvTimeLeft_4.startAnimation(animFadeOut);
        tvTimeLeft_4.startAnimation(animFadeIn);

        tvTimeLeft_5 = (TextView) findViewById(R.id.tvTimeLeft_5);
        tvTimeLeft_5.startAnimation(animFadeOut);
        tvTimeLeft_5.startAnimation(animFadeIn);

        tvTimeLeft_6 = (TextView) findViewById(R.id.tvTimeLeft_6);
        tvTimeLeft_6.startAnimation(animFadeOut);
        tvTimeLeft_6.startAnimation(animFadeIn);

        tvTimeLeft_7 = (TextView) findViewById(R.id.tvTimeLeft_7);
        tvTimeLeft_7.startAnimation(animFadeOut);
        tvTimeLeft_7.startAnimation(animFadeIn);

        int myresult1;

        int myresult2_1;
        int mymainresult_1;

        int myresult2_2;
        int mymainresult_2;

        int myresult2_3;
        int mymainresult_3;

        int myresult2_4;
        int mymainresult_4;

        int myresult2_5;
        int mymainresult_5;

        int myresult2_6;
        int mymainresult_6;

        int myresult2_7;
        int mymainresult_7;

        Calendar ct = Calendar.getInstance();
        int current_hours = ct.get(Calendar.HOUR_OF_DAY);
        int current_min = ct.get(Calendar.MINUTE);

        /** Lesson 1 */
        if (e_hours_1 + e_minutes_1 == ""){
            tvTimeLeft_1.setText(getString(R.string.time_error));
        }

        else {
            myresult1 = current_hours*60+current_min;
            int hour1 = Integer.parseInt(e_hours_1);
            int minute1 = Integer.parseInt(e_minutes_1);
            myresult2_1 = hour1*60+minute1;
            mymainresult_1 = myresult2_1-myresult1;
            if (mymainresult_1 <= 0) {
                tvTimeLeft_1.setText(getString(R.string.time_ended));
            }else if (mymainresult_1 == 1) {
                tvTimeLeft_1.setText(mymainresult_1 + " " + getString(R.string.min_left_3));
            } else if (mymainresult_1 < 5) {
                tvTimeLeft_1.setText(mymainresult_1 + " " + getString(R.string.min_left_2));
            } else {
                tvTimeLeft_1.setText(mymainresult_1 + " " + getString(R.string.min_left_1));
            }
        }

        /** Lesson 2 */
        if (e_hours_2 + e_minutes_2 == ""){
            tvTimeLeft_2.setText(getString(R.string.time_error));
        }

        else {
            myresult1 = current_hours*60+current_min;
            int hour2 = Integer.parseInt(e_hours_2);
            int minute2 = Integer.parseInt(e_minutes_2);
            myresult2_2 = hour2*60+minute2;
            mymainresult_2 = myresult2_2-myresult1;
            if (mymainresult_2 <= 0) {
                tvTimeLeft_2.setText(getString(R.string.time_ended));
            }else if (mymainresult_2 == 1) {
                tvTimeLeft_2.setText(mymainresult_2 + " " + getString(R.string.min_left_3));
            } else if (mymainresult_2 < 5) {
                tvTimeLeft_2.setText(mymainresult_2 + " " + getString(R.string.min_left_2));
            } else {
                tvTimeLeft_2.setText(mymainresult_2+ " " + getString(R.string.min_left_1));
            }
        }

        /** Lesson 3 */
        if (e_hours_3 + e_minutes_3 == ""){
            tvTimeLeft_3.setText(getString(R.string.time_error));
        }

        else {
            myresult1 = current_hours * 60 + current_min;
            int hour3 = Integer.parseInt(e_hours_3);
            int minute3 = Integer.parseInt(e_minutes_3);
            myresult2_3 = hour3*60+minute3;
            mymainresult_3 = myresult2_3-myresult1;
            if (mymainresult_3 <= 0)
            {
                tvTimeLeft_3.setText(getString(R.string.time_ended));
            }else if (mymainresult_3 == 1) {
                tvTimeLeft_3.setText(mymainresult_3 + " " + getString(R.string.min_left_3));
            } else if (mymainresult_3 < 5) {
                tvTimeLeft_3.setText(mymainresult_3 + " " + getString(R.string.min_left_2));
            } else {
                tvTimeLeft_3.setText(mymainresult_3 + " " + getString(R.string.min_left_1));
            }
        }

        /** Lesson 4 */
        if (e_hours_4 + e_minutes_4 == ""){
            tvTimeLeft_4.setText(getString(R.string.time_error));
        }

        else {
            myresult1 = current_hours * 60 + current_min;
            int hour4 = Integer.parseInt(e_hours_4);
            int minute4 = Integer.parseInt(e_minutes_4);
            myresult2_4 = hour4*60+minute4;
            mymainresult_4 = myresult2_4-myresult1;
            if (mymainresult_4 <= 0)
            {
                tvTimeLeft_4.setText(getString(R.string.time_ended));
            }else if (mymainresult_4 == 1) {
                tvTimeLeft_4.setText(mymainresult_4 + " " + getString(R.string.min_left_3));
            } else if (mymainresult_4 < 5) {
                tvTimeLeft_4.setText(mymainresult_4 + " " + getString(R.string.min_left_2));
            } else {
                tvTimeLeft_4.setText(mymainresult_4 + " " + getString(R.string.min_left_1));
            }
        }

        /** Lesson 5 */
        if (e_hours_5 + e_minutes_5 == ""){
            tvTimeLeft_5.setText(getString(R.string.time_error));
        }

        else {
            myresult1 = current_hours*60+current_min;
            int hour5 = Integer.parseInt(e_hours_5);
            int minute5 = Integer.parseInt(e_minutes_5);
            myresult2_5 = hour5*60+minute5;
            mymainresult_5 = myresult2_5-myresult1;
            if (mymainresult_5 <= 0)
            {
                tvTimeLeft_5.setText(getString(R.string.time_ended));
            }else if (mymainresult_5 == 1) {
                tvTimeLeft_5.setText(mymainresult_5 + " " + getString(R.string.min_left_3));
            } else if (mymainresult_5 < 5) {
                tvTimeLeft_5.setText(mymainresult_5 + " " + getString(R.string.min_left_2));
            } else {
                tvTimeLeft_5.setText(mymainresult_5 + " " + getString(R.string.min_left_1));
            }
        }

        /** Lesson 6 */
        if (e_hours_6 + e_minutes_6 == ""){
            tvTimeLeft_6.setText(getString(R.string.time_error));
        }

        else {
            myresult1 = current_hours*60+current_min;
            int hour6 = Integer.parseInt(e_hours_6);
            int minute6 = Integer.parseInt(e_minutes_6);
            myresult2_6 = hour6*60+minute6;
            mymainresult_6 = myresult2_6-myresult1;
            if (mymainresult_6 <= 0)
            {
                tvTimeLeft_6.setText(getString(R.string.time_ended));
            }else if (mymainresult_6 == 1) {
                tvTimeLeft_6.setText(mymainresult_6 + " " + getString(R.string.min_left_3));
            } else if (mymainresult_6 < 5) {
                tvTimeLeft_6.setText(mymainresult_6 + " " + getString(R.string.min_left_2));
            } else {
                tvTimeLeft_6.setText(mymainresult_6 + " " + getString(R.string.min_left_1));
            }
        }

        /** Lesson 7 */
        if (e_hours_7 + e_minutes_7 == ""){
            tvTimeLeft_7.setText(getString(R.string.time_error));
        }

        else {
            myresult1 = current_hours*60+current_min;
            int hour7 = Integer.parseInt(e_hours_7);
            int minute7 = Integer.parseInt(e_minutes_7);
            myresult2_7 = hour7*60+minute7;
            mymainresult_7 = myresult2_7-myresult1;
            if (mymainresult_7 <= 0)
            {
                tvTimeLeft_7.setText(getString(R.string.time_ended));
            }else if (mymainresult_7 == 1) {
                tvTimeLeft_7.setText(mymainresult_7 + " " + getString(R.string.min_left_3));
            } else if (mymainresult_7 < 5) {
                tvTimeLeft_7.setText(mymainresult_7 + " " + getString(R.string.min_left_2));
            } else {
                tvTimeLeft_7.setText(mymainresult_7 + " " + getString(R.string.min_left_1));
            }
        }

        Toast.makeText(MyActivity.this, getString(R.string.time_updated), Toast.LENGTH_SHORT).show();
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnShow:
                updResult();
                break;
            default:
                break;
        }
    }


    void updResult() {
        Log.d("updResult", "Read click");
        SharedPreferences settings = getSharedPreferences(Global.PREFS_NAME, MODE_PRIVATE);
        String e_hours_1 = settings.getString(Global.e_hours_1, "");
        String e_minutes_1 = settings.getString(Global.e_minutes_1, "");

        tvTimeLeft_1 = (TextView) findViewById(R.id.tvTimeLeft_1);

        if (e_hours_1 == "")
        {
            tvTimeLeft_1.setText(getString(R.string.time_error));
            Log.d("Error", "something went wrong..");
        }

        else
        {

        int myresult1;
        int myresult2;
        int mymainresult;

        Calendar ct = Calendar.getInstance();
        int current_hours = ct.get(Calendar.HOUR_OF_DAY);
        int current_min = ct.get(Calendar.MINUTE);

        int hour2 = Integer.parseInt(e_hours_1);
        int minute2 = Integer.parseInt(e_minutes_1);

        myresult1 = current_hours*60+current_min;
        myresult2 = hour2*60+minute2;
        Log.d("myresult1", String.valueOf(myresult1));
        Log.d("myresult2", String.valueOf(myresult2));
        mymainresult = myresult2-myresult1;
        Log.d("Loaded", String.valueOf(mymainresult));

        if (mymainresult <= 0)
        {
            tvTimeLeft_1.setText(getString(R.string.time_ended));
        }

        else if (mymainresult == 0)
        {
            tvTimeLeft_1.setText(getString(R.string.time_error));
        }

        else
        {
            Toast.makeText(this, getString(R.string.time_updated), Toast.LENGTH_SHORT).show();
            tvTimeLeft_1.setText(mymainresult + " " + getString(R.string.min_left));
        }

        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_settings:
                newSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void newSettings() {
        startActivity(new Intent(MyActivity.this, Settings.class));
    }

    /**
     * Google adMob
     * A placeholder fragment containing a simple view. This fragment
     * would include your content.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_my, container, false);
            return rootView;
        }
    }

    /**
     * This class makes the ad request and loads the ad.
     */
    public static class AdFragment extends Fragment {

        private AdView mAdView;

        public AdFragment() {
        }

        @Override
        public void onActivityCreated(Bundle bundle) {
            super.onActivityCreated(bundle);

            // Gets the ad view defined in layout/ad_fragment.xml with ad unit ID set in
            // values/strings.xml.
            mAdView = (AdView) getView().findViewById(R.id.adView);

            // Create an ad request. Check logcat output for the hashed device ID to
            // get test ads on a physical device. e.g.
            // "Use AdRequest.Builder.addTestDevice("ABCDEF012345") to get test ads on this device."
            AdRequest adRequest = new AdRequest.Builder()
                    .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                    .addTestDevice("008ac50788cdf7e0")
                    .build();

            // Start loading the ad in the background.
            mAdView.loadAd(adRequest);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            return inflater.inflate(R.layout.fragment_ad, container, false);
        }

        /** Called when leaving the activity */
        @Override
        public void onPause() {
            if (mAdView != null) {
                mAdView.pause();
            }
            super.onPause();
        }

        /** Called when returning to the activity */
        @Override
        public void onResume() {
            super.onResume();
            if (mAdView != null) {
                mAdView.resume();
            }
        }

        /** Called before the activity is destroyed */
        @Override
        public void onDestroy() {
            if (mAdView != null) {
                mAdView.destroy();
            }
            super.onDestroy();
        }

    }

}



