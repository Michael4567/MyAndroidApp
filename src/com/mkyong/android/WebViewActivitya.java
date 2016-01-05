/**
 * 
 */
package com.mkyong.android;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * @author Mikes
 *
 */
public class WebViewActivitya extends Activity {

	private WebView webView2;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview2);

		webView2 = (WebView) findViewById(R.id.webView2);
		webView2.getSettings().setJavaScriptEnabled(true);
		webView2.loadUrl("http://www.youtube.com");
		//webView.loadUrl("http://10.0.2.2:80/LogoutSuccesstl.html");
		//webView.loadUrl("http://10.0.0.8:80/LogoutSuccesstl.html");

		//String customHtml = "<html><body><h1>Hello, WebView</h1></body></html>";
		//webView.loadData(customHtml, "text/html", "UTF-8");

	}

}
