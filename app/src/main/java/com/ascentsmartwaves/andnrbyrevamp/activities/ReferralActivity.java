
package com.ascentsmartwaves.andnrbyrevamp.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import com.ascentsmartwaves.andnrbyrevamp.R;


public class ReferralActivity extends Activity {

    EditText referral_id;
    Button submit_referral,skip_referral;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referral);
        findViews();

    }

private void findViews()
{
    referral_id=(EditText)findViewById(R.id.user_referral_email_id);
    submit_referral=(Button)findViewById(R.id.btn_submit_referral);
    skip_referral=(Button)findViewById(R.id.btn_skip_referral);
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_referral, menu);
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
