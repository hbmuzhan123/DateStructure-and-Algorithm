public class List {
    final static int MaxSize = 100;
    private int size;
    private int[] num = new int[MaxSize];

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List() {
        this.size=0;
    }

    // 返回线性表长度
    public int length() {
        return this.size;
    }

    // 判断线性表是否为空
    public boolean isEmpty() {
        if (this.size == 0)
            return true;
        return false;
    }

    public void insertList(List list, int loc, int n) {
//        // 判断是否为空
//        if (list.isEmpty()) {
//            throw new RuntimeException("List empty exception");
//        }  空表是允许插入的
        // 判断插入位置是否正确
        if (loc > list.size || loc < 0) {
            throw new RuntimeException("List location_error exception");
        }
        // 遍历插入
        for (int i = list.size-1; i > loc; i--) {
            list.num[i] = list.num[i - 1];
        }
        list.num[loc] = n;
        list.size++;
    }

    public void deletList(List list, int loc) throws RuntimeException{
        // 判断是否为空
        if (list.isEmpty()) {
            throw new RuntimeException("List empty exception");
        }
        // 判断插入位置是否正确
        if (loc >list.size-1 || loc < 0) {
            throw new RuntimeException("List location_error exception");
        }
        for (int i = loc; i < list.size - 1; i++) {
            list.num[i] = list.num[i + 1];
        }
        list.size--;
    }

    public int getListEle(List list, int loc) {
        // 判断是否为空
        if (list.isEmpty()) {
            throw new RuntimeException("List empty exception");
        }
        // 判断插入位置是否正确
        if (loc >= list.size || loc < 0) {
            throw new RuntimeException("List location_error exception");
        }
        return list.num[loc];
    }
}
