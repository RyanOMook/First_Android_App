package ryanmullings.funfacts;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        //Declare our view variables and assign views from layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.button );
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] facts = {"Teemo is actually satan",  //This is the array of facts
                        "CS is also known as farm or minion gold",
                        "Shaco is actually just a toy doll"};

                // the button was clicked, so update the fact label with a new fact
                String fact = "";
                //Randomly select a fact
                Random randomGen = new Random(); //construct a new random generator
                int randomNumber = randomGen.nextInt(facts.length); //Random 3 numbers
                fact = facts[randomNumber];



                //Update the label with a dynamic fact
                factLabel.setText(fact);
            }
        };

        showFactButton.setOnClickListener(listener); //listens for a button to be clicked
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
