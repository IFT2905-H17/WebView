package ca.umontreal.iro.hurtubin.webview;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);

        final WebView webView = (WebView) findViewById(R.id.web_view);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                webView.loadUrl("http://perdu.com");
            }
        });

        Button navigator = (Button) findViewById(R.id.button_navigator);

        navigator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("tel:5141234567");

                Intent intent = new Intent(Intent.ACTION_DIAL, uri);

                startActivity(intent);
            }
        });
    }
}
