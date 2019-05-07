package Map;

import javax.security.auth.kerberos.KerberosKey;

/**
 * @auther: Li jx
 * @date: 2019/4/21 17:08
 * @description:
 */
public interface Map<K, V> {
    void add(K key, V value);
    V remove(K key);
    boolean contain(V key);
    V get(K key);
    void set(K key, V value);
    int getSize();
    boolean isEmpty();
}
