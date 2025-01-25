package Leet_Code_Problems;
import java.util.*;

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total_gas_cost = 0;
        int current_gas = 0;
        int current_cost = 0;
        int start_index = 0;
        

        for(int i=0;i<gas.length;i++){
            total_gas_cost += gas[i] - cost[i];
        }
        if(total_gas_cost < 0)  
            return -1;
        for(int i = 0;i<gas.length;i++){
            current_gas += gas[i] - cost[i];
            if(current_gas<0){
                current_gas = 0;
                start_index = i+1;
            }
        }
        return start_index;
    }

}
