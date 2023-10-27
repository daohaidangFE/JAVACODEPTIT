package J07009;

import java.util.TreeSet;

public class IntSet {
    private TreeSet<Integer> x;
    private int [] a;

    public IntSet(int [] a) {
        this.a = a;
        this.x = new TreeSet<>();
        for(int i = 0; i < a.length; i++) {
            x.add(a[i]);
        }
    }

    public IntSet(TreeSet<Integer> m) {
        this.x = new TreeSet(m);
    }

    public IntSet intersection(IntSet b) {
        this.x.retainAll(b.x);
        return new IntSet(this.x);
    }

    @Override
    public String toString() {
        TreeSet<String> strs = new TreeSet<>();
        this.x.forEach(i-> strs.add(i.toString()));
        return String.join(" ", strs);
    }
}
