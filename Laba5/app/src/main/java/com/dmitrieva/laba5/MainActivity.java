package com.dmitrieva.laba5;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private List<String> items = new ArrayList<String>();
    private ListView listView;
    private ArrayAdapter<String> arrayAdapter;

    private EditText etField;
    private Button editButton;
    private Button delButton;

    private int selectedItemPosition = -1;
    private View selectedView;
    private int pinkColor;
    private int blueColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initListView();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        if (selectedItemPosition == -1) {
            selectedItemPosition = position;
            selectedView = view;
            etField.setText(arrayAdapter.getItem(position));
            view.setBackgroundColor(blueColor);
            setEnabledEditAndDeleteButtons(true);
            adapterView.setSelection(position);
        } else {
            if (selectedItemPosition == position) {
                selectedItemPosition = -1;
                view.setBackgroundColor(pinkColor);
                etField.setText("");
                setEnabledEditAndDeleteButtons(false);
            } else {
                selectedView.setBackgroundColor(pinkColor);
                selectedView = view;
                selectedItemPosition = position;
                etField.setText(items.get(position));
                view.setBackgroundColor(blueColor);
                setEnabledEditAndDeleteButtons(true);
            }
        }
    }

    public void btnAddClick(View view) {
        String str = etField.getText().toString();
        if (str.length() > 0) {
            items.add(str);
            arrayAdapter.notifyDataSetChanged();
            etField.setText("");
        }
    }

    public void btnEditClick(View view) {
        selectedView.setBackgroundColor(pinkColor);
        items.set(selectedItemPosition, etField.getText().toString());
        arrayAdapter.notifyDataSetChanged();
        etField.setText("");

        selectedItemPosition = -1;
        selectedView = null;

        setEnabledEditAndDeleteButtons(false);
    }

    public void btnDelClick(View view) {
        selectedView.setBackgroundColor(pinkColor);

        items.remove(selectedItemPosition);
        arrayAdapter.notifyDataSetChanged();
        etField.setText("");

        selectedItemPosition = -1;
        selectedView = null;

        setEnabledEditAndDeleteButtons(false);
    }

    public void btnClearClick(View view) {
        items.clear();
        arrayAdapter.notifyDataSetChanged();
        setEnabledEditAndDeleteButtons(false);
    }

    private void init() {
        etField = findViewById(R.id.etField);
        editButton = findViewById(R.id.btnEdit);
        delButton = findViewById(R.id.btnDel);

        pinkColor = getResources().getColor(R.color.pink);
        blueColor = getResources().getColor(R.color.blue);
        setEnabledEditAndDeleteButtons(false);
    }

    private void initListView() {
        items.add("1");
        items.add("2");
        items.add("3");

        listView = findViewById(R.id.listView);
        arrayAdapter = new ArrayAdapter<String>(this, R.layout.list_item, items);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);
    }

    private void setEnabledEditAndDeleteButtons(boolean isEnabled) {
        editButton.setEnabled(isEnabled);
        delButton.setEnabled(isEnabled);
    }

}