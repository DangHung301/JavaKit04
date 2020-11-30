/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai9;

/**
 *
 * @author hp
 */
public class Number {
//     value, min, max 
    private int value;
    private int min;
    private int max;

    public Number(int value, int min, int max) {
        this.value = value;
        this.min = 100;
        this.max = 0;
    }
    
    public boolean kiemTraSoNguyenTo(){
        if(value <= 1){
            return false;
        }
        else{
            for(int i = 2 ; i < value ; i++){
            if(value % i == 0){
                return false;
            }
        }
        return true;
        }
    }

    @Override
    public String toString() {
        return "Number{" + "value=" + value + '}';
    }
    
    

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
    
}

