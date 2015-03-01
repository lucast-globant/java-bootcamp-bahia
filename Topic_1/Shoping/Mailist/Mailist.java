package Mailist;

import java.util.ArrayList;
import java.util.List;

import Observer.Observer;

public class Mailist implements Observer {
	private List<String> emails;

	public Mailist() {
		this.emails = new ArrayList<String>();
	}

	public Mailist(List<String> emails) {
		this.emails = emails;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public void addEmail(String email) {
		this.emails.add(email);
	}

	public void update(String msg) {
		for (String s : emails) {
			System.out.print(s + ": " + msg);
		}
	}

}
