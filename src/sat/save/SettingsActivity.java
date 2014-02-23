package sat.save;
/**
 * @author kgehrma
 * 
 * SettingActivity
 * 
 * This activity is used to delete all SatInstances in the db
 * 
 * All right reserved 2014
 *
 */

import android.os.Bundle;
import android.app.Activity;
//import android.view.Menu;
//import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
//import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;

public class SettingsActivity extends Activity {
	
	
	Button b_delete;
	SCSQLHelper db;
	SatInstance satinstance;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
		// Show the Up button in the action bar.
		setupActionBar();
		
		db = new SCSQLHelper(this);
		b_delete = (Button)findViewById(R.id.delete);
		b_delete.setOnClickListener(l_delete);
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	private OnClickListener l_delete = new OnClickListener() {
	    public void onClick(View v) {
	    	
	    	 setContentView(R.layout.info);
	    	 satinstance = new SatInstance();
	    	 db.deleteAll(satinstance);
	    	 
	    	 Context context = getApplicationContext();
		     CharSequence text = "All saved points deleted";
		     int duration = Toast.LENGTH_LONG;
		     Toast toast = Toast.makeText(context, text, duration);
		     toast.show();
   
	    }
	};
	
}
