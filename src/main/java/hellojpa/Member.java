package hellojpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // Entity :Jpa 가 관리하는 객체
public class Member {

    @Id //pk 설정
    private Long id;
    private String name;

    // JPA가 동적으로 내부적 리플렉션을 쓰기떄문에 기본생성자가 필요하다
    public Member() {

    }

    public Member(Long id, String name) {
        this.id = id;
        this.name = name;
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
