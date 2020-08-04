package com.learning.ui;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import static  com.learning.ui.R.*;

public class ShopListAdapter extends ArrayAdapter<String> {
    private String[] shopNames;
    private Integer[] likes;
    private Integer[] shares;
    private Integer[] visitors;
    private Integer[] shopImageId;
    private Integer likeImageId;
    private Integer shareImageId;
    private Integer visitorImageId;
    private Integer closedImageId;
    private Integer openImageId;
    private Activity context;

    public ShopListAdapter(Activity context,String[] shopNames, Integer[] likes, Integer[] shares ,Integer[] visitors,
                           Integer[] shopImageId, Integer likeImageId,
                           Integer shareImageId, Integer visitorImageId, Integer closedImageId,
                           Integer openImageId) {
        super(context, layout.shops_row_item,shopNames);
        this.shopNames = shopNames;
        this.likes = likes;
        this.shares = shares;
        this.visitors = visitors;
        this.shopImageId = shopImageId;
        this.likeImageId = likeImageId;
        this.shareImageId = shareImageId;
        this.visitorImageId = visitorImageId;
        this.closedImageId = closedImageId;
        this.openImageId = openImageId;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row= convertView;
        LayoutInflater inflater = context.getLayoutInflater();
        if(convertView == null)
            row = inflater.inflate(layout.shops_row_item,null,true);

        TextView txtViewShopTitle = (TextView)row.findViewById(R.id.shopTitle);
        TextView txtViewShopLikeCount = (TextView)row.findViewById(R.id.likesCount);
        TextView txtViewShopShareCount = (TextView)row.findViewById(R.id.shareCount);
        TextView txtViewShopVisitorCount = (TextView)row.findViewById(R.id.visitorsCount);

        ImageView imgLike = (ImageView)row.findViewById(R.id.likes);
        ImageView imgShare = (ImageView)row.findViewById(R.id.share);
        ImageView imgVisitor = (ImageView)row.findViewById(R.id.visitors);
        ImageView imgClosed = (ImageView)row.findViewById(id.shop_closed);
        ImageView imgOpen = (ImageView)row.findViewById(id.shop_open);
        Log.d("ShopiQ",""+position);
        txtViewShopTitle.setText(shopNames[position]);
        Log.d("ShopiQ",""+shopNames[position]);
        Log.d("ShopiQ",""+likes[position]);
        txtViewShopLikeCount.setText(""+likes[position]);

        txtViewShopShareCount.setText(""+shares[position]);
        txtViewShopVisitorCount.setText(""+visitors[position]);
        imgLike.setImageResource(likeImageId);
        imgShare.setImageResource(shareImageId);
        imgVisitor.setImageResource(visitorImageId);
        imgClosed.setImageResource(closedImageId);
        imgOpen.setImageResource(openImageId);

        return row;
    }
}
