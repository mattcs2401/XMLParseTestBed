package mcssoft.com.xmlparsetestbed.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import mcssoft.com.xmlparsetestbed.R;
import mcssoft.com.xmlparsetestbed.utility.DataGenerator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataGenerator dg = new DataGenerator(this);
        List list = new ArrayList();
        list = dg.patseForShoppingItemType();

        String bp = "";
    }
}
