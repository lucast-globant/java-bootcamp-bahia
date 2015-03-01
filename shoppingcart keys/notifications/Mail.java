package topic1.notifications;

public class Mail {

	private String destinatary; 
	private String subject; 
	private String bodyMesage;
	
	public Mail(String destinatary, String subject, String bodyMesage) {
		super();
		this.destinatary = destinatary;
		this.subject = subject;
		this.bodyMesage = bodyMesage;
	}

	public String getDestinatary() {
		return destinatary;
	}

	public void setDestinatary(String destinatary) {
		this.destinatary = destinatary;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBodyMesage() {
		return bodyMesage;
	}

	public void setBodyMesage(String bodyMesage) {
		this.bodyMesage = bodyMesage;
	}
	
}
