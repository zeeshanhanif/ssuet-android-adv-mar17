package comment.ssuet.com.howtocomment;

/**
 * Created by Dell on 3/4/2018.
 */

public class PostModel {
    String key, postholder , postmessage, commentnodekey ;

    public PostModel() {
    }

    public PostModel(String key, String postholder, String postmessage) {
        this.key = key;
        this.postholder = postholder;
        this.postmessage = postmessage;
    }

    public PostModel(String key, String postholder, String postmessage, String commentnodekey) {
        this.key = key;
        this.postholder = postholder;
        this.postmessage = postmessage;
        this.commentnodekey = commentnodekey;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getPostholder() {
        return postholder;
    }

    public void setPostholder(String postholder) {
        this.postholder = postholder;
    }

    public String getPostmessage() {
        return postmessage;
    }

    public void setPostmessage(String postmessage) {
        this.postmessage = postmessage;
    }

    public String getCommentnodekey() {
        return commentnodekey;
    }

    public void setCommentnodekey(String commentnodekey) {
        this.commentnodekey = commentnodekey;
    }
}
