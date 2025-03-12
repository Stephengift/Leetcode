class RandomizedSet {
    private HashMap<Integer, Integer> map;
    private ArrayList<Integer> list;
    private Random rand;
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        map.put(val, list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        //[10-0,20-1,30-2, 40-3]
        //[10,20,30,40]
        //20-1
        //40
        //[10,40,30]
        //{10-1,40-1,30-2,40-3}
        int index = map.get(val);
        int lastElement = list.get(list.size()-1);
        list.set(index,lastElement);
        map.put(lastElement,index);
        list.remove(list.size()-1);
        map.remove(val);
        return true;

    }
    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */