package hellojpa;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity // Entity :Jpa 가 관리하는 객체

public class Member {

    @Id //pk 설정
    private Long id;

    @Column(name = "name")
    private String name;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    // 날짜 + 시간 다 포함된 매핑
/*
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
*/

    private LocalDate testLocalDate;
    private LocalDateTime testLocalDateTime;


    @Lob
    private String description;

    // JPA가 동적으로 내부적 리플렉션을 쓰기떄문에 기본생성자가 필요하다
    public Member() {

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


