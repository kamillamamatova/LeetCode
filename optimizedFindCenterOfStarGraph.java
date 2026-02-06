class Solution {
    public int findCenter(int[][] edges) {
        // If the first node in the first edge
        // matches the first or second node in the second edge
        // then the center is the first node in the first edge
        if(edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]){
            return edges[0][0];
        }
        // Otherwise, it's the second node in the first end
        else{
            return edges[0][1];
        }

        /*
        Since this is a star graph, the center edge WILL appear in the first 2
        edges
        */

        /*int center = 0;

        // Will keep track of they edges and their frequencies
        HashMap<Integer, Integer> edgesMap = new HashMap<>();
        
        for(int u = 0; u < edges.length; u++){
            // Puts the key and it's frequency into the HashMap
            edgesMap.put(edges[u][0], edgesMap.getOrDefault((edges[u][0]), 0) + 1);
            // It's == edges.length because n = nodes, n - 1 nodes is how many edges
            // there are, there are 1 less edges than there are nodes
            if(edgesMap.get(edges[u][0]) == edges.length){
                center = edges[u][0];
                return center;
            }

            // Looks at the v in [u, v] if the center edge wasn't found while
            // looking at u in [u, v]
            edgesMap.put(edges[u][1], edgesMap.getOrDefault((edges[u][1]), 0) + 1);

            if(edgesMap.get(edges[u][1]) == edges.length){
                center = edges[u][1];
                return center;
            }
        }

        return center;

        /*
        - Undirected star graph consisting
        of n nodes labeled from 1 to n
        - 1 center node & exactly n - 1 edges
        that connect the center node w/ every
        other node
        - Given: 2D int array edges
            - edges[i] = [ui, vi]
                - Indicates that there is an
                edge between the nodes ui & vi
        - Return: center of the given star
        graph

        So I was wrong, a 2D int array isn't 
        a row x column
        well I guess it could be
        but u in this: edges[u][v]
        is which edge connection I'm looking at,
        but the v is the index in that edge
        connection
        */
    }
}
