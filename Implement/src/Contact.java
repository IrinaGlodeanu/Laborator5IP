import java.util.Vector;

public class Contact {

  public Integer contactId;

  public Integer getContactId() {
    return contactId;
  }

  public void setContactId(Integer contactId) {
    this.contactId = contactId;
  }

  public String getMsgType() {
    return msgType;
  }

  public void setMsgType(String msgType) {
    this.msgType = msgType;
  }

  public Vector getMyUser() {
    return myUser;
  }

  public void setMyUser(Vector myUser) {
    this.myUser = myUser;
  }

  public String msgType;

  public Vector  myUser;

  public String getContactType( Integer y) {
  return "ceva";
  }

  public boolean send( String m) {
  return false;
  }

}