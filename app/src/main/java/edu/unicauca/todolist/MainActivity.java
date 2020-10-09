package edu.unicauca.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Get references to UI widgets

        ListView myListView = (ListView) findViewById(R.id.myListView);
        final EditText myEditText = (EditText) findViewById(R.id.myEditText);
            Button myButton = (Button)findViewById(R.id.myButton);

        final ArrayList<String> todoItems = new ArrayList<String>();

        final ArrayAdapter<String> aa;
        aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, todoItems);
        myListView.setAdapter(aa);

            myButton.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
                todoItems.add(0,
                myEditText.getText().toString());
                aa.notifyDataSetChanged();
                myEditText.setText("");
            }
            });
    }




}