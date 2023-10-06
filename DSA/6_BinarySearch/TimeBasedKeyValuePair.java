import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TimeBasedKeyValuePair {

    static class Pair<V, T> {
        V value;
        T timestamp;

        public Pair(V value, T timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
    }

    HashMap<String, List<Pair<String, Integer>>> map;

    public TimeBasedKeyValuePair() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        Pair<String, Integer> pair = new Pair<>(value, timestamp);

        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }

        map.get(key).add(pair);
    }

    public String get(String key, int timestamp) {

        if (map.containsKey(key)) {

            List<Pair<String, Integer>> list = map.get(key);

            int left = 0, right = list.size() - 1;
            String midValue = "";

            if (list.get(left).timestamp > timestamp)
                return "";

            if (list.get(right).timestamp < timestamp)
                return list.get(right).value;

            while (left <= right) {

                int mid = (left + right) / 2;
                int midTimestamp = list.get(mid).timestamp;

                if (midTimestamp == timestamp)
                    return list.get(mid).value;
                else if (midTimestamp < timestamp) {
                    midValue = list.get(mid).value;
                    left = mid + 1;
                } else
                    right = mid - 1;

            }

            return midValue;

        }

        return "";
    }

    public static void main(String[] args) {

    }
}