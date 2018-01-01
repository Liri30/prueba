package ManejoWeb;


import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class enviarMailFoto {

    public void enviar(String destinatario,String asunto, String titulo,String cuerpo) {
        // Recipient's email ID needs to be mentioned.
//        String to = "manuelliriano.ml@gmail.com";
//
//        // Sender's email ID needs to be mentioned
//        String from = "epacore@gmail.com";
//        final String username = "epacore@gmail.com";//change accordingly
//        final String password = "economicpower";//change accordingly
        ///String destinatario = "manuelliriano.ml@gmail.com";
        String remitente = "epacore2@gmail.com";
        String clave = "economicpower";

        System.out.println("Estamos en la funcion");

        // Assuming you are sending email through relay.jangosmtp.net
//        String host = "gmail.com";

        Properties props = System.getProperties();
        props.put("mail.smtp.host", "smtp.gmail.com");  //El servidor SMTP de Google
        props.put("mail.smtp.user", remitente);
        props.put("mail.smtp.clave", clave);    //La clave de la cuenta
        props.put("mail.smtp.auth", "true");    //Usar autenticación mediante usuario y clave
        props.put("mail.smtp.starttls.enable", "true"); //Para conectar de manera segura al servidor SMTP
        props.put("mail.smtp.port", "587"); //El puerto SMTP seguro de Google

//        Session session = Session.getInstance(props,
//                new javax.mail.Authenticator() {
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication(username, password);
//                    }
//                });

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);
        try {

//            // Create a default MimeMessage object.
//            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(remitente));
            message.addRecipients(Message.RecipientType.TO, destinatario);
            message.setSubject(asunto);
            // Set From: header field of the header.
//            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
//            message.setRecipients(Message.RecipientType.TO,
//                    InternetAddress.parse(to));

            // Set Subject: header field
//            message.setSubject("Haciendo prueba");

            // This mail has 2 part, the BODY and the embedded image
            MimeMultipart multipart = new MimeMultipart("related");

            // first part (the html)
            BodyPart messageBodyPart = new MimeBodyPart();
            String htmlText = "<H1>"+titulo+"</H1><h3>"+cuerpo+"</h3><img src=\"cid:image\">";
            messageBodyPart.setContent(htmlText, "text/html");
            // add it
            multipart.addBodyPart(messageBodyPart);

            // second part (the image)
            messageBodyPart = new MimeBodyPart();
            DataSource fds = new FileDataSource(
                    "C:\\Users\\Manuel Liriano\\IdeaProjects\\epa9\\src\\main\\resources\\img\\test.PNG");

            messageBodyPart.setDataHandler(new DataHandler(fds));
            messageBodyPart.setHeader("Content-ID", "<image>");

            // add image to the multipart
            multipart.addBodyPart(messageBodyPart);

            // put everything together
            message.setContent(multipart);
            // Send message
           // Transport.send(message);
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com",remitente,clave);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();

            System.out.println("Sent message successfully....");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }


}
