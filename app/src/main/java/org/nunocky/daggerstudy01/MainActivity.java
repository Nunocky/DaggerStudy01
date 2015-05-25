package org.nunocky.daggerstudy01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.nunocky.daggerstudy01.debugger.Debugger;

import javax.inject.Inject;

import dagger.ObjectGraph;


public class MainActivity extends AppCompatActivity {
    @Inject
    Debugger debugger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ObjectGraph objectGraph = ObjectGraph.create(new DebuggerModule(this));
        objectGraph.inject(this);
        debugger.show("Hello!");
    }

}
