package ch.wir_entwickeln.melian.medialibrary.replication;

import org.jumpmind.symmetric.model.DataMetaData;
import org.jumpmind.symmetric.model.Node;
import org.jumpmind.symmetric.model.TriggerRouter;
import org.jumpmind.symmetric.route.AbstractDataRouter;
import org.jumpmind.symmetric.route.SimpleRouterContext;

import java.util.Map;
import java.util.Set;

/**
 * Created by staufferr on 16.11.2016.
 */
public class KidsMediaLibraryReplicationDataRouter extends AbstractDataRouter {
    public Set<String> routeToNodes(SimpleRouterContext simpleRouterContext, DataMetaData dataMetaData, Set<Node> nodes, boolean initialLoad, boolean initialLoadSelectUsed, TriggerRouter triggerRouter) {
        System.out.println("MARKER");

        final String tableName = dataMetaData.getTable().getName();
        final Map<String, String> dataMap = getDataMap(dataMetaData, null);

        //...

        //return toNodeIds(nodes, null); // Route to all linked nodes
        //return Collections.emptySet(); // Do not route to any node

        return null;
    }
}
