package testing.com.au.xwalkembedlibcrosswalk;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.LinearLayout;

import org.xwalk.core.XWalkView;


public class XWalkEmbedLib extends ActionBarActivity {

    private LinearLayout commentsLayout;
    private XWalkView xWalkWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xwalk_embed_lib);
        commentsLayout=(LinearLayout)findViewById(R.id.principal);

        String url = "https://apprtc.appspot.com/";

        xWalkWebView = new XWalkView(this.getApplicationContext(), this);
        ///xWalkWebView.loadUrl("file:///android_asset/www/index.html");
        //xWalkWebView.load("file:///android_asset/www/index.html", null);
        xWalkWebView.load(url, null);
        commentsLayout.addView(xWalkWebView);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_xwalk_embed_lib, menu);
        return true;
    }


}
