package jsonexampleone.firebasedemoone.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import jsonexampleone.firebasedemoone.R;

/**
 * Created by Ishaq Hassan on 11/5/2017.
 */

public class PagerViewHolder extends RecyclerView.ViewHolder{
    public TextView userNameTv;

    public PagerViewHolder(View itemView) {
        super(itemView);
        userNameTv = itemView.findViewById(R.id.userNameTv);
    }
}
