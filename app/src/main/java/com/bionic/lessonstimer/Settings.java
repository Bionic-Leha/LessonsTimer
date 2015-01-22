package com.bionic.lessonstimer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Leha on 09.11.2014.
 */
public class Settings extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

        // получаем экземпляр элемента ListView
        ListView lvl = (ListView)findViewById(R.id.less_list);

        // определяем массив типа String
        final String[] mainview = getResources().getStringArray(R.array.less_num);

        // используем адаптер данных
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mainview);

        lvl.setAdapter(adapter);

        lvl.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {
                switch (position){
                    /*
                    case 0:
                        startActivity(new Intent(Test.this, TimePick1.class));
                        break;
                    */
                    case 0:
                        startActivityForResult(new Intent(Settings.this, TimePick1.class), 1);
                        break;
                    case 1:
                        startActivity(new Intent(Settings.this, TimePick2.class));
                        break;
                    case 2:
                        startActivity(new Intent(Settings.this, TimePick3.class));
                        break;
                    case 3:
                        startActivity(new Intent(Settings.this, TimePick4.class));
                        break;
                    case 4:
                        startActivity(new Intent(Settings.this, TimePick5.class));
                        break;
                    case 5:
                        startActivity(new Intent(Settings.this, TimePick6.class));
                        break;
                    case 6:
                        startActivity(new Intent(Settings.this, TimePick7.class));
                        break;
                    default:
                        break;
                }
            }
        });


    }

}
