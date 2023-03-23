package WebCock.Project_Web.repository;

import WebCock.Project_Web.domain.Member;

import lombok.RequiredArgsConstructor;
import java.util.List;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(Member member) {
        em.persist(member);
    }

    public Member findOne(Long id) {
        return em.find(Member.class, id);
    }

    public List<Member> findAll() {
        return em.createQuery("select m from Member m", Member.class)
                .getResultList();
    }

    public List<Member> findByPhone(String member_phone) {
        return em.createQuery("select m from Member m where m.member_phone = :member_phone", Member.class)      // 파라미터 바인딩을 해서 특정 이름에 의한 회원만 찾는걸 구현
                .setParameter("member_phone", member_phone)
                .getResultList();
    }

}
