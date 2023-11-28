package us.paulcurtis.pcapp.ui.resume;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import us.paulcurtis.pcapp.R;
import us.paulcurtis.pcapp.databinding.FragmentResumeBinding;

public class ResumeFragment extends Fragment {

    private FragmentResumeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ResumeViewModel resumeViewModel =
                new ViewModelProvider(this).get(ResumeViewModel.class);

        binding = FragmentResumeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textviewResume = binding.textviewResume;
        textviewResume.setText(R.string.menu_resume);

        resumeViewModel.getText().observe(getViewLifecycleOwner(), textviewResume::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}