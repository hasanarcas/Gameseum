package hasanhakan.gameseum;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ReviewsFragment extends Fragment {

    private Toolbar toolbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_reviews, container, false);

        toolbar = getActivity().findViewById(R.id.toolbar);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        for (int i = 1; i < toolbar.getChildCount() - 1; i++) {
            if (toolbar.getChildAt(i).getVisibility() == View.VISIBLE) {
                Log.d("page number", String.valueOf(i));
                toolbar.getChildAt(i).setVisibility(View.GONE);
            }
        }
        toolbar.findViewById(R.id.reviews_bar).setVisibility(View.VISIBLE);
    }
}