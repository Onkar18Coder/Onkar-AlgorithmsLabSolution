package com.lab2.practice2;

public class MergeSortAlgorithm {
    public void MergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right)/2;
            MergeSort(array, left, mid);
            MergeSort(array, mid+1,right);
            Merge( array, left, mid, right);
        }
    }

    void Merge(int[] array, int left, int mid, int right) {
        int n1 = mid-left+1;
        int n2 = right-mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temp arrays
        for (int i=0; i<n1; ++i)
            leftArray[i] = array[left+i];

        for (int j=0; j<n2; ++j)
            rightArray[j] = array[mid+1+j];

        // Merge temp arrays
        int i=0, j=0;
        int k = left;

        while(i<n1 && j<n2) {
            if (leftArray[i] <= rightArray[j])
                array[k++] = leftArray[i++];
            else
                array[k++] = rightArray[j++];
        }

        // Copy remaining elements of arrays
        while(i<n1)
            array[k++] = leftArray[i++];

        while (j<n2)
            array[k++] = rightArray[j++];
    }
}