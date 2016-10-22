package com.example.downdown.a161010geekbandproject_first;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static int resultCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mMainButton = (Button) findViewById(R.id.main_button_first);
        mMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra(SplashActivity.TITLE,"我是主页君？");
                resultCode = 2333;
                setResult(resultCode,intent);
                finish();
            }
        });
        Intent intent = getIntent();
        if(intent!=null){
            String title = intent.getStringExtra("title");
           UserInfo userinfo = (UserInfo) intent.getSerializableExtra("userinfo");
            setTitle(userinfo.getmUserName());


        }

    }
}
