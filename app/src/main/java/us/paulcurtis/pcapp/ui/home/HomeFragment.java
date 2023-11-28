package us.paulcurtis.pcapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import us.paulcurtis.pcapp.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        /* SET THE HOME VIEWS TEXT VIEW VALUES */
        final TextView textView = binding.pcHomeText;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        /*TODO FINISH FIGURING THIS OUT.
           context.getString(R.string.my_string, fun)
           String sigString = binding.pcHomeSigtext.setText(); */

        return root;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}