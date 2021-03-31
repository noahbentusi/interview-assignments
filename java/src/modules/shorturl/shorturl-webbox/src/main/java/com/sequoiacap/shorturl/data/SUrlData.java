package com.sequoiacap.shorturl.data;

import com.sequoiacap.shorturl.model.SUrl;

public class SUrlData {
	private String shortUrl;
	private String url;
	
	public String getShortUrl() {
		return shortUrl;
	}
	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public static SUrlData valueOf(SUrl surl)
	{
		if (surl == null)
			return null;

		SUrlData data = new SUrlData();
		
		data.setShortUrl(surl.getShortUrl());
		data.setUrl(surl.getUrl());
		
		return data;
	}
}
