public class Main {

  public static void main(String[] args) {
    // Teszt esetek
    Post.CurrentPostID = 0;

    Post post = new Post();
    System.out.println(post);

    KepPost KepPost = new KepPost(
      "Beautiful summer",
      true,
      "Admin",
      "summer.jpg"
    );
    System.out.println(KepPost);

    VideoPost videoPost = new VideoPost(
      "Video post",
      false,
      "User",
      "https://vimeo.com/2323",
      63
    );
    System.out.println(videoPost);
  }
}
