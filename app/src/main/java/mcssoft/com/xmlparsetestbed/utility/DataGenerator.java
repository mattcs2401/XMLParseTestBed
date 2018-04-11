package mcssoft.com.xmlparsetestbed.utility;

import android.content.Context;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import mcssoft.com.xmlparsetestbed.database.entity.ShoppingItemType;

/**
 * Simple utility to load app related data on app first run.
 */
public class DataGenerator {

    public DataGenerator(Context context) {

        try {
            is = context.getAssets().open("reference_values.xml");

        } catch (Exception ex) {

        }
    }

    public static List<ShoppingItemType> patseForShoppingItemType() {
        List<ShoppingItemType> list = new ArrayList<>();
        try {
            XmlParser xmlParser = new XmlParser(is);
            list = xmlParser.parse("ReferenceValues");
        } catch (Exception e) {

        }
        return list;
    }

    private static InputStream is;
}
