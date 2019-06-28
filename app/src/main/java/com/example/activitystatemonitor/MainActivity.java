package com.example.activitystatemonitor;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    // Called at the start of the full lifetime.
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Initialize Activity and inflate the UI.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("activitystatemonitor", "onCreate");
    }

    // Called after onCreate has finished, use to restore UI state
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
        // Restore UI state from the savedInstanceState.
        // This bundle has also been passed to onCreate.
        // Will only be called if the Activity has been
        // killed by the system since it was last visible.

        Log.i("activitystatemonitor", "onRestoreInstanceState");
    }

    // Called at the start of the visible lifetime.
    @Override
    protected void onStart() {
        super.onStart();
        // Apply any required UI change now that the Activity is visible.
        Log.i("activitystatemonitor", "onStart");
    }

    // Called at the start of the active lifetime.
    @Override
    protected void onResume() {
        super.onResume();
        // Resume any paused UI updates, threads, or processes required
        // by the Activity but suspended when it was inactive.
        Log.i("activitystatemonitor", "onResume");
    }

    // Called to save UI state changes at the
    // end of the active lifecycle.
    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        // Save UI state changes to the savedInstanceState.
        // This bundle will be passed to onCreate and
        // onRestoreInstanceState if the process is
        // killed and restarted by the run time.
        Log.i("activitystatemonitor", "onSaveInstanceState");
    }

    // Called at the end of the active lifetime.
    @Override
    protected void onPause() {
        super.onPause();
        // Suspend UI updates, threads, or CPU intensive processes
        // that don’t need to be updated when the Activity isn’t
        // the active foreground Activity.
        Log.i("activitystatemonitor", "onPause");
    }

    // Called at the end of the visible lifetime.
    @Override
    protected void onStop() {
        super.onStop();
        // Suspend remaining UI updates, threads, or processing
        // that aren’t required when the Activity isn’t visible.
        // Persist all edits or state changes
        // as after this call the process is likely to be killed.
        Log.i("activitystatemonitor", "onStop");
    }

    // Called before subsequent visible lifetimes
    // for an Activity process.
    @Override
    protected void onRestart() {
        super.onRestart();
        // Load changes knowing that the Activity has already
        // been visible within this process.

        Log.i("activitystatemonitor", "onRestart");
    }

    // Sometimes called at the end of the full lifetime.
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Clean up any resources including ending threads,
        // closing database connections etc.
        Log.i("activitystatemonitor", "onDestroy");
    }




}
