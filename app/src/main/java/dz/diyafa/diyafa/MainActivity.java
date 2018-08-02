package dz.diyafa.diyafa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;

import static dz.diyafa.diyafa.Constants.*;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();
    private final FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference ref = database.getReference("");
    private HashMap<String, String> existingUsers = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        writeNewUser("mohamed","pass");

//        DatabaseReference df =  mDatabase.child("users").push();


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

    public void onPost(View view) {

        for (int i = 1; i <= 100; i++) {
            String neededCollaborators = String.valueOf(i%10);
            String timeSinceCooked = (11*(i%10+1)) + "m";
            String location = "Hotel " + i;
            String meal = "Meal " + i;
            String mealOrigin = "Origin " + i;
            String publisherID = (String)existingUsers.values().toArray()[i-1];
            String quantity = String.valueOf(i%10);

            PostCollaboration postCollaboration = new PostCollaboration(neededCollaborators,
                    timeSinceCooked, location, meal, mealOrigin, publisherID, quantity);

            DatabaseReference usersRef = ref.child("postsCollabotaion").push();
            String id = usersRef.getKey();
            postCollaboration.setId(id);
            Log.d("fffffffffffff", "onPost, id : "+id);
            usersRef.setValue(postCollaboration);
        }
    }

    public void onLogIn(View view) {
        String userName = findViewById(R.id.user_name).toString();
        String password = findViewById(R.id.password).toString();

        if(existingUsers.containsKey(userName));
    }

    public void onSignUp(View view) {
//        String userName = findViewById(R.id.user_name).toString();
//        String password = findViewById(R.id.password).toString();
//        String firstName = findViewById(R.id.firstname).toString();
//        String lastName = findViewById(R.id.lastname).toString();
//        String email = findViewById(R.id.email).toString();
//        String country = findViewById(R.id.country).toString();
//        String region = findViewById(R.id.region).toString();
//        String phone = findViewById(R.id.phone).toString();
//        String residence = findViewById(R.id.residence).toString();

        HashMap<String,Boolean> medicalInformation = new HashMap<>();

//        medicalInformation.put(DIABETES,);
//        medicalInformation.put(BLOOD_PRESSURE,);
//        medicalInformation.put(ALLERGIES,);


        for (int i = 1; i <= 100; i++) {

            String userName = "userName" + i;
            String password = "password" + i;
            String firstName = "firstName" + i;
            String lastName = "lastName" + i;
            String email = "email" + i;
            String country = "country" + i;
            String region = "region" + i;
            String phone = "phone" + i;
            String residence = "residence" + i;

            User user = new User(userName, password, firstName,lastName, medicalInformation,
                    email, country, region, phone, residence);

            if (!existingUsers.containsKey(userName)) {
                DatabaseReference usersRef = ref.child("users").push();
                String id = usersRef.getKey();
                user.setId(id);
                Log.d("ggggggggg", "onSignUp, id : "+id);
                usersRef.setValue(user);
                existingUsers.put(userName,id);
            }
        }

        onPost(view);

    }

//    private void writeNewUser(String userName, String password, String firstname, String lastname,
//                              ) {
//        mDatabase.child("users").child(userName).child("password").setValue(password);
//    }
}
