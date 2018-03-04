package comment.ssuet.com.howtocomment;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Dell on 3/4/2018.
 */

public class PostViewHolder extends RecyclerView.ViewHolder {
    TextView tvname, tvmessage;
    EditText commes;
    Button commentbtn;
    RecyclerView list;
    public PostViewHolder(View itemView) {
        super(itemView);

        tvname = itemView.findViewById(R.id.userposted);
        tvmessage = itemView.findViewById(R.id.tvpostmessage);
        commes = itemView.findViewById(R.id.commes);
        commentbtn = itemView.findViewById(R.id.commentbtn);
        list = itemView.findViewById(R.id.mycomments);
    }
}
