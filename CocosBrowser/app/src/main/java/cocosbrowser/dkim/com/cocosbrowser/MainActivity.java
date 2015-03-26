package cocosbrowser.dkim.com.cocosbrowser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import cocosbrowser.dkim.com.cocosbrowser.Controllers.SMSReceiver;
import cocosbrowser.dkim.com.cocosbrowser.Data.DataObjects;


public class MainActivity extends Activity{

    SMSReceiver mSMSReceiver;

    WebView mMainWebView;
    Button mGoBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSMSReceiver = new SMSReceiver();

        mMainWebView = (WebView)findViewById(R.id.main_webView);
        mMainWebView.getSettings().setJavaScriptEnabled(true);
        mMainWebView.loadDataWithBaseURL(null, DataObjects.html, DataObjects.mime, DataObjects.encoding, null);

        mGoBtn = (Button)findViewById(R.id.btn_go);
        mGoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSMSReceiver.sendSMS("15192815745", "waddaup");
                //send request and shit
                //then update the webview
                //then update the webview
            }
        });
    }
}
