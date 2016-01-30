package lgd.cervezapp.ui.adapters.entities;

import lgd.cervezapp.ui.fragments.DrawerAction;

/**
 * Created by florencia on 27/01/16.
 */
public class DrawerItem {

    private String name;
    private int iconId;
    private DrawerAction action;

    public DrawerItem(String name, int iconId, DrawerAction action) {
        this.name = name;
        this.iconId = iconId;
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public DrawerAction getAction() {
        return action;
    }

    public void setAction(DrawerAction action) {
        this.action = action;
    }
}
