public class Post {

  protected static int CurrentPostID;
  protected int ID;
  protected String Title;
  protected String SendByUsername;
  protected boolean IsPublic;

  public Post() {
    this.ID = 0;
    this.Title = "My first post";
    this.IsPublic = true;
    this.SendByUsername = "admin";
  }

  public Post(String title, boolean isPublic, String sendByUsername) {
    this.ID = GetNextID();
    this.Title = title;
    this.IsPublic = isPublic;
    this.SendByUsername = sendByUsername;
  }

  protected static int GetNextID() {
    return ++CurrentPostID;
  }

  public void Update(String title, boolean isPublic) {
    this.Title = title;
    this.IsPublic = isPublic;
  }

  @Override
  public String toString() {
    return ID + " - " + Title + " - by " + SendByUsername;
  }
}
