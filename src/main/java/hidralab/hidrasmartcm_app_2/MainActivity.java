package hidralab.hidrasmartcm_app_2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javafxports.android.FXActivity;
import javafxports.android.FXFragment;

public class MainActivity extends FXActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.container, new PlaceholderFragment());
            fragmentTransaction.addToBackStack(null);
            // Commit the transaction
            fragmentTransaction.commit();
        }
    }
    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends FXFragment {

        public PlaceholderFragment() {
            String fxapp = "hidralab.hidrasmartcm_app_2.MyFxApp";
            this.setName(fxapp);

        }
    }
}
