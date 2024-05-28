public class VideoPost extends Post {

  private String VideoURL;
  private int Length;

  public VideoPost() {
    super();
    this.VideoURL = "";
    this.Length = 0;
  }

  public VideoPost(
    String title,
    boolean isPublic,
    String sendByUsername,
    String videoURL,
    int length
  ) {
    this.ID = GetNextID();
    this.Title = title;
    this.IsPublic = isPublic;
    this.SendByUsername = sendByUsername;
    this.VideoURL = videoURL;
    this.Length = length;
  }

  @Override
  public String toString() {
    return super.toString() + " - Video (" + Length + "): " + VideoURL;
  }
}
