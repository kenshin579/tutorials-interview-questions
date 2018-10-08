package com.google;

import java.util.Collection;
import java.util.HashSet;

public class InstrumentSet extends HashSet {
    private int addCount = 0;

    public boolean add(Object o) {
        addCount++;
        return super.add(o);
    }

    public boolean addAll(Collection c) {
        addCount += c.size();
        return super.addAll(c); //내부적으로 add를 호출하고 내부 코드에 의해서 size를 increment함 - size가 잘못되게 됨
    }

    public int getAddCount() {
        return addCount;
    }
}
