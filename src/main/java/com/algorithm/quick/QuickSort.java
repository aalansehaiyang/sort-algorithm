package com.algorithm.quick;

import com.alibaba.fastjson.JSON;

/**
 * 快速排序
 * 
 * @author tom
 */
public class QuickSort {

    /**
     * 一次比较（以中间元素为间隔，小的在左边，大的在右边）
     */
    public static int partition(long a[], int low, int high) {
        long privotKey = a[low];// 比较元素，选择区间最小标号那个
        while (low < high) {
            // 1. 先从最右边开始比较
            while (low < high && a[high] >= privotKey) {
                high--;
            }
            // 换位置
            Long _temp;
            _temp = a[low];
            a[low] = a[high];
            a[high] = _temp;

            // 2. 然后再从左边开始比较
            while (low < high && a[low] <= privotKey) {
                low++;
            }
            // 换位置
            _temp = a[low];
            a[low] = a[high];
            a[high] = _temp;

        }
        // 返回中间分隔线元素
        return low;

    }

    public static void sort(long[] sourceData, int low, int high) {
        if (low < high) {
            // 一次排序，得到中间分隔点
            int middle = partition(sourceData, low, high);
            // 左侧较小元素集排序
            sort(sourceData, low, middle - 1);
            // 右侧较大元素集排序
            sort(sourceData, middle + 1, high);
        }

    }

    public static void main(String[] args) {
        long[] sourceData = { 3, 1, 5, 7, 2, 4, 9, 6, 10, 8 };
        sort(sourceData, 0, sourceData.length - 1);
        System.out.println(JSON.toJSONString(sourceData));
    }
}
