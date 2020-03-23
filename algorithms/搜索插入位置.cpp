/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。你可以假设数组中无重复元素。
 * @param nums
 * @param numsSize
 * @param target
 * @return
 */
int searchInsert(int *nums, int numsSize, int target)
{
    int left = 0;
    int right = numsSize - 1;
    // 首先处理插入数据比数组左端小
    if (nums[left] >= target)
    {
        return 0;
    }
    // 处理插入数据和右端相等
    if (nums[right] == target)
    {
        return right;
    }
    // 右端数据比插入数据小
    if (nums[right] < target)
    {
        return numsSize;
    }
    // 插入位置在数组中间
    while (left < right)
    {
        int mid = (left + right) >> 1;
        // 严格小于 target 的元素一定不是解
        if (nums[mid] < target)
        {
            // 下一轮搜索区间是 [mid + 1, right]
            left = mid + 1;
        }
        else
        {
            right = mid;
        }
    }
    return left;
}