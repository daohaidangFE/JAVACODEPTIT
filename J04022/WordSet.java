package J04022;

import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> t;
    private TreeSet<String> tmp;
    private String [] a;

    public WordSet(String a) {
        this.a = a.split(" ");
        this.t = new TreeSet<>();
        this.tmp = new TreeSet<>();
        for(String i: this.a) {
            t.add(i.toLowerCase());
            tmp.add(i.toLowerCase());
        }
        
    }

    public WordSet(TreeSet<String> m) {
        this.t = new TreeSet(m);
    }

    public WordSet union(WordSet b) {
        this.t.addAll(b.t);
        return new WordSet(this.t);
    }

    public WordSet intersection(WordSet b) {
        this.t = this.tmp;
        this.t.retainAll(b.t);
        return new WordSet(this.t);
    }

    @Override
    public String toString() {
        return String.join(" ", this.t);
    }
}
