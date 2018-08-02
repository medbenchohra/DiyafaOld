package dz.diyafa.diyafa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




//        // Read from the database
//        myRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                // This method is called once with the initial value and again
//                // whenever data at this location is updated.
//                String value = dataSnapshot.getValue(String.class);
//                Log.d("main", "Value is: " + value);
//            }
//
//            @Override
//            public void onCancelled(DatabaseError error) {
//                // Failed to read value
//                Log.w("main", "Failed to read value.", error.toException());
//            }
//        });
    }

    public void onLogIn(View view) {
        EditText userName = findViewById(R.id.user_name);
        EditText password = findViewById(R.id.password);
        User user =new User(userName.getText().toString(),password.getText().toString());
        Intent intent=new Intent(MainActivity.this,HomeActivity.class);
        startActivity(intent);



    }
}
