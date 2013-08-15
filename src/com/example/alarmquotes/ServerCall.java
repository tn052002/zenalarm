package com.example.alarmquotes;

public class ServerCall {

	String Category;
	String  quote;
	static final String serverUrl="";
	
	public ServerCall() {
		quote = "This is the text";
	}
	
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	
	
	
}
