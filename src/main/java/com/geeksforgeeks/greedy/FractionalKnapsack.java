package com.geeksforgeeks.greedy;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

/**
 * FractionalKnapsack
 * https://www.geeksforgeeks.org/fractional-knapsack-problem/
 * https://www.youtube.com/watch?v=m1p-eWxrt6g
 * Greedy
 */
@Slf4j
public class FractionalKnapsack {
    /**
     * Time Complexity : O(n lg n)
     * <p>
     * Algorithm :
     * - ratio(_value/weight)을 계산하고 가장 놓은 값을 먼저 넣음
     * - item을 whole로 넣을 수 없는 경우, fractional으로 나눠서 넣자
     */
    public double getMaxValue(int[] values, int[] weights, int W) {
        Map<Integer, Double> indexRatioValue = new HashMap<>();
        double ratio;

        for (int i = 0; i < values.length; i++) {
            ratio = (double) values[i] / weights[i];
            log.info("{} / {} = {}", values[i], weights[i], ratio);
            indexRatioValue.put(i, ratio);
        }

        //ratio 값으로 정렬함
        Map<Integer, Double> sortedRatioValue = indexRatioValue.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Double>comparingByValue().reversed())
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        log.info("sortedRatioValue : {}", sortedRatioValue);

        int leftWeight = W;
        int maxValue = 0;
        Double ratioValue;

        for (Integer index : sortedRatioValue.keySet()) {
            ratioValue = sortedRatioValue.get(index);
            log.info("{} -> {}", index, ratioValue);

            if (leftWeight >= weights[index]) {
                maxValue += values[index];
                leftWeight -= weights[index];
                log.info("maxValue : {} leftWeight : {}", maxValue, leftWeight);
            } else {
                //fractional
                Double fractionalValue = (double) values[index] * leftWeight / weights[index];
                maxValue += fractionalValue;
                break;
            }
        }
        return maxValue;
    }

    /**
     * geeks solution
     */
    public static double getMaxValue2(int[] wt,
                                      int[] val, int capacity) {
        ItemValue[] iVal = new ItemValue[wt.length];

        for (int i = 0; i < wt.length; i++) {
            iVal[i] = new ItemValue(wt[i], val[i], i);
        }

        //sorting items by value;
        Arrays.sort(iVal, (o1, o2) -> o2.cost.compareTo(o1.cost));

        double totalValue = 0d;

        for (ItemValue i : iVal) {

            int curWt = (int) i.wt;
            int curVal = (int) i.val;

            if (capacity - curWt >= 0) {
                // this weight can be picked while
                capacity = capacity - curWt;
                totalValue += curVal;

            } else {
                // item cant be picked whole
                double fraction = ((double) capacity / (double) curWt);
                totalValue += (curVal * fraction);
                capacity = (int) (capacity - (curWt * fraction));
                break;
            }


        }

        return totalValue;
    }

    // item value class
    static class ItemValue {
        Double cost;
        double wt, val, ind;

        // item value function
        public ItemValue(int wt, int val, int ind) {
            this.wt = wt;
            this.val = val;
            this.ind = ind;
            cost = new Double(val / wt);
        }
    }
}
