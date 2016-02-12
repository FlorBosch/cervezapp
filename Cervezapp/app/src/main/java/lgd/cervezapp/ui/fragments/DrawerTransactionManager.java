package lgd.cervezapp.ui.fragments;

import java.util.HashMap;
import java.util.Map;

import lgd.cervezapp.ui.activities.MapBarsActivity;
import lgd.cervezapp.ui.activities.listeners.Transactional;

/**
 * Created by florencia on 30/01/16.
 */
public class DrawerTransactionManager {

    private static DrawerTransactionManager instance;

    private Map<DrawerAction, TransactionManager> transactionMap;

    private DrawerTransactionManager(){

        transactionMap = new HashMap<>();
        transactionMap.put(DrawerAction.MAP_BAR, new TransactionManager() {
            public void beginTransaction(Transactional transactional) {
                transactional.startActivity(MapBarsActivity.class);
            }
        });
    }

    public static DrawerTransactionManager getInstance(){
        if(instance == null)
            instance = new DrawerTransactionManager();

        return instance;
    }

    public void startTransaction(DrawerAction action, Transactional transactional){
        if (transactionMap.containsKey(action))
            transactionMap.get(action).beginTransaction(transactional);
    }

    private interface TransactionManager {
        void beginTransaction(Transactional transactional);
    }

}
