package com.example.somesnippets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edittext;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext = findViewById(R.id.edit_text);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isValid()){
                    finish();
                }
            }
        });
    }

    public boolean isValid(){
        boolean flag = true;
        if(edittext.getText().toString().length() == 0){
            editTextFocus(edittext);
            edittext.setError("Sorry this field cannot be empty");
            flag = false;
        }
        return flag;

    }

    public  void editTextFocus(EditText editText){
        editText.requestFocus();
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_MODE_CHANGED);
    }
}
