class TimeMap {
    HashMap<String, TreeMap<Integer, String>> timemap;

    public TimeMap() {
        this.timemap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        TreeMap<Integer, String> record = timemap.getOrDefault(key, new TreeMap<>());
        record.put(timestamp, value);
        this.timemap.put(key, record);
    }
    
    public String get(String key, int timestamp) {
        if(timemap.get(key) == null) return "";
        TreeMap<Integer, String> res = timemap.get(key);
        Integer searchKey = res.floorKey(timestamp);
        if(searchKey == null) return "";

        return res.getOrDefault(searchKey, "");
    }
}
