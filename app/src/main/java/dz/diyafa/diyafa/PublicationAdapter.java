package dz.diyafa.diyafa;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class PublicationAdapter extends ArrayAdapter<Publication> {


    public PublicationAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }
}
