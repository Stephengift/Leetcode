class TimeMap {
    private Map<String, List<Pair>> keyMap;
    //pair class for readability
    private static class Pair{
        int timestamp;
        String value;
        Pair(int timestamp, String value){
            this.timestamp = timestamp;
            this.value = value;
        }
        //getters to use for the get function
        public int getTimestamp(){
            return timestamp;
        }
        public String getValue(){
            return value;
        }
    }
    public TimeMap() {
        keyMap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        // Initialize a new list if key does not exist
        keyMap.putIfAbsent(key, new ArrayList<>());
        keyMap.get(key).add(new Pair(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        List<Pair> values = keyMap.get(key);
        if(values == null){
            return "";
        }
        int left = 0;
        int right = values.size() -1;
        String result = "";
        while(left <= right){
            int middle = left + (right-left)/2;
            if(values.get(middle).getTimestamp() <= timestamp){
                result = values.get(middle).getValue();
                left = middle + 1;
            }else{
                right = middle -1;
            }
        }
        return result;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */