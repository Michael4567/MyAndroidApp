package com.mkyong.android;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends Activity {

	private WebView webView;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview);

		webView = (WebView) findViewById(R.id.webView1);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl("http://www.google.com");
		//webView.loadUrl("http://10.0.2.2:80/LogoutSuccesstl.html");
		//webView.loadUrl("http://10.0.0.8:80/LogoutSuccesstl.html");

		//String customHtml = "<html><body><h1>Hello, WebView</h1></body></html>";
		//webView.loadData(customHtml, "text/html", "UTF-8");

	}

}