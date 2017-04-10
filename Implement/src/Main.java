/**
 * Created by pc on 4/10/2017.
 */
public class Main {

    public static void main(String[] args) {



            Notification tmp = Notification.getInstance( );
           tmp.setIdNotification(23);

            Notification tmp2 = Notification.getInstance( );
            tmp2.setIdNotification(66);
            tmp.demoMethod( tmp.getIdNotification().toString() );

            tmp2.demoMethod( tmp2.getIdNotification().toString() );


            //Message message= new Message( 3, "email");

    }
}
