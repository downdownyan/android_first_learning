package com.example.downdown.a161010geekbandproject_first;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by downdown on 2016/10/23.
 */

public class ListViewActivity extends Activity {

    private ListView mPhoneCircle;
    private List<UserInfo> mUserInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        mPhoneCircle = (ListView)findViewById(R.id.list_view_phone_book);
        mUserInfo = new ArrayList<>();
        mUserInfo.add(new UserInfo(21,"张三"));
        mUserInfo.add(new UserInfo(21,"张三"));
        mUserInfo.add(new UserInfo(21,"张三"));
        mUserInfo.add(new UserInfo(21,"张三"));
        mUserInfo.add(new UserInfo(21,"张三"));
        mUserInfo.add(new UserInfo(21,"张三"));
        mUserInfo.add(new UserInfo(21,"张三"));
        mUserInfo.add(new UserInfo(21,"张三"));
        mUserInfo.add(new UserInfo(21,"垃圾"));
        mUserInfo.add(new UserInfo(21,"张三"));
        mUserInfo.add(new UserInfo(21,"是否"));
        mUserInfo.add(new UserInfo(21,"张三"));
        mUserInfo.add(new UserInfo(21,"张三"));
        mUserInfo.add(new UserInfo(21,"张三"));
        mUserInfo.add(new UserInfo(21,"快捷键"));
        mUserInfo.add(new UserInfo(21,"张三"));
        mUserInfo.add(new UserInfo(21,"张三"));
        mUserInfo.add(new UserInfo(21,"张三"));
        mUserInfo.add(new UserInfo(21,"地方"));
        mUserInfo.add(new UserInfo(21,"让我"));
        mUserInfo.add(new UserInfo(21,"语言"));
        mUserInfo.add(new UserInfo(21,"因为"));
        mUserInfo.add(new UserInfo(21,"张三"));
        mUserInfo.add(new UserInfo(21,"张三"));
        mUserInfo.add(new UserInfo(21,"语言"));
        mUserInfo.add(new UserInfo(21,"因为"));
        mUserInfo.add(new UserInfo(21,"张三"));
        mUserInfo.add(new UserInfo(21,"张三"));
        mUserInfo.add(new UserInfo(21,"语言"));
        mUserInfo.add(new UserInfo(21,"因为"));
        mUserInfo.add(new UserInfo(21,"张三"));
        mUserInfo.add(new UserInfo(21,"张三"));
        mUserInfo.add(new UserInfo(21,"语言"));
        mUserInfo.add(new UserInfo(21,"因为"));
        mUserInfo.add(new UserInfo(21,"张三"));
        mUserInfo.add(new UserInfo(21,"张三"));
        mUserInfo.add(new UserInfo(21,"语言"));
        mUserInfo.add(new UserInfo(21,"因为"));
        mUserInfo.add(new UserInfo(21,"张三"));
        mUserInfo.add(new UserInfo(21,"ashole"));





        final PhoneBookAdapter phoneBookAdapter = new PhoneBookAdapter(ListViewActivity.this, mUserInfo);
        mPhoneCircle.setAdapter(phoneBookAdapter);



        mPhoneCircle.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    mUserInfo.clear();
                    mUserInfo.add(new UserInfo(21,"因为新的"));
                    mUserInfo.add(new UserInfo(21,"张三"));
                    mUserInfo.add(new UserInfo(21,"张三"));
                    mUserInfo.add(new UserInfo(21,"语言"));
                    mUserInfo.add(new UserInfo(21,"因为"));
                    mUserInfo.add(new UserInfo(21,"张三"));
                    mUserInfo.add(new UserInfo(21,"ashole"));
                    phoneBookAdapter.refreshData(mUserInfo);


                }
                Toast.makeText(ListViewActivity.this,mUserInfo.get(position).getmUserName()+ "被点击了", Toast.LENGTH_SHORT).show();
            }

        });
        mPhoneCircle.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this, mUserInfo.get(position).getmUserName()+"哦，时间久就是不一样", Toast.LENGTH_SHORT).show();
                return false;
            }

        });

    }
}
