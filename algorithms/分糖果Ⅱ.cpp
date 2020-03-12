/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int *distributeCandies(int candies, int num_people, int *returnSize) {
    int *array = (int *) malloc(sizeof(int) * num_people);
    // 初始化数据
    for (int i = 0; i < num_people; i++) {
        array[i] = 0;
    }
    *returnSize = num_people;
    /* 填充数据 */
    // 当前单位应得的糖果数量
    int num = 1;
    // 当前给第几位小朋友糖果
    int index = 0;
    // 当剩余糖果数量大于0
    while (candies > 0) {
        // 判断是否需要返回第一位小朋友
        index = index % num_people;
        // 如果剩余糖果数量足够，直接分配
        if (candies >= num) {
            array[index] += num;
        } else {
            array[index] += candies;
        }
        candies -= num;
        index++;
        num++;
    }
    return array;
}