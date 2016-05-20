package com.omega.familytracker;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by USer on 20-05-2016.
 */
public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.pic_one, R.drawable.pic_two,
            R.drawable.pic_three, R.drawable.pic_four,
            R.drawable.pic_five, R.drawable.pic_six,
            R.drawable.pic_seven, R.drawable.pic_eight,
            R.drawable.pic_nine, R.drawable.pic_ten,
            R.drawable.pic_ele, R.drawable.pic_twe,
            R.drawable.pic_thr, R.drawable.pic_twe,
            R.drawable.pic_thr
    };

    // Constructor
    public ImageAdapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(70, 70));
        return imageView;
    }

}
