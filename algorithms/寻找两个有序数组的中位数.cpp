void quickSortFunction(int *array, int left, int right);

void quickSort(int *array, int size);

double findMedianSortedArrays(int *nums1, int nums1Size, int *nums2, int nums2Size) {
    int total = nums1Size + nums2Size;
    int *array = (int *) malloc(sizeof(int) * total);
    int index = 0;
    for(int i = 0;i < nums1Size;i++){
        array[index++] = nums1[i];
    }
    for(int i = 0;i < nums2Size;i++){
        array[index++] = nums2[i];
    }
    quickSort(array, total);
    if (total % 2 == 0) {
        int t = total / 2;
        double num = array[t] + array[t - 1];
        return num / 2;
    } else {
        return array[total / 2];
    }
}

/**
 * 快速排序实现函数
 * @param array 排序数组
 * @param left 左边界
 * @param right 右边界
 */
void quickSortFunction(int *array, int left, int right) {
    if (left > right) {
        return;
    }
    //设定基准数
    int temp = array[left];
    //设置哨兵
    int i = left;
    int j = right;
    while (i != j) {
        //顺序很重要，要想从右往左找
        while (array[j] >= temp && i < j) {
            j--;
        }
        //再从左往右找
        while (array[i] <= temp && i < j) {
            i++;
        }
        //交换两个哨兵在数组中的位置
        //两个哨兵没有相遇
        if (i < j) {
            int t = array[i];
            array[i] = array[j];
            array[j] = t;
        }
    }
    //最终将基准数归位
    array[left] = array[i];
    array[i] = temp;
    //继续处理左边的，这是一个递归的过程
    quickSortFunction(array, left, i - 1);
    //继续处理右边的，这是一个递归的过程
    quickSortFunction(array, i + 1, right);
}

/**
 * 快速排序调用函数
 * @param array 排序数组
 * @param size 数组大小
 */
void quickSort(int *array, int size) {
    quickSortFunction(array, 0, size - 1);
}