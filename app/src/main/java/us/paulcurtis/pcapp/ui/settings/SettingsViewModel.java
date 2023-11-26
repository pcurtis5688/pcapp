package us.paulcurtis.pcapp.ui.settings;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SettingsViewModel extends ViewModel {
    private final MutableLiveData<String> mTestText;

    public SettingsViewModel() {
        mTestText = new MutableLiveData<>();
        mTestText.setValue("Testing Mutable Live data in settings");
        Log.d("Hit mutable live data...", "" + mTestText.getValue());
    }

    public LiveData<String> getTestText() {
        return mTestText;
    }
}
