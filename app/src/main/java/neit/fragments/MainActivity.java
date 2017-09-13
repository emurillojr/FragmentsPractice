package neit.fragments;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import neit.fragments.dummy.DummyContent;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener, ItemFragment.OnListFragmentInteractionListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //myBlankFragment.LoadFragment(id);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {
        Toast toast = Toast.makeText(this, "Value picked is " + item,Toast.LENGTH_LONG);
        toast.show();

        BlankFragment myBlankFragment = (BlankFragment)getSupportFragmentManager().findFragmentById(R.id.blankfragment);
        myBlankFragment.LoadFragmentData(item.toString());
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        Toast toast = Toast.makeText(this, "Value picked is " + uri,Toast.LENGTH_LONG);
        toast.show();

    }
}
