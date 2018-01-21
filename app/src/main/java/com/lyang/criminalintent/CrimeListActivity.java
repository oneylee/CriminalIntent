package com.lyang.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by lyang on 2018/1/3.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
