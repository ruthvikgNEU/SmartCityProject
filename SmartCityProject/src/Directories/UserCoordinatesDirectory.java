
package Directories;

import java.util.ArrayList;
import model.UserCoordinates;


public class UserCoordinatesDirectory {
    ArrayList<UserCoordinates> list;
    
   public UserCoordinatesDirectory(){
      this.list = new ArrayList<>();
   }

    public ArrayList<UserCoordinates> getList() {
        return list;
    }

    public void setList(ArrayList<UserCoordinates> list) {
        this.list = list;
    }
    public UserCoordinates addNew(){
     UserCoordinates temp = new UserCoordinates();
     list.add(temp);
     return temp;
    }
   
}
