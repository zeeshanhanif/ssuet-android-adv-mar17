package httprequestdemoone.springbootandroidapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Ishaq Hassan on 1/28/2018.
 */

public class StudentViewHolder extends RecyclerView.ViewHolder {

    TextView studentNameTv;
    TextView studentEmailTv;

    public StudentViewHolder(View itemView) {
        super(itemView);
        studentNameTv = itemView.findViewById(R.id.studentNameTv);
        studentEmailTv = itemView.findViewById(R.id.studentEmailTv);
    }
}
