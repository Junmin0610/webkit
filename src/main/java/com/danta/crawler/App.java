package com.danta.crawler;

import io.webfolder.ui4j.api.browser.BrowserEngine;
import io.webfolder.ui4j.api.browser.BrowserFactory;
import io.webfolder.ui4j.api.browser.Page;
public class App {
	public static void main(String[] args) throws InterruptedException {
		BrowserEngine browser = BrowserFactory.getWebKit();

		// navigate to blank page
		Page page = browser.navigate("https://www.bithumb.com/");
//		Page page = browser.navigate("https://search.naver.com/search.naver?query=%EB%B9%84%ED%8A%B8%EC%BD%94%EC%9D%B8&where=news&ie=utf8&sm=nws_hty");
		// show the browser page
		page.show();
		while (true) {
//			page.getDocument().queryAll("ul.type01").forEach(e -> {
//				System.out.println(e.getText().get());
//			});
			page.getDocument().queryAll("tbody#contractTable").forEach(e -> {
				System.out.println(e.getText().get());
			});
			Thread.sleep(6000);
		}
//		page.close();
	}
}
