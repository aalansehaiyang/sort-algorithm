package com.algorithm.bubbling;

import com.alibaba.fastjson.JSON;

/**
 * 冒泡排序
 * 
 * @author tom
 */

public class BubblingSort {

    /**
     * 方法实现
     */

    public static void sort(long[] sourceData) {
        if (sourceData == null) return;
        int size = sourceData.length;

        long _temp; // 临时中转
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sourceData[j] > sourceData[j + 1]) {
                    _temp = sourceData[j];
                    sourceData[j] = sourceData[j + 1];
                    sourceData[j + 1] = _temp;

                }
            }
        }

    }

    public static void main(String[] args) {
        long[] sourceData = { 1, 45, 3, 66, 35, 10, 198, 111, 23, 34, 59, 3, 15 };
        sort(sourceData);
        System.out.println(JSON.toJSONString(sourceData));
    }
}
