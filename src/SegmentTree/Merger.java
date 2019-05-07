package SegmentTree;

/**
 * className Merger
 * description Merger
 *
 * @author Li jx
 * @version 1.0
 * @date 2019/4/24 16:30
 */
public interface Merger<E> {
    E merge(E a, E b);
}
