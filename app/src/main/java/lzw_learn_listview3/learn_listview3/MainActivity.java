package lzw_learn_listview3.learn_listview3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private final static String Name = "name";
    private final static String Class = "class";
    private final static String StudentNumber = "studentNumber";
    private final static String Other = "other";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] name = {"张三", "李四", "王五", "郭二", "何大","刘六"};
        String[] class1 = {"1401班", "1402班", "1403班", "1404班", "1404班","1409班"};
        String[] studentNumber = {"2014011421", "2014011429", "2014011430", "2014011423", "2014011411","2014033652"};
        String[] others = {"1","2","3","4","5","6"};
        List<Map<String, Object>> items = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < name.length; i++) {
            Map<String, Object> item = new HashMap<String, Object>();
            item.put(Name, name[i]);
            item.put(Class, class1[i]);
            item.put(StudentNumber, studentNumber[i]);
            item.put(Other,others[i]);
            items.add(item);
        }

        SimpleAdapter adapter = new SimpleAdapter(this, items, R.layout.item, new String[]{Name, Class, StudentNumber,Other}, new int[]{R.id.nameText, R.id.classText, R.id.studentNumberText,R.id.otherText});

        ListView list = (ListView) findViewById(R.id.list);

        list.setAdapter(adapter);
    }
}
