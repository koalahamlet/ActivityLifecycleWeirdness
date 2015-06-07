package mikecanco.de.testapplication;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import hugo.weaving.DebugLog;

/**
 * A placeholder fragment containing a simple view.
 */
public class SecondFragment extends Fragment {

	public SecondFragment() {
	}

	static SecondFragment newInstance(String text){
		Bundle bundle = new Bundle();
		bundle.putString("TEXT_ARG", text);

		SecondFragment f = new SecondFragment();
		f.setArguments(bundle);

		return f;
	}

	/**
	 * Called when the fragment is visible to the user and actively running.
	 * This is generally
	 * tied to {@link Activity#onResume() Activity.onResume} of the containing
	 * Activity's lifecycle.
	 */
	@DebugLog
	@Override
	public void onResume() {
		super.onResume();
	}

	/**
	 * Called when the Fragment is visible to the user.  This is generally
	 * tied to {@link Activity#onStart() Activity.onStart} of the containing
	 * Activity's lifecycle.
	 */
	@DebugLog
	@Override
	public void onStart() {
		super.onStart();
	}

	/**
	 * Called to ask the fragment to save its current dynamic state, so it
	 * can later be reconstructed in a new instance of its process is
	 * restarted.  If a new instance of the fragment later needs to be
	 * created, the data you place in the Bundle here will be available
	 * in the Bundle given to {@link #onCreate(Bundle)},
	 * {@link #onCreateView(LayoutInflater, ViewGroup, Bundle)}, and
	 * {@link #onActivityCreated(Bundle)}.
	 * <p/>
	 * <p>This corresponds to {@link Activity#onSaveInstanceState(Bundle)
	 * Activity.onSaveInstanceState(Bundle)} and most of the discussion there
	 * applies here as well.  Note however: <em>this method may be called
	 * at any time before {@link #onDestroy()}</em>.  There are many situations
	 * where a fragment may be mostly torn down (such as when placed on the
	 * back stack with no UI showing), but its state will not be saved until
	 * its owning activity actually needs to save its state.
	 *
	 * @param outState Bundle in which to place your saved state.
	 */
	@DebugLog
	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
	}

	/**
	 * Called when the Fragment is no longer resumed.  This is generally
	 * tied to {@link Activity#onPause() Activity.onPause} of the containing
	 * Activity's lifecycle.
	 */
	@DebugLog
	@Override
	public void onPause() {
		super.onPause();
	}

	/**
	 * Called when the Fragment is no longer started.  This is generally
	 * tied to {@link Activity#onStop() Activity.onStop} of the containing
	 * Activity's lifecycle.
	 */
	@DebugLog
	@Override
	public void onStop() {
		super.onStop();
	}

	/**
	 * Called when the view previously created by {@link #onCreateView} has
	 * been detached from the fragment.  The next time the fragment needs
	 * to be displayed, a new view will be created.  This is called
	 * after {@link #onStop()} and before {@link #onDestroy()}.  It is called
	 * <em>regardless</em> of whether {@link #onCreateView} returned a
	 * non-null view.  Internally it is called after the view's state has
	 * been saved but before it has been removed from its parent.
	 */
	@DebugLog
	@Override
	public void onDestroyView() {
		super.onDestroyView();
	}

	/**
	 * Called when the fragment is no longer in use.  This is called
	 * after {@link #onStop()} and before {@link #onDetach()}.
	 */
	@DebugLog
	@Override
	public void onDestroy() {
		super.onDestroy();
	}

	/**
	 * Called when the fragment is no longer attached to its activity.  This
	 * is called after {@link #onDestroy()}.
	 */@DebugLog
	@Override
	public void onDetach() {
		super.onDetach();
	}

	/**
	 * Called when the fragment's activity has been created and this
	 * fragment's view hierarchy instantiated.  It can be used to do final
	 * initialization once these pieces are in place, such as retrieving
	 * views or restoring state.  It is also useful for fragments that use
	 * {@link #setRetainInstance(boolean)} to retain their instance,
	 * as this callback tells the fragment when it is fully associated with
	 * the new activity instance.  This is called after {@link #onCreateView}
	 * and before {@link #onViewStateRestored(Bundle)}.
	 *
	 * @param savedInstanceState If the fragment is being re-created from
	 *                           a previous saved state, this is the state.
	 */@DebugLog
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}

	@DebugLog
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	/**
	 * Called when a fragment is first attached to its activity.
	 * {@link #onCreate(Bundle)} will be called after this.
	 *
	 * @param activity
	 */@DebugLog
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
	}



	@DebugLog
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_main, container, false);

		TextView tv = (TextView) v.findViewById(R.id.text);
		tv.setText(getArguments().getString("TEXT_ARG"));



		return v;
	}
}
