public class MapUsingHash {
    private Entity[] entities;

    public MapUsingHash(){
        entities = new Entity[100];
    }

    public class Entity{
        String key;
        String value;

        Entity(String key,String value){
            this.key = key;
            this.value = value;
        }
    }

    public void put(String key,String value){
        int hash = Math.abs(key.hashCode()%entities.length);
        entities[hash] = new Entity(key ,value);
    }

    public String get(String key){
        int hash = Math.abs(key.hashCode()%entities.length);
        if(entities[hash]!=null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key){
        int hash = Math.abs(key.hashCode()% entities.length);
        if(entities[hash]!=null && entities[hash].key.equals(key)){
            entities[hash] = null;
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        MapUsingHash map = new MapUsingHash();
        map.put("Mango","Summer fruit");
        map.put("Guava","Winter Fruit");
        map.put("Banana","Evergreen fruit");

        System.out.println(map.get("Mango"));
    }
}