package model;

public class ProfilePhoto {
	
	protected String url;
	protected int likes;
	
	public ProfilePhoto(){
		url="";
		likes=0;
	}
	
	public void addLike(){
		likes++;
	}
	
	public void setPhoto(String url){
		this.url=url;
	}

}
