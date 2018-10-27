package live.wallpaper.xanzo.com.livewallpaperandroid.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import live.wallpaper.xanzo.com.livewallpaperandroid.R;


public class DailyPopularFragment extends Fragment {

    private static DailyPopularFragment INSTANCE = null;

    public DailyPopularFragment() {
        // Required empty public constructor
    }

    public static DailyPopularFragment getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DailyPopularFragment();
        }
        return INSTANCE;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_daily_popular, container, false);
    }

}