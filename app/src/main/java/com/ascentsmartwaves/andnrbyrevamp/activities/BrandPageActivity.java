package com.ascentsmartwaves.andnrbyrevamp.activities;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.ascentsmartwaves.andnrbyrevamp.R;

public class BrandPageActivity extends Activity {

    ImageView brandLogo, followIcon,call,address,mail;
    TextView dealerName_tv, dealerArticle_tv, followersCounter_tv, dealsCounter_tv, likesCounter_tv, redeemCounter_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brand_page);
        findViews();


    }


    private void findViews()
    {

        brandLogo = (ImageView) findViewById(R.id.brand_logo_imageview_brand_page);
        followIcon = (ImageView) findViewById(R.id.follow_icon_brand_page);
        call = (ImageView) findViewById(R.id.call_image_included);
        address = (ImageView) findViewById(R.id.map_image_included);
        mail = (ImageView) findViewById(R.id.email_image_included);
        dealerName_tv = (TextView) findViewById(R.id.brand_name_textview_brand_page);
        dealerArticle_tv = (TextView) findViewById(R.id.article_textview_brand_page);
        followersCounter_tv = (TextView) findViewById(R.id.followerscounter_counter_followers);
        dealsCounter_tv = (TextView) findViewById(R.id.dealscounter_counter_deals);
        likesCounter_tv = (TextView) findViewById(R.id.likescounter_counter_likes);
        redeemCounter_tv = (TextView) findViewById(R.id.redeemscounter_counter_redeems);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_brand_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
