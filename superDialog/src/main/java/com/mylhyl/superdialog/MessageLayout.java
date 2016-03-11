package com.mylhyl.superdialog;

import android.content.Context;

import com.mylhyl.superdialog.callback.ProviderHeader;
import com.mylhyl.superdialog.res.drawable.BgLayout;
import com.mylhyl.superdialog.res.values.ColorRes;
import com.mylhyl.superdialog.view.DividerView;

/**
 * Created by hupei on 2016/3/8 13:40.
 */
final class MessageLayout extends DimenLinearLayout {

    public MessageLayout(Context context, SuperDialog.Builder builder) {
        super(context);
        init(builder);
    }

    private void init(SuperDialog.Builder builder) {
        setOrientation(VERTICAL);

        ProviderHeader providerHeader = builder.getProviderHeader();

        if (providerHeader != null) {
            HeaderView titleView = new HeaderView(getContext(), providerHeader);
            addView(titleView);
        }
        ContentSingleView contentView = new ContentSingleView(getContext(),builder);
        addView(contentView);

        //添加消息与底部分隔线
        DividerView dividerViewV = new DividerView(getContext());
        dividerViewV.setVertical();
        addView(dividerViewV);
        //底部按钮
        FooterView footerView = new FooterView(getContext(), builder);
        addView(footerView);
    }
}