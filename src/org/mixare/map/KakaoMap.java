package org.mixare.map;

/**
 * Created by nazunamoe on 2017-10-01.
 */

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;

import android.view.Menu;
import android.view.MenuItem;
import com.actionbarsherlock.view.SubMenu;

import net.daum.android.map.MapView;
import net.daum.android.map.MapActivity;
import net.daum.android.map.MapBuildSettings;
import net.daum.android.map.MapController;
import net.daum.mf.map.api.MapLayout;
import net.daum.mf.map.api.MapPoint;


import org.mixare.R;

public class KakaoMap extends MapActivity{

    /* Menu ID's */
    // Center my Position
    private static final int MENU_CENTER_POSITION_ID = Menu.FIRST;
    // Whether to display Satellite or Map
    private static final int MENU_CHANGE_MODE_ID = Menu.FIRST + 1;
    // Go to MixListView
    private static final int MENU_LIST_VIEW = Menu.FIRST + 2;
    // Go to AugmentedView
    private static final int MENU_CAMERA_VIEW = Menu.FIRST + 3;
    // Toggle show Path
    private static final int MENU_SHOW_PATH = Menu.FIRST + 4;

    MapView mapView = new MapView(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ViewGroup mapViewContainer = (ViewGroup) findViewById(R.id.map_view);
        mapViewContainer.addView(mapView);
        mapView.setClickable(true);
        mapView.setEnabled(true);
        mapView.setFocusable(true);
    }

    public MapView getMapView() {
        return mapView;
    }


    public boolean onCreateOptionsMenu(Menu menu) {
		/* define the first */
        int base = Menu.FIRST;
        menu.add(0,MENU_CENTER_POSITION_ID,Menu.NONE,"Debug 1");
        menu.add(0,MENU_CHANGE_MODE_ID,Menu.NONE,"Debug 2");
        menu.add(0,MENU_LIST_VIEW,Menu.NONE,"Debug 3");
        menu.add(0,MENU_CAMERA_VIEW,Menu.NONE,"Debug 4");
        menu.add(0,MENU_SHOW_PATH,Menu.NONE,"Debug 5");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        return true;
    }

}
