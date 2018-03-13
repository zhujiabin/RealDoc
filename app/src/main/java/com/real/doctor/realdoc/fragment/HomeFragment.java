package com.real.doctor.realdoc.fragment;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.real.doctor.realdoc.R;
import com.real.doctor.realdoc.base.BaseFragment;
import com.real.doctor.realdoc.model.BannerBean;

import java.util.List;

import butterknife.BindView;
import cn.bingoogolapple.bgabanner.BGABanner;

/**
 * user：lqm
 * desc：第一个模块，主页Fragment
 */

public class HomeFragment extends BaseFragment {

    @BindView(R.id.recyclerview)
    RecyclerView mRecyclerView;
    @BindView(R.id.banner)
    BGABanner mBannerView;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public int getLayoutId() {
        return R.layout.frag_home;
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

    /**
     * 轮播图获得数据
     */
//    @Override
    public void getBannerDataSuccess(List<BannerBean> bannerData) {
        //设置轮播图
        mBannerView.setData(R.layout.item_banner, bannerData, null);
        mBannerView.setAdapter(new BGABanner.Adapter<View, BannerBean>() {
            @Override
            public void fillBannerItem(BGABanner banner, View itemView, BannerBean model, int position) {
                ImageView imageView = (ImageView) itemView.findViewById(R.id.round_image);
//                ImageLoaderManager.LoadImage(getContext(), model.getImagePath(), imageView);
            }
        });
        mBannerView.setDelegate(new BGABanner.Delegate<View, BannerBean>() {
            @Override
            public void onBannerItemClick(BGABanner banner, View itemView, BannerBean model, int position) {
//                WebViewActivity.runActivity(getContext(), model.getUrl());
            }
        });
    }
}
