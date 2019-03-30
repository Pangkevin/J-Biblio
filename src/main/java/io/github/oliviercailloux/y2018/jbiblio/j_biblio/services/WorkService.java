package io.github.oliviercailloux.y2018.jbiblio.j_biblio.services;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.apache.commons.lang3.StringUtils;

import io.github.oliviercailloux.y2018.jbiblio.j_biblio.basicentities.work.Work;

@RequestScoped
public class WorkService {
	@PersistenceContext
	private EntityManager em;

	@Inject
	private QueryHelper helper;

	@Transactional
	public List<Work> getAll() {
		return em.createQuery(helper.selectAll(Work.class)).getResultList();

	}

	@Transactional
	public Work findById(int id) {
		return em.find(Work.class, id);
	}

	public List<Work> findByField(String formOfWorkValue, String contextForTheWorkValue) {
		final CriteriaBuilder cb = em.getCriteriaBuilder();
		final CriteriaQuery<Work> cq = cb.createQuery(Work.class);
		final Root<Work> e = cq.from(Work.class);
		if (!StringUtils.isBlank(formOfWorkValue)) {
			cq.where(cb.like(e.get("formOfWork"), formOfWorkValue));
		}
		if (!StringUtils.isBlank(contextForTheWorkValue)) {
			cq.where(cb.like(e.get("contextForTheWork"), contextForTheWorkValue));
		}

		return em.createQuery(cq).getResultList();

	}

	@Transactional
	public void persist(Work work) {

		em.persist(work);

	}

}
