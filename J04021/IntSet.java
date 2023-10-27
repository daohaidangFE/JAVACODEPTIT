package J04021;

import java.util.TreeSet;

public class IntSet {
    private TreeSet<Integer> te; 
    private int [] a;

    public IntSet(int [] a) {
        this.a  = a;
        this.te = new TreeSet<>();
        for(int i = 0; i < a.length; i++) {
            te.add(a[i]);
        }
    }

    public IntSet(TreeSet<Integer> te) {
        this.te = new TreeSet(te);
    }

    public IntSet union(IntSet b) {
        this.te.addAll(b.te);
        return new IntSet(this.te);
    }

    @Override
    public String toString() {
        TreeSet<String> strs = new TreeSet<>();
        this.te.forEach(x-> strs.add(x.toString()));
        return String.join(" ", strs);
    }
}
