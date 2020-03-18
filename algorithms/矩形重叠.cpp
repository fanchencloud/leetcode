/**
 * 矩形以列表 [x1, y1, x2, y2]
 */
bool isRectangleOverlap(int* rec1, int rec1Size, int* rec2, int rec2Size){
    bool flag = true;
    // 矩形 rec1 在矩形 rec2 的左侧；
    if(rec1[3] <= rec2[1]){
        flag = false;
    }
    // 矩形 rec1 在矩形 rec2 的右侧；
    if(rec1[1] >= rec2[3]){
        flag = false;
    }
    // 矩形 rec1 在矩形 rec2 的上方；
    if(rec1[0] >= rec2[2]){
        flag = false;
    }
    // 矩形 rec1 在矩形 rec2 的下方
    if(rec1[2] <= rec2[0]){
        flag = false;
    }
    return flag;
}