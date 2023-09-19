package task_4_1;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getId()- o2.getId();
    }

    public int compareRating(T o1, T o2) {
        return o1.getRating()- o2.getRating();
    }
}
