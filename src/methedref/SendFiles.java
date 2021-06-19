package methedref;

import java.util.function.Consumer;

public class SendFiles {

    public void sendFile(Consumer<String> fileSender, String filename){

        fileSender.accept(filename);
    }
   public static void main(String args[]){

       SendFiles sendFiles = new SendFiles();
       Panda panda = new Panda();
       Email email = new Email();

       sendFiles.sendFile(panda::sendToPanda,"pandafile");
       sendFiles.sendFile(email::sendEmail,"emailfile");
   }
}
