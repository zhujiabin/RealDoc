package com.real.doctor.realdoc.fragment;

import android.content.Context;
import android.view.View;

import com.real.doctor.realdoc.R;
import com.real.doctor.realdoc.base.BaseFragment;

/**
 * user：lqm
 * desc：第四个模块，用户模块
 */

public class UserFragment extends BaseFragment {

    public static UserFragment newInstance() {
        return new UserFragment();
    }

    @Override
    public int getLayoutId() {
        return R.layout.frag_user;
    }

    @Override
    public void initView(View view) {

    }

    @Override
    public void doBusiness(Context mContext) {

    }

    @Override
    public void widgetClick(View v) {

    }
}
