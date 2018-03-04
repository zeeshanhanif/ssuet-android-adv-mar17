package comment.ssuet.com.howtocomment;

/**
 * Created by Dell on 3/4/2018.
 */

public class CommentModel {

    String name;
    String comment;

    public CommentModel() {
    }

    public CommentModel(String name, String comment) {
        this.name = name;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
