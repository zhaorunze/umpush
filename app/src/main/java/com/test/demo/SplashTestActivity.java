package com.test.demo;


import com.umeng.message.inapp.InAppMessageManager;
import com.umeng.message.inapp.UmengSplashMessageActivity;

public class SplashTestActivity extends UmengSplashMessageActivity {

    @Override
    public boolean onCustomPretreatment() {
        InAppMessageManager mInAppMessageManager = InAppMessageManager.getInstance(this);
        mInAppMessageManager.setInAppMsgDebugMode(true);
        mInAppMessageManager.setMainActivityPath("com.test.demo.MainActivity");
        return super.onCustomPretreatment();
    }
}
