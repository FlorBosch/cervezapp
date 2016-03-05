package lgd.cervezapp.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import lgd.cervezapp.R;
import lgd.cervezapp.ui.adapters.entities.DrawerItem;
import lgd.cervezapp.ui.fragments.DrawerAction;
import lgd.cervezapp.utils.StringUtils;

/**
 * Created by florencia on 27/01/16.
 */
public class DrawerAdapter extends ArrayAdapter<DrawerItem> {

    List<DrawerItem> drawerItems;
    Context context;

    public DrawerAdapter(Context context) {
        super(context, R.layout.drawer_list_item);
        this.context = context;

        this.drawerItems = getDrawerItems();
        addAll(this.drawerItems);
    }



    private List<DrawerItem> getDrawerItems(){
        List<DrawerItem> items = new ArrayList<>();

        addItem(items, R.string.drawer_bar_map, R.drawable.ic_map, DrawerAction.MAP_BAR);

        return items;
    }

    private void addItem(List<DrawerItem> items, int resourceText, int resourceIcon, DrawerAction action){

        items.add(new DrawerItem(
                StringUtils.getStringFromResource(context, resourceText),
                resourceIcon,
                action)
        );
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater)parent.getContext().
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.drawer_list_item, null);
        }

        ImageView icon = (ImageView) convertView.findViewById(R.id.drawer_item_icon);
        TextView name = (TextView) convertView.findViewById(R.id.drawer_item_name);

        DrawerItem item = getItem(position);
        icon.setImageResource(item.getIconId());
        name.setText(item.getName());

        return convertView;
    }
}
