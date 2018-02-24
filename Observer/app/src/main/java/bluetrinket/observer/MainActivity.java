package bluetrinket.observer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnItemSelectedListener {
    private ListView list;
    private ArrayAdapter<String> adapter;
    private Spinner roleDropdown;
    private Spinner teamDropdown;
    private SearchController searchCtrl;
    private List<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.listView);
        roleDropdown = findViewById(R.id.spinner1);
        teamDropdown = findViewById(R.id.spinner2);

        String[] roles = new String[]{"None", "Top", "Jungle", "Mid", "ADC", "Support", "Unknown"};
        String[] teams = new String[]{"None", "C9", "TSM", "CLG"};

        DatabaseManager db = new DatabaseManager(this);
        searchCtrl = new SearchController(db);


        arrayList = db.getAllPlayerRawData();
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        list.setAdapter(adapter);

        String roleSelection = "None";
        String teamSelection = "None";

        ArrayAdapter<String> roleAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, roles);
        roleDropdown.setAdapter(roleAdapter);
        roleDropdown.setOnItemSelectedListener(this);

        ArrayAdapter<String> teamAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, teams);
        teamDropdown.setAdapter(teamAdapter);
        teamDropdown.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {
        String role = roleDropdown.getSelectedItem().toString();
        String team = teamDropdown.getSelectedItem().toString();

        adapter.clear();
        adapter.addAll(searchCtrl.lookup(new String[]{role, team}));
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        //yolo
    }

}
