package lgd.cervezapp.ui.fragments;

import android.support.v4.app.Fragment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by florencia on 30/01/16.
 */
public class DrawerFragmentsBuilder {

    private static DrawerFragmentsBuilder instance;

    private Map<DrawerAction, FragmentBuilder> fragmentMap;

    private DrawerFragmentsBuilder(){

        fragmentMap = new HashMap<>();
        fragmentMap.put(DrawerAction.MAP_BAR, new FragmentBuilder() {
            public Fragment buildFragment() {
                return new MapBarsFragment();
            }
        });
    }

    public static DrawerFragmentsBuilder getInstance(){
        if(instance == null)
            instance = new DrawerFragmentsBuilder();

        return instance;
    }

    public Fragment getFragment(DrawerAction action){
        if (fragmentMap.containsKey(action))
            return fragmentMap.get(action).buildFragment();

        return null;
    }

    private interface FragmentBuilder {
        Fragment buildFragment();
    }

}
