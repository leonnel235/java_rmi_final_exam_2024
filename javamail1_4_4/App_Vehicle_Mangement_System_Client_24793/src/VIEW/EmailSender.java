package VIEW;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.Random;

public class EmailSender {

    private final String username;
    private final String password;

    public EmailSender(String username, String password) {
        this.username = username;
        this.password = password;
    }

    boolean sendEmail(String recipientEmail, String subject, String messageBody) {
        // SMTP server configuration
        String host = "smtp.gmail.com"; // Replace with your SMTP server hostname
        int port = 587; // SMTP port (usually 587 for TLS)

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);
        props.put("mail.smtp.ssl.protocols", "TLSv1.2 TLSv1.1 TLSv1"); // Correct format for enabling specific TLS protocols

        // Create a session with authentication
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Create a new email message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject(subject);
            message.setText(messageBody);

            // Send the email
            Transport.send(message);
            System.out.println("Email sent successfully to " + recipientEmail);
            return true;
        } catch (MessagingException e) {
            e.printStackTrace();
            System.err.println("Error sending email: " + e.getMessage());
            return false;
        }
    }

    public String generateOTP(int len) {
        String numbers = "0123456789";
        Random rndm_method = new Random();
        StringBuilder otp = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            otp.append(numbers.charAt(rndm_method.nextInt(numbers.length())));
        }
        return otp.toString();
    }

    public static void main(String[] args) {
        String senderEmail = "mbaiaoussemd@gmail.com"; // Replace with your email address
        String senderPassword = "enqr rfam kgdf rtjh"; // Replace with your email password
        EmailSender emailSender = new EmailSender(senderEmail, senderPassword);

        String recipientEmail = "mbaiaoussemd@gmail.com"; // Replace with the recipient's email address
        String subject = "Your OTP";
        String otp = emailSender.generateOTP(6); // Generate a 6-digit OTP

        emailSender.sendEmail(recipientEmail, subject, "Your OTP is: " + otp);
    }
}
