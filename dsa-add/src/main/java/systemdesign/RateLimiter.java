package systemdesign;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RateLimiter {
    public static void main(String[] args) {
     Map<Integer,User> map = new ConcurrentHashMap<>();
     int counter=1; User user = null;int id=1;
     for(int i=0;i<100;i++){
         if (map.containsKey(id)) {
             user = map.get(id); // Fetch existing user
             user.setFrequency(user.getFrequency() + 1); // increment frequency
             map.put(id, user); // update
         }
         else {
             user = new User(id, System.currentTimeMillis(), counter);
             map.put(id, user);
         }
      }
    }
}

class User{

    private int userId;
    private Long lastLoginTime;
    private Integer frequency;

    User(int userId, Long lastLoginTime, Integer frequency) {
        this.userId = userId;
        this.lastLoginTime = lastLoginTime;
        this.frequency = frequency;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Long getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Long lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

}
