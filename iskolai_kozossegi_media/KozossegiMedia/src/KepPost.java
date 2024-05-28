public class KepPost extends Post {

  private String ImageURL;

  public KepPost() {
    super();
    this.ImageURL = "";
  }

  public KepPost(
    String title,
    boolean isPublic,
    String sendByUsername,
    String imageURL
  ) {
    this.ID = GetNextID();
    this.Title = title;
    this.IsPublic = isPublic;
    this.SendByUsername = sendByUsername;
    this.ImageURL = imageURL;
  }

  @Override
  public String toString() {
    return super.toString() + " - Image: " + ImageURL;
  }
}
