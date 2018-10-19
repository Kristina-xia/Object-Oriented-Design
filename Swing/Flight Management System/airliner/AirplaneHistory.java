/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airliner;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author qingchunxia
 */
public class AirplaneHistory implements Serializable{
    private ArrayList<Airplane> airplaneHistory;
    
    public AirplaneHistory(){
        airplaneHistory= new ArrayList();
}
    public ArrayList<Airplane> getAirplaneHistory(){
        return airplaneHistory;
    }
    public void deleteValues(Airplane a){
          airplaneHistory.remove(a);
    }
}
