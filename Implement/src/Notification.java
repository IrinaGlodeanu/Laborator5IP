import java.util.Vector;

public class Notification {


  public Integer getIdNotification() {
    return idNotification;
  }

  private static Notification instance = new Notification( );

  public Integer idNotification;

  public Message body;

  public boolean isSent;

  public Integer users;

    public Vector  myUser;
    public Vector  myMessage;

  public boolean isSent( Integer x) {
  return false;
  }

  public void displayMessage(String lala) {
    System.out.println(lala);
  }

  private Notification(){

  }

  public static Notification getInstance() {

    return instance;
  }


  protected static void demoMethod( String lala ) {

    System.out.println(lala);
  }


  public void setBody(Message body) {
    this.body = body;
  }

  public void setIdNotification(Integer idNotification) {
    this.idNotification = idNotification;
  }



}