package com.example.downdown.a161010geekbandproject_first;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by downdown on 2016/10/24.
 */

public class PhoneBookAdapter extends BaseAdapter {
    private Context mContext;
    private List<UserInfo> mUserInfos = new ArrayList<>();
    private LayoutInflater mLayoutInflater;

    public PhoneBookAdapter(Context context, List<UserInfo> userInfos) {
        mUserInfos = userInfos;
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        //有多少条数据

        return mUserInfos.size();
    }

    @Override
    public Object getItem(int position) {
        //返回某一条数据对象
        return mUserInfos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    /**
     * 每一行数据显示在界面上，用户能够看到的时候，就会调用一个view
     *
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    @Override

    public View getView(int position, View convertView, ViewGroup parent) {
        //返回一个视图
        ViewHolder viewHolder;
        if (convertView == null) {//重用
            convertView = mLayoutInflater.inflate(R.layout.item_phone_book_firend, null);
            viewHolder = new ViewHolder();
            //获取控件
           viewHolder.nameTextView = (TextView) convertView.findViewById(R.id.name_text_view);
           viewHolder.ageTextView = (TextView) convertView.findViewById(R.id.age_text_view);
           viewHolder.avatarImageView = (ImageView) convertView.findViewById(R.id.image_view_phone);

            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

//        ImageView
        //和数据之间进行绑定
       viewHolder.nameTextView.setText(mUserInfos.get(position).getmUserName());
       viewHolder.ageTextView.setText(String.valueOf(mUserInfos.get(position).getmAge()));
       viewHolder.avatarImageView.setImageResource(R.mipmap.ic_launcher);
        return convertView;
    }

    class ViewHolder {

        TextView nameTextView;
        TextView ageTextView;
        ImageView avatarImageView;
    }

    /*刷新数据
    */
    public void refreshData(List<UserInfo> userInfos) {
        mUserInfos = userInfos;
        notifyDataSetChanged();
    }
}
