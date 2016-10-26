package com.example.downdown.a161010geekbandproject_first;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static int resultCode;
    private  Button mphoneButton;
    private View.OnClickListener mViewOnClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mMainButton = (Button) findViewById(R.id.main_button_first);
        mViewOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {

                    case R.id.main_button_first:
//                        Intent intent_splash = new Intent(MainActivity.this,SplashActivity.class);
                    Intent intent = new Intent();
                    intent.putExtra(SplashActivity.TITLE, "我是主页君？");
                    resultCode = 2333;
                    setResult(resultCode, intent);
                    finish();
//                        startActivity(intent_splash);
                        break;
                    case R.id.button_phone_circle:
                        Intent intent1 = new Intent(MainActivity.this,ListViewActivity.class);
                        startActivity(intent1);

                }
            }
        };
        mMainButton.setOnClickListener(mViewOnClickListener);
        Intent intent = getIntent();
        if(intent!=null){
            String title = intent.getStringExtra("title");
           UserInfo userinfo = (UserInfo) intent.getSerializableExtra("userinfo");
            setTitle(userinfo.getmUserName());


        }
        mphoneButton = (Button) findViewById(R.id.button_phone_circle);
    mphoneButton.setOnClickListener(mViewOnClickListener);

    }
}
