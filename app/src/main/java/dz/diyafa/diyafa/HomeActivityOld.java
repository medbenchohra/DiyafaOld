package dz.diyafa.diyafa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HomeActivityOld extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_old);
        // Construct the data source
        ArrayList<PostGive> arrayOfPostGives = new ArrayList<>();
        PostGive p=new PostGive("Chorba", "Algeria","Algiers", "15min", "3people");
        arrayOfPostGives.add(p);
        p=new PostGive("Egyptian food", "Egypt","Cairo", "15min", "2people");
        arrayOfPostGives.add(p);
        p=new PostGive("REPAT", "Morocco","Casablanca", "50min", "3people");
        arrayOfPostGives.add(p);
        p=new PostGive("Chorba", "Algeria","Algiers", "30min", "1person");
        arrayOfPostGives.add(p);
        p=new PostGive("Chorba", "Algeria","Algiers", "15min", "3people");
        arrayOfPostGives.add(p);
        p=new PostGive("Chorba", "Algeria","Algiers", "15min", "3people");
        arrayOfPostGives.add(p);
        p=new PostGive("Chorba", "Algeria","Algiers", "15min", "3people");
        arrayOfPostGives.add(p);
        p=new PostGive("Chorba", "Algeria","Algiers", "15min", "3people");
        arrayOfPostGives.add(p);
        // Create the adapter to convert the array to views
        PostGiveAdapter adapter = new PostGiveAdapter(this, arrayOfPostGives);
    // Attach the adapter to a ListView
        ListView listView = findViewById(R.id.timeline);
        listView.setAdapter(adapter);

        //Create the listener
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){

                    public void onItemClick(AdapterView<?> listDrinks,
                                            View itemView,
                                            int position,
                                            long id) {
                        //Pass the drink the user clicks on to DrinkActivity
                        Intent intent = new Intent(HomeActivityOld.this, PostGiveActivity.class);
                        intent.putExtra(PostGiveActivity.EXTRA_POST_ID, (int) id);
                        startActivity(intent);
                    }

                };

        listView.setOnItemClickListener(itemClickListener);
    }
}
