package class0814;

import java.util.Comparator;

/**
 * 用外部比较器来进行排序
 */
public class StuNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1 != null && o2 != null){
            if (o1.getName().compareTo(o2.getName()) > 0) {
                return 1 ;
            }else if (o1.getName().compareTo(o2.getName()) < 0){
                return -1 ;
            }

        }else {
            new RuntimeException("对象不能为空!!") ;
        }
        return 0;
    }
}
