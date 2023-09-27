/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thang
 */
public class SpecRobot extends Robot{
    private int step;

    public SpecRobot() {
    }

    public SpecRobot(int step) {
        this.step = step;
    }

    public SpecRobot(int step, String label, int type) {
        super(label, type);
        this.step = step;
    }

    @Override
    public String toString() {
        return getLabel()+", "+getType()+", "+step;
    }
    
//    @Override
    public void setData(){
        setLabel(getLabel().substring(0, 1)+step+getLabel().substring(1));
        System.out.println(getLabel()+", "+ getType());
    }
    
    public int getValue(){
        if (getLabel().contains("A") && getType()<3) return step;
        else return step + 2;
    }
    
    
}
