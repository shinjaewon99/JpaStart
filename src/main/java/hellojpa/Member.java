package hellojpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // Entity :Jpa 가 관리하는 객체
public class Member {

    @Id //pk 설정
    private Long id;
    private String name;

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
