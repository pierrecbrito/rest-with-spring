package br.com.pierrecbrito;

public class Greeting {
	private final long id;
	private String content;
	
	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}
	
	public long getId() {
		return id;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Greeting [id=" + id + ", content=" + content + "]";
	}
}
