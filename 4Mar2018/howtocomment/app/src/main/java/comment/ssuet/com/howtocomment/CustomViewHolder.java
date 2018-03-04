package comment.ssuet.com.howtocomment;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Dell on 3/4/2018.
 */

public class CustomViewHolder extends RecyclerView.ViewHolder {
    TextView name, comment;

    public CustomViewHolder(View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
        comment = itemView.findViewById(R.id.comment);
    }
}
