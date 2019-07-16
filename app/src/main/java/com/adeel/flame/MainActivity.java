package com.adeel.flame;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private EditText mEditText;
    private Button mButton;
    FirebaseDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = (EditText)findViewById(R.id.edittext);
        mButton = (Button)findViewById(R.id.button);
        database = FirebaseDatabase.getInstance();
        Toast.makeText(this,"comeone ",Toast.LENGTH_SHORT);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click();
            }
        });





    }
    public void click(){
        String input = mEditText.getText().toString();
        DatabaseReference myRef = database.getReference("message");
        Toast.makeText(this,"comeone "+ input ,Toast.LENGTH_SHORT).show();

        myRef.setValue(input);
        mEditText.setText("");
}}
