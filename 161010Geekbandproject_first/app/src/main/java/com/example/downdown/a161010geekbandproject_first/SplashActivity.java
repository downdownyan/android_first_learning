package com.example.downdown.a161010geekbandproject_first;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by downdown on 2016/10/10.
 */
public class SplashActivity extends Activity {
    Handler mhandler = new Handler();
    private Button mEnterButton;
    private View.OnClickListener mOnClicklistener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.splash_enter_button:
                    Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    };
    private static int requestCode = 9999;
    private static final String TAG= SplashActivity.class.getSimpleName();
    public static String TITLE;
    private TextView mtextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mtextView = (TextView) findViewById(R.id.splash_text_view);
        TITLE = mtextView.getText().toString();
        mEnterButton = (Button) findViewById(R.id.splash_enter_button);
        mEnterButton.setOnClickListener(mOnClicklistener);
        final UserInfo userInfo = new UserInfo(12,"小明");
        mhandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                intent.putExtra("title", TITLE);
                intent.putExtra("userinfo",userInfo);
                startActivityForResult(intent, requestCode);

            }
        },1000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.i(TAG,"requestCode:"+requestCode+"resultCode"+resultCode);
        if(requestCode==SplashActivity.requestCode&&resultCode==MainActivity.resultCode){
            if(data!=null){
                String title = data.getStringExtra(TITLE);
                mtextView.setText(title);
            }
        }
    }
}
