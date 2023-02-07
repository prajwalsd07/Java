package com.demo.buildermethod;

/**
 * Email email = Email.EmailBuilder()
              .setFrom("Test@gmail.com")
              .setTo("mail@gmail.com")
              .setSubject("Test with only required Fields")
              .setContent(" Required Field Test").build();
 * @author mohta
 *
 */
public class Email {

	private String email;
	private String subject;
	private String content;

	public Email(EmailBuilder emailBuilder) {
		this.email= emailBuilder.email;
		this.content = emailBuilder.content;
		this.subject = emailBuilder.subject;
	}
	
	
	static class EmailBuilder
	{
		private String email;
		private String subject;
		private String content;

		public EmailBuilder() {

		}
		
		public EmailBuilder setFrom(String email)
		{
			this.email = email;
			return this;
		}
		public EmailBuilder setTo(String email)
		{
			this.email = email;
			return this;
		}
		public EmailBuilder setContent(String content)
		{
			this.content = content;
			return this;
		}
		public EmailBuilder setSubject(String subject)
		{
			this.subject = subject;
			return this;
		}
	
		
		@Override
		public String toString() {
			return "EmailBuilder [email=" + email + ", subject=" + subject + ", content=" + content + "]";
		}

		public Email build()
		{
			return new Email(this);
		}
	}
}
