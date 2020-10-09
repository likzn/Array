package 消费者生产者;

import java.util.List;

/**
 * @author: Li jx
 * @date: 2019/10/1 16:53
 * @description:
 */
public class Data {
    private Long id;
    private String name;

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
