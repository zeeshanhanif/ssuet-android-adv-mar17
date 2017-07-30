package recycler.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ishaq Hassan on 7/30/2017.
 */

public class MyCustomViewHolder extends RecyclerView.ViewHolder {

    TextView studentName;
    TextView studentAge;
    TextView studentSubject;
    ImageView imageView;

    public MyCustomViewHolder(View itemView) {
        super(itemView);
        studentName = (TextView) itemView.findViewById(R.id.studentName);
        studentAge = (TextView) itemView.findViewById(R.id.studentAge);
        studentSubject = (TextView) itemView.findViewById(R.id.studentSubject);
        imageView = (ImageView) itemView.findViewById(R.id.studentImage);
    }
}
