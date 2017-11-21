package com.example.ubuntu.app;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Main2Activity extends AppCompatActivity {

    int judge;
    String name = "";
    String explanation = "";
    EditText add_name;
    EditText add_explanation;
    RadioButton radioButton;
    RadioGroup rg;
    SharedPreferences sp;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        add_name = (EditText)findViewById(R.id.name);

        add_explanation = (EditText)findViewById(R.id.explanation);

        // ラジオグループのオブジェクトを取得
        rg = (RadioGroup)findViewById(R.id.radiogroup);
        // チェックされているラジオボタンの ID を取得
        int id = rg.getCheckedRadioButtonId();
        // チェックされているラジオボタンオブジェクトを取得
        radioButton = (RadioButton)findViewById(id);

        switch (id) {
            case R.id.great:
                judge = 3;
                break;
            case R.id.good:
                judge = 2;
                break;
            case R.id.shimada:
                judge = 1;
                break;
        }

        Button add_button = (Button)findViewById(R.id.button);

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //データを渡してます
                //name(String):商品名,explanation(String):商品説明,judge(int):評価(1:悪い,2:普通,3:良い)
                //で取得できます
                name = add_name.getText().toString();
                explanation = add_explanation.getText().toString();
                //ここまで




            }
        });


    }
}
