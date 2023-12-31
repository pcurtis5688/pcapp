package us.paulcurtis.pcapp.ui.resume;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ResumeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ResumeViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}