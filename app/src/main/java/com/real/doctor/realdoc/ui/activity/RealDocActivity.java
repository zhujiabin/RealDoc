package com.real.doctor.realdoc.ui.activity;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.real.doctor.realdoc.R;
import com.real.doctor.realdoc.base.BaseActivity;
import com.real.doctor.realdoc.fragment.HomeFragment;
import com.real.doctor.realdoc.fragment.ShopFragment;
import com.real.doctor.realdoc.fragment.TypeFragment;
import com.real.doctor.realdoc.fragment.UserFragment;
import com.real.doctor.realdoc.ui.adapter.FragPagerAdapter;
import com.real.doctor.realdoc.util.UIUtils;
import com.real.doctor.realdoc.widget.IconFontTextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RealDocActivity extends BaseActivity {

    @BindView(R.id.viewpager)
    ViewPager viewPager;
    @BindView(R.id.if_home)
    IconFontTextView ifHome;
    @BindView(R.id.tv_home)
    TextView tvHome;
    @BindView(R.id.ll_home)
    LinearLayout llHome;
    @BindView(R.id.if_shop)
    IconFontTextView ifShop;
    @BindView(R.id.tv_shop)
    TextView tvShop;
    @BindView(R.id.ll_shop)
    LinearLayout llShop;
    @BindView(R.id.if_type)
    IconFontTextView ifType;
    @BindView(R.id.tv_type)
    TextView tvType;
    @BindView(R.id.ll_type)
    LinearLayout llType;
    @BindView(R.id.if_user)
    IconFontTextView ifUser;
    @BindView(R.id.tv_user)
    TextView tvUser;
    @BindView(R.id.ll_user)
    LinearLayout llUser;

    private List<Fragment> mFragments = new ArrayList<>();

    @Override
    public int getLayoutId() {
        return R.layout.activity_real_doc;
    }

    @Override
    public void initView() {
        ButterKnife.bind(this);
    }

    @Override
    public void initData() {
        setTabColor(ifHome, tvHome);
        mFragments.add(HomeFragment.newInstance());
        mFragments.add(ShopFragment.newInstance());
        mFragments.add(TypeFragment.newInstance());
        mFragments.add(UserFragment.newInstance());
        viewPager.setAdapter(new FragPagerAdapter(getSupportFragmentManager(), mFragments));
        viewPager.setCurrentItem(0, false);
        viewPager.setOffscreenPageLimit(4);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        setTabColor(ifHome, tvHome);
                        break;
                    case 1:
                        setTabColor(ifShop, tvShop);
                        break;
                    case 2:
                        setTabColor(ifType, tvType);
                        break;
                    case 3:
                        setTabColor(ifUser, tvUser);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public void initEvent() {

    }

    @Override
    @OnClick({R.id.ll_home,R.id.ll_shop, R.id.ll_type,R.id.ll_user})
    public void widgetClick(View v) {
        switch (v.getId()) {
            case R.id.ll_home:
                viewPager.setCurrentItem(0);
                setTabColor(ifHome, tvHome);
                break;
            case R.id.ll_shop:
                viewPager.setCurrentItem(1);
                setTabColor(ifShop, tvShop);
                break;
            case R.id.ll_type:
                viewPager.setCurrentItem(2);
                setTabColor(ifType, tvType);
                break;
            case R.id.ll_user:
                viewPager.setCurrentItem(3);
                setTabColor(ifUser, tvUser);
                break;

        }
    }

    @Override
    public void doBusiness(Context mContext) {

    }
    private void setTabColor(IconFontTextView icon, TextView textView) {
        ifHome.setTextColor(UIUtils.getColor(R.color.tab_nor_color));
        tvHome.setTextColor(UIUtils.getColor(R.color.tab_nor_color));
        ifShop.setTextColor(UIUtils.getColor(R.color.tab_nor_color));
        tvShop.setTextColor(UIUtils.getColor(R.color.tab_nor_color));
        ifType.setTextColor(UIUtils.getColor(R.color.tab_nor_color));
        tvType.setTextColor(UIUtils.getColor(R.color.tab_nor_color));
        ifUser.setTextColor(UIUtils.getColor(R.color.tab_nor_color));
        tvUser.setTextColor(UIUtils.getColor(R.color.tab_nor_color));
        icon.setTextColor(UIUtils.getColor(R.color.tab_sel_color));
        textView.setTextColor(UIUtils.getColor(R.color.tab_sel_color));
    }
}
