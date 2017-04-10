import java.util.Date;
import java.util.Vector;

public class Message {

  public Integer idMessage;

  public String type;

  public boolean isSent;

  public User receiver;

  public Date date;

  public Vector  myNotification;


  public Message(Integer idMessage, String type) {
    this.idMessage = idMessage;
    this.type = type;
  }


  public Integer getIdMessage() {
    return idMessage;
  }

  public void setIdMessage(Integer idMessage) {
    this.idMessage = idMessage;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}