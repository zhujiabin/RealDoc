package com.real.doctor.realdoc.base;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author zhujiabin
 * @package com.example.administrator.ruiyi.basecls
 * @fileName ${Name}
 * @Date 2018-1-4 0004
 * @describe TODO
 * @email zhujiabindragon@163.com
 */

public abstract class BaseFragment extends Fragment implements View.OnClickListener {

    protected final String TAG = this.getClass().getSimpleName();
    private View mContextView = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mContextView = inflater.inflate(getLayoutId(), container, false);
        initView(mContextView);
        doBusiness(getActivity());
        return mContextView;
    }
    /**
     * [绑定布局]
     *
     * @return
     */
    public abstract int getLayoutId();

    /**
     * [初始化控件]
     *
     * @param view
     */
    public abstract void initView(final View view);

    /**
     * [业务操作]
     *
     * @param mContext
     */
    public abstract void doBusiness(Context mContext);

    /** View点击 **/
    public abstract void widgetClick(View v);

    @Override
    public void onClick(View v) {
        if (fastClick()) {
            widgetClick(v);
        }
    }

    @SuppressWarnings("unchecked")
    public <T extends View> T $(View view, int resId) {
        return (T) view.findViewById(resId);
    }

    /**
     * [防止快速点击]
     *
     * @return
     */
    private boolean fastClick() {
        long lastClick = 0;
        if (System.currentTimeMillis() - lastClick <= 1000) {
            return false;
        }
        lastClick = System.currentTimeMillis();
        return true;
    }
}
