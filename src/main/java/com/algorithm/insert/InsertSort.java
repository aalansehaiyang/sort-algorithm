package com.algorithm.insert;

import com.alibaba.fastjson.JSON;

/**
 * 插入排序
 * 
 * @author tom
 */
public class InsertSort {

    public static void sort(long[] sourceData) {
        if (sourceData == null) return;
        int size = sourceData.length;
        for (int i = 1; i < size; i++) {
            if (sourceData[i] < sourceData[i - 1]) {
                long _temp = sourceData[i];// 临时值空间
                int j = i - 1;
                while (j >= 0 && sourceData[j] > _temp) {
                    sourceData[j + 1] = sourceData[j];
                    j--;
                }
                sourceData[j + 1] = _temp;
            }

        }

    }

    public static void main(String[] args) {
        long[] sourceData = { 49, 38, 65, 97, 76, 13, 27, 49 };
        sort(sourceData);
        System.out.println(JSON.toJSONString(sourceData));
    }

}
