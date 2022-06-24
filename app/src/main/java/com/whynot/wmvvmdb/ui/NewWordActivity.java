package com.whynot.wmvvmdb.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;

import com.whynot.wmvvmdb.R;

public class NewWordActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "ru.synergy.wordsmvvmlivedata.reply";

    private EditText mEditWordView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_word);
        mEditWordView = findViewById(R.id.edit_word);

        final Button button = findViewById(R.id.button_save);
        button.setOnClickListener( view-> {
            Intent replyintent = new Intent();
            if(TextUtils.isEmpty(mEditWordView.getText())){
                setResult(RESULT_CANCELED, replyintent);
            }else{
                String word = mEditWordView.getText().toString();
                replyintent.putExtra(EXTRA_REPLY, word);
                setResult(RESULT_OK, replyintent);
            }
            finish();
        });

    }
}