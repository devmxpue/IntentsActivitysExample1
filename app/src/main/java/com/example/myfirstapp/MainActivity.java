package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //atributo
    public static final String EXTRA_MESSAGE ="com.example.myfirstapp.MESSAGE";
 //private TextView txtView;


 // todo lo que esta en res se lee en en la clase estatica R.
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //txtView = (TextView) findViewById(R.id.holamundo);
        //txtView.setText("Hola mundo.....");

    }
     //evento click
    public void sendMessage (View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
         intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }
}
