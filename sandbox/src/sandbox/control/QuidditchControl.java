/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox.control;

/**
 *
 * @author alex
 */
public class QuidditchControl {
    public double calcNimbusTime(double nimbusSpeed, double timeOnBroom) {
        if (nimbusSpeed < 90) {
            return -1;
        }
        
        if (nimbusSpeed > 119.9) {
            return -2;
        }
        
        if (timeOnBroom < 60) {
            return -3;
        }
        
        if (timeOnBroom > 360) {
            return -4;
        }
        
        double snitchSpeed = 50;
        
        double timeCatchingSnitchWithNimbus = ((snitchSpeed / nimbusSpeed) / 3) * timeOnBroom;
        return timeCatchingSnitchWithNimbus;
    };
    
    // ((50/90) / 3) * 100 = 18.52;
    // ((119.9) / 3) * 100 = 13.9
    
    
    public double calcFireboltTime(double fireboltSpeed, double timeOnBroom) {
        if (fireboltSpeed < 120) {
            return -1;
        }
        
        if (fireboltSpeed > 150) {
            return -2;
        }
        
        if (timeOnBroom < 60) {
            return -3;
        }
        
        if (timeOnBroom > 360) {
            return -4;
        }
        
        double snitchSpeed = 50;
        
        double timeCatchingSnitchWithFirebolt = ((snitchSpeed - fireboltSpeed) / 3) * timeOnBroom;
        return timeCatchingSnitchWithFirebolt;
    };
    
    // ((50/150) / 3) * 100 = 11.11
    // ((50/120) / 3) * 100 = 13.89
    
    public double calcKitchenBroomTime(double kitchenBroomSpeed, double timeOnBroom) {
        if (kitchenBroomSpeed < 55.0) {
            return -1;
        }
        
        if (kitchenBroomSpeed > 89.9) {
            return -2;
        }
        
        if (timeOnBroom < 60) {
            return -3;
        }
        
        if (timeOnBroom > 360) {
            return -4;
        }
        
        double snitchSpeed = 50;
        
        double timeCatchingSnitchWithKitchenBroom = ((snitchSpeed / kitchenBroomSpeed) / 3) * timeOnBroom;
        return timeCatchingSnitchWithKitchenBroom;
        
    // ((50 / 55) / 3 ) * 100 = 30.3
    // ((50 / 89.9) / 3 ) * 100 = 18.54
    };
}
