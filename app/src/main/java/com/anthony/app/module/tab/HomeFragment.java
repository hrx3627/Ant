package com.anthony.app.module.tab;

import android.view.View;

import com.anthony.app.R;
import com.anthony.app.common.base.AbsBaseFragment;
import com.anthony.app.common.injection.component.ActivityComponent;

/**
 * Created by Anthony on 2016/9/12.
 * Class Note:
 * 主页 fragment
 */
public class HomeFragment extends AbsBaseFragment {

    @Override
    protected int getContentViewID() {
        return R.layout.dy_fragment_home;
    }

    @Override
    protected void initDagger2(ActivityComponent activityComponent) {

    }

    @Override
    protected void initViewsAndEvents(View rootView) {

    }
}
