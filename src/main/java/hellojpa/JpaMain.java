package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        // META-INF에서 정의한 Name = hello를 팩토리에 넣어준다.
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        // 쓰레드 간에 공유X 사용하고 close해줘야된다.
        EntityManager em = emf.createEntityManager();

        // 데이터 베이스 커넥션을 받아야된다 "Transaction을 통해
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try{

            // 객체만 생성 비영속 상태
            Member member = new Member(1L, "신재원");

            member.setName("AAAAA");

            // 지금 부터는 영속 상태(DB에는 저장 X)
            em.persist(member);

            /* 준영속 상태 = 엔티티를 영속성 컨텍스트에서 분리
            em.detach(member);
            */

            /* 객체를 삭제
            em.remove(member);
            * */

            /*
            수정
            기본에 있는 데이터를 밀고 새로운걸 저장한다.
            persist로 저장을 안해도됨
            findMember.setName("helloJpa");
           */
            /*
            삭제
            em.remove(찾은 DB를 넣어준다);
        
            저장
            Member member = new Member();
            member.setId(1L);
            member.setName("helloA");
            em.persist(member);
            */
            
            // DB에 저장
            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }

        emf.close();
    }
}
