package io.github.oliviercailloux.y2018.jbiblio.j_biblio.services;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.transaction.Transactional;

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

	@Transactional
	public void persist(Work work) {

		em.persist(work);

	}

}
