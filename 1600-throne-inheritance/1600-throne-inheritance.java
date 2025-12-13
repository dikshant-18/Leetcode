class ThroneInheritance {

    private String kingName;
    private Map<String, List<String>> children;
    private Set<String> dead;

    public ThroneInheritance(String kingName) {
        this.kingName = kingName;
        this.children = new HashMap<>();
        this.dead = new HashSet<>();
        children.put(kingName, new ArrayList<>());
    }

    public void birth(String parentName, String childName) {
        children.computeIfAbsent(parentName, k -> new ArrayList<>());
        children.putIfAbsent(childName, new ArrayList<>());
        children.get(parentName).add(childName);
    }

    public void death(String name) {
        dead.add(name);
    }

    public List<String> getInheritanceOrder() {
        List<String> order = new ArrayList<>();
        dfs(kingName, order);
        return order;
    }

    private void dfs(String name, List<String> order) {
        if (!dead.contains(name)) {
            order.add(name);
        }
        List<String> kids = children.get(name);
        if (kids == null) {
            return;
        }
        for (String child : kids) {
            dfs(child, order);
        }
    }
}