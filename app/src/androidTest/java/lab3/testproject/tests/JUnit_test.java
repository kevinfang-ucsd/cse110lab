package lab3.testproject.tests;

import lab3.testproject.MainActivity;
import lab3.testproject.R;

import android.test.ActivityInstrumentationTestCase2;
import android.text.style.TextAppearanceSpan;
import android.widget.TextView;

/**
 * Created by kevin on 4/18/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public JUnit_test() {
        super(MainActivity.class);
    }

    public void test_first() {
        mainActivity = getActivity();
        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Bye World", tester);
    }
}
