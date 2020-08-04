package com.learning.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    private ListView mShopsList;
    private String mShopNames[] ={"Shop 1", "Shop 2" };
    private Integer mLikes[]={1,2};
    private Integer mShares[]={1,2};
    private Integer mVisitors[]={1,2};
    private Integer mShopImageId[]={ R.mipmap.ic_shopiq_default_foreground,
            R.mipmap.ic_shopiq_default_foreground    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Integer likeImageId = R.drawable.ic_heart;
        Integer shareImageId=R.drawable.ic_share;
        Integer visitorImageId=R.drawable.ic_visitors;
        Integer closedImageId=R.drawable.ic_closed;
        Integer openImageId=R.drawable.ic_open;
        mShopsList = (ListView)findViewById(R.id.shopsList);
        ShopListAdapter shopListAdapter = new ShopListAdapter(this,mShopNames,mLikes,mShares,mVisitors,mShopImageId,likeImageId,
                shareImageId,visitorImageId,closedImageId,openImageId);
        mShopsList.setAdapter(shopListAdapter);
    }
}