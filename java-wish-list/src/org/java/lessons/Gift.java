package org.java.lessons;

public class Gift {

	private String name;
	private String recipient;
	
	Gift(String name, String recipient) {
		setName(name);
		setRecipient(recipient);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	
	@Override
	public String toString() {
		return "Nome regalo: " + getName() + "\nDestinatario: " + getRecipient();
	}
}
