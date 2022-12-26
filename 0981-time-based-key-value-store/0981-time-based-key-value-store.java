class TimeMap {

    
    Map<String, TreeMap<Integer, String>> map;
    private static final String val = "";
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        TreeMap<Integer, String> timeMap;
        if (map.containsKey(key)) {
            timeMap = map.get(key);
        } else {
            timeMap = new TreeMap<>();
            map.put(key, timeMap);
        }
        timeMap.put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        if (map.containsKey(key)){
            TreeMap<Integer, String> timeMap = map.get(key);
            Integer prevTime = timeMap.floorKey(timestamp);
            if(prevTime == null){
                return "";
            }else{
                return timeMap.get(prevTime);
            }
        }
        return val;
    }
}
/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
