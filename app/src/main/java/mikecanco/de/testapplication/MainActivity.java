package mikecanco.de.testapplication;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import hugo.weaving.DebugLog;

@DebugLog
public class MainActivity extends Activity implements MainActivityFragment.onFragmentButtonClickedListener {

	@DebugLog
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Fragment f = MainActivityFragment.newInstance("first fragment");

		if (savedInstanceState == null){

			FragmentTransaction t = getFragmentManager().beginTransaction().add(R.id.frame_layout, f);
			t.commit();
		}

		Log.d("testApplication", String.valueOf(f.getId()));


	}
	@DebugLog
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
	}

	@DebugLog
	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
	}

	@DebugLog
	@Override
	protected void onStart() {
		super.onStart();
	}

	@DebugLog
	@Override
	protected void onRestart() {
		super.onRestart();
	}

	@DebugLog
	@Override
	protected void onResume() {
		super.onResume();
	}

	@DebugLog
	@Override
	protected void onPause() {
		super.onPause();
	}
	@DebugLog
	@Override
	protected void onStop() {
		super.onStop();
	}
	@DebugLog
	@Override
	protected void onDestroy() {
		super.onDestroy();
	}
	@DebugLog
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
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

	@Override
	public void onClick() {
		getFragmentManager().beginTransaction().replace(R.id.frame_layout,
				SecondFragment.newInstance("second text")).commit();

	}
}
